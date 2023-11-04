package io.rsbox.server.engine.net.packet.server

import io.rsbox.server.engine.net.Session
import io.rsbox.server.engine.net.game.Codec
import io.rsbox.server.engine.net.game.Packet
import io.rsbox.server.engine.net.game.PacketType
import io.rsbox.server.engine.net.game.ServerPacket
import io.rsbox.server.util.buffer.JagByteBuf

@ServerPacket(opcode = 60, type = PacketType.VARIABLE_BYTE)
class MessageGame(val type: Int, val message: String) : Packet {
    companion object : Codec<MessageGame> {
        override fun encode(session: Session, packet: MessageGame, out: JagByteBuf) {
            out.writeSmart(packet.type)
            out.writeByte(0)
            out.writeString(packet.message)
        }
    }
}