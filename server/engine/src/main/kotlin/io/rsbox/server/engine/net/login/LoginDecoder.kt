package io.rsbox.server.engine.net.login

import io.netty.buffer.ByteBuf
import io.netty.buffer.Unpooled
import io.rsbox.server.common.inject
import io.rsbox.server.config.ServerConfig
import io.rsbox.server.engine.net.Session
import io.rsbox.server.engine.net.StatusResponse
import io.rsbox.server.util.buffer.readJagString
import io.rsbox.server.util.buffer.readString
import io.rsbox.server.util.security.RSA
import io.rsbox.server.util.security.Xtea
import java.math.BigInteger

class LoginDecoder(private val session: Session) {

    private val rsa: RSA by inject()

    private var stage = Stage.HANDSHAKE
    private var payloadSize = 0
    private var retries = 0
    private var reconnecting = false

    fun decode(buf: ByteBuf, out: MutableList<Any>) {
        try {
            when(stage) {
                Stage.HANDSHAKE -> readHandshake(buf, out)
                Stage.HEADER -> readHeader(buf, out)
                Stage.PAYLOAD -> readPayload(buf, out)
            }
        } catch(e: LoginError) {
            stage = Stage.HANDSHAKE
            buf.readBytes(buf.readableBytes())
            session.writeAndClose(e.status)
            return
        }
    }

    private fun readHandshake(buf: ByteBuf, out: MutableList<Any>) {
        reconnecting = buf.readUnsignedByte().toInt() == LOGIN_RECONNECT
        stage = Stage.HEADER
    }

    private fun readHeader(buf: ByteBuf, out: MutableList<Any>) {
        payloadSize = buf.readUnsignedShort()
        if(payloadSize == 0) {
            throw LoginError(StatusResponse.COULD_NOT_COMPLETE_LOGIN)
        }

        retries = 0
        stage = Stage.PAYLOAD
    }

    private fun readPayload(buf: ByteBuf, out: MutableList<Any>) {
        val clientRevision = buf.readInt()
        if(clientRevision != ServerConfig.REVISION) {
            throw LoginError(StatusResponse.OUT_OF_DATE)
        }

        buf.skipBytes(Int.SIZE_BYTES)
        val clientType = buf.readUnsignedByte().toInt()
        val platformType = buf.readUnsignedByte().toInt()
        buf.skipBytes(Byte.SIZE_BYTES)

        val rsaBuf = run {
            val length = buf.readUnsignedShort()
            buf.decryptRsa(rsa.exponent, rsa.modulus, length)
        }

        val payload = ByteArray(buf.readableBytes())
        buf.readBytes(payload)

        /*
         * === RSA BUFFER DECODE ===
         */

        val decryptCheck = rsaBuf.readByte().toInt()
        if(decryptCheck != 1) {
            throw LoginError(StatusResponse.BAD_SESSION_ID)
        }

        val xteas = IntArray(4) { rsaBuf.readInt() }
        val seed = rsaBuf.readLong()

        if(seed != session.seed) {
            throw LoginError(StatusResponse.COULD_NOT_COMPLETE_LOGIN)
        }

        val authCode: Int?
        val password: String?
        var reconnectXteas: IntArray? = null

        if(reconnecting) {
            reconnectXteas = IntArray(4) { rsaBuf.readInt() }
            authCode = null
            password = null
        } else {
            authCode = when(rsaBuf.readByte().toInt()) {
                1, 4 -> {
                    val value = rsaBuf.readUnsignedMedium()
                    rsaBuf.skipBytes(Byte.SIZE_BYTES)
                    value
                }
                3 -> rsaBuf.readInt()
                else -> {
                    rsaBuf.skipBytes(Int.SIZE_BYTES)
                    -1
                }
            }

            rsaBuf.skipBytes(Byte.SIZE_BYTES)
            password = rsaBuf.readString()
        }

        /*
         * === XTEA BUFFER DECODE ===
         */

        val xteaBuf = Unpooled.wrappedBuffer(Xtea.decipher(payload, xteas))

        val username = xteaBuf.readString()
        if(username.isBlank() || Regex("[^a-zA-Z0-9\\d ]").containsMatchIn(username)) {
            throw LoginError(StatusResponse.INVALID_CREDENTIALS)
        }

        xteaBuf.skipBytes(Byte.SIZE_BYTES)
        xteaBuf.skipBytes(Short.SIZE_BYTES)
        xteaBuf.skipBytes(Short.SIZE_BYTES)

        ByteArray(24) { xteaBuf.readByte() }

        xteaBuf.readString()
        xteaBuf.readInt()

        val val1 = xteaBuf.readInt()
        val plat1 = xteaBuf.readByte()
        val os = xteaBuf.readByte()
        val plat2 = xteaBuf.readByte()
        val osversion = xteaBuf.readByte()
        val vendor = xteaBuf.readShort()
        val javamajor = xteaBuf.readByte()
        val javaminor = xteaBuf.readByte()
        val javapatch = xteaBuf.readByte()
        val pat2 = xteaBuf.readByte()
        val maxMemory = xteaBuf.readByte()
        val cpuCores = xteaBuf.readShort()
        val plat3 = xteaBuf.readByte()
        val plat4medium = xteaBuf.readMedium()
        val clockSpeed = xteaBuf.readShort()
        val platstr1 = xteaBuf.readJagString()
        val platstr2 = xteaBuf.readJagString()
        val platstr3 = xteaBuf.readJagString()
        val platstr4 = xteaBuf.readJagString()
        val plat5 = xteaBuf.readByte()
        val plat6 = xteaBuf.readShort()

        repeat(3) { xteaBuf.readInt() }

        val plat7 = xteaBuf.readInt()
        val plat8 = xteaBuf.readJagString()
        val plat9 = xteaBuf.readJagString()

        val clientType2 = xteaBuf.readByte()
        val zeroInt = xteaBuf.readInt()

        repeat(21) {
            xteaBuf.skipBytes(Int.SIZE_BYTES)
        }

        xteaBuf.skipBytes(xteaBuf.readableBytes())

        LoginRequest(
            session,
            username,
            password,
            authCode,
            seed,
            xteas,
            reconnectXteas,
            reconnecting
        ).also { out.add(it) }

        /*
         * Reset state
         */
        stage = Stage.HANDSHAKE
        payloadSize = 0
        reconnecting = false
        retries = 0
    }

    private fun ByteBuf.decryptRsa(exponent: BigInteger, modulus: BigInteger, length: Int): ByteBuf {
        val bytes = ByteArray(length)
        readBytes(bytes)
        return Unpooled.wrappedBuffer(BigInteger(bytes).modPow(exponent, modulus).toByteArray())
    }

    private enum class Stage {
        HANDSHAKE,
        HEADER,
        PAYLOAD
    }

    private class LoginError(val status: StatusResponse) : Exception()

    companion object {
        private const val LOGIN_NORMAL = 16
        private const val LOGIN_RECONNECT = 18
        private const val MAX_RETRIES = 5
    }
}