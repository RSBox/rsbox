package io.rsbox.server.engine.net

import io.netty.buffer.ByteBuf
import io.netty.channel.ChannelHandlerContext
import io.rsbox.server.engine.model.entity.Player
import io.rsbox.server.engine.net.game.GameProtocol
import io.rsbox.server.engine.net.game.Packet
import io.rsbox.server.engine.net.handshake.HandshakeProtocol
import io.rsbox.server.util.security.IsaacRandom
import org.tinylog.kotlin.Logger
import java.util.ArrayDeque
import java.util.concurrent.atomic.AtomicReference
import kotlin.random.Random
import kotlin.random.nextLong

class Session(val ctx: ChannelHandlerContext) {

    val channel get() = ctx.channel()

    lateinit var player: Player internal set

    val protocol = AtomicReference<Protocol>(null)

    var seed = Random.nextLong(0..Long.MAX_VALUE)
    var xteas = IntArray(4) { 0 }
    var reconnectXteas: IntArray? = null

    val encoderIsaac = IsaacRandom()
    val decoderIsaac = IsaacRandom()

    private val packetQueue = ArrayDeque<Packet>()

    internal fun onConnect() {
        protocol.set(HandshakeProtocol(this))
    }

    internal fun onDisconnect() {
        if(protocol.get() is GameProtocol) {
            player.logout()
        }
    }

    internal fun onMessage(msg: Message) {
        if(protocol.get() is GameProtocol && msg is Packet) {
            packetQueue.add(msg)
        } else {
            protocol.get().handle(msg)
        }
    }

    internal fun onError(cause: Throwable) {
        if(cause.stackTrace.isEmpty() || (cause.stackTrace[0].methodName !in arrayOf("read0", "callDecode"))) {
            Logger.error(cause) { "An error occurred in session network thread. [Method: ${cause.stackTrace[0].methodName}]." }
            disconnect()
        }
    }

    fun disconnect() {
        if(channel.isActive) {
            ctx.close()
        }
    }

    fun write(buf: ByteBuf) = ctx.write(buf)
    fun write(msg: Message) = ctx.write(msg)
    fun writeAndFlush(buf: ByteBuf) = ctx.writeAndFlush(buf)
    fun writeAndFlush(msg: Message) = ctx.writeAndFlush(msg)

    fun flush() = ctx.flush()

    fun writeAndClose(msg: Message) {
        ctx.writeAndFlush(msg).addListener {
            if(it.isSuccess) {
                disconnect()
            }
        }
    }

    suspend fun cycle() {
        var count = 0
        while(packetQueue.isNotEmpty() && count <= MAX_CLIENT_PACKETS_PER_CYCLE) {
            val packet = packetQueue.removeFirst()
            packet.handle(this)
            count++
        }
    }

    companion object {
        private const val MAX_CLIENT_PACKETS_PER_CYCLE = 10
    }
}