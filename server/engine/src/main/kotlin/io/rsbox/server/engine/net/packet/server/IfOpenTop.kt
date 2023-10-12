package io.rsbox.server.engine.net.packet.server

import io.rsbox.server.engine.model.ui.UserInterface
import io.rsbox.server.engine.net.Session
import io.rsbox.server.engine.net.game.Codec
import io.rsbox.server.engine.net.game.Packet
import io.rsbox.server.engine.net.game.PacketType
import io.rsbox.server.engine.net.game.ServerPacket
import io.rsbox.server.util.buffer.ADD
import io.rsbox.server.util.buffer.JagByteBuf

@ServerPacket(opcode = 49, type = PacketType.FIXED)
data class IfOpenTop(val userInterface: UserInterface) : Packet {
    companion object : Codec<IfOpenTop> {
        override fun encode(session: Session, packet: IfOpenTop, out: JagByteBuf) {
            out.writeShort(packet.userInterface.id, transform = ADD)
        }
    }
}