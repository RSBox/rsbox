package io.rsbox.server.engine.net.packet.server

import io.rsbox.server.engine.net.Session
import io.rsbox.server.engine.net.game.Codec
import io.rsbox.server.engine.net.game.Packet
import io.rsbox.server.engine.net.game.PacketType
import io.rsbox.server.engine.net.game.ServerPacket
import io.rsbox.server.util.buffer.JagByteBuf
import io.rsbox.server.util.buffer.LITTLE

@ServerPacket(opcode = 51, type = PacketType.FIXED)
class VarpSmall(val id: Int, val value: Int) : Packet {
    companion object : Codec<VarpSmall> {
        override fun encode(session: Session, packet: VarpSmall, out: JagByteBuf) {
            out.writeShort(packet.id, endian = LITTLE)
            out.writeByte(packet.value)
        }
    }
}