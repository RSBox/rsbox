package io.rsbox.server.engine.net.packet.server

import io.rsbox.server.engine.net.Session
import io.rsbox.server.engine.net.game.Codec
import io.rsbox.server.engine.net.game.Packet
import io.rsbox.server.engine.net.game.PacketType
import io.rsbox.server.engine.net.game.ServerPacket
import io.rsbox.server.util.buffer.JagByteBuf
import io.rsbox.server.util.buffer.MIDDLE

@ServerPacket(opcode = 118, type = PacketType.FIXED)
data class IfMoveSub(
    val fromParent: Int,
    val fromChild: Int,
    val toParent: Int,
    val toChild: Int
) : Packet {
    companion object : Codec<IfMoveSub> {
        override fun encode(session: Session, packet: IfMoveSub, out: JagByteBuf) {
            val fromComponent = (packet.fromParent shl 16) or packet.fromChild
            val toComponent = (packet.toParent shl 16) or packet.toChild
            out.writeInt(fromComponent)
            out.writeInt(toComponent, endian = MIDDLE)
        }
    }
}