package io.rsbox.server.engine.net.packet.server

import io.rsbox.server.engine.model.ui.Component
import io.rsbox.server.engine.model.ui.InterfaceType
import io.rsbox.server.engine.model.ui.UserInterface
import io.rsbox.server.engine.net.Session
import io.rsbox.server.engine.net.game.Codec
import io.rsbox.server.engine.net.game.Packet
import io.rsbox.server.engine.net.game.PacketType
import io.rsbox.server.engine.net.game.ServerPacket
import io.rsbox.server.util.buffer.ADD
import io.rsbox.server.util.buffer.JagByteBuf
import io.rsbox.server.util.buffer.LITTLE
import io.rsbox.server.util.buffer.NEG

@ServerPacket(opcode = 94, type = PacketType.FIXED)
data class IfOpenSub(
    val userInterface: UserInterface,
    val component: Component,
    val type: InterfaceType
) : Packet {
    companion object : Codec<IfOpenSub> {
        override fun encode(session: Session, packet: IfOpenSub, out: JagByteBuf) {
            out.writeShort(packet.userInterface.id, transform = ADD)
            out.writeByte(packet.type.id, transform = NEG)
            out.writeInt(packet.component.packed, endian = LITTLE)
        }
    }
}