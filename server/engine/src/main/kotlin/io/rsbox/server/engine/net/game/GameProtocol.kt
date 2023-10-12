package io.rsbox.server.engine.net.game

import io.netty.buffer.ByteBuf
import io.rsbox.server.engine.net.Message
import io.rsbox.server.engine.net.Protocol
import io.rsbox.server.engine.net.Session
import io.rsbox.server.util.buffer.toJagBuf
import org.tinylog.kotlin.Logger
import kotlin.reflect.KClass

class GameProtocol(session: Session) : Protocol(session) {

    /***
     * ===== DECODER =====
     */

    private var decoderStage = DecoderStage.OPCODE
    private var decoderOpcode = -1
    private var decoderLength = 0
    private var isUnknown = false

    override fun decode(buf: ByteBuf, out: MutableList<Any>) {
        try {
            when(decoderStage) {
                DecoderStage.OPCODE -> buf.decodeOpcode(out)
                DecoderStage.LENGTH -> buf.decodeLength(out)
                DecoderStage.PAYLOAD -> buf.decodePayload(out)
            }
        } catch(e: Exception) {
            Logger.error(e) { "An error occurred while decoding client packet. [opcode: $decoderOpcode]" }
            session.disconnect()
        }
    }

    private enum class DecoderStage {
        OPCODE,
        LENGTH,
        PAYLOAD
    }

    private fun ByteBuf.decodeOpcode(out: MutableList<Any>) {
        decoderOpcode = (this.readUnsignedByte().toInt() - session.decoderIsaac.nextInt()) and 0xFF
        decoderLength = GamePackets.CLIENT_PACKET_LENGTHS[decoderOpcode] ?: throw IllegalStateException("No client packet length found for opcode: $decoderOpcode.")
        isUnknown = GamePackets.clientPackets.isUnknown(decoderOpcode)

        decoderStage = when {
            decoderLength == 0 -> {
                this.decodePayload(out)
                return
            }
            decoderLength < 0 -> DecoderStage.LENGTH
            else -> DecoderStage.PAYLOAD
        }
    }

    private fun ByteBuf.decodeLength(out: MutableList<Any>) {
        decoderLength = when(decoderLength) {
            -1 -> readUnsignedByte().toInt()
            -2 -> readUnsignedShort()
            else -> throw IllegalStateException("Illegal variable length: $decoderLength for opcode: $decoderOpcode.")
        }

        if(decoderLength == 0) {
            this.decodePayload(out)
        } else {
            decoderStage = DecoderStage.PAYLOAD
        }
    }

    private fun ByteBuf.decodePayload(out: MutableList<Any>) {
        if(readableBytes() >= decoderLength) {
            val payload = readBytes(decoderLength)
            decoderStage = DecoderStage.OPCODE

            if(!isUnknown) {
                val codec = GamePackets.clientPackets.getCodec(decoderOpcode)
                val packet = codec.decode(session, payload.toJagBuf())
                out.add(packet)
            } else {
                Logger.warn("Received unknown client packet. [opcode: $decoderOpcode, length: $decoderLength]")
            }
        }
    }

    /**
     * ===== ENCODER =====
     */

    @Suppress("UNCHECKED_CAST")
    override fun encode(msg: Message, out: ByteBuf) {
        if(msg !is Packet) return

        val opcode = GamePackets.serverPackets.getOpcode(msg::class as KClass<out Packet>)
        val type = GamePackets.serverPackets.getType(opcode)
        val codec = GamePackets.serverPackets.getCodec(opcode)

        val buf = session.ctx.alloc().buffer().toJagBuf()
        codec.encode(session, msg, buf)

        val length = buf.writerIndex()

        out.writeByte((opcode + session.encoderIsaac.nextInt()) and 0xFF)

        when(type) {
            PacketType.VARIABLE_BYTE -> out.writeByte(length)
            PacketType.VARIABLE_SHORT -> out.writeShort(length)
            else -> { /* Do Nothing */ }
        }

        out.writeBytes(buf.toByteBuf())
        buf.release()
    }

    override fun handle(msg: Message) {
        println("Handler: packet")
    }
}