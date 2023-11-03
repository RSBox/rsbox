package io.rsbox.server.engine.net.packet.server

import io.rsbox.server.engine.net.Session
import io.rsbox.server.engine.net.game.Codec
import io.rsbox.server.engine.net.game.Packet
import io.rsbox.server.engine.net.game.PacketType
import io.rsbox.server.engine.net.game.ServerPacket
import io.rsbox.server.util.buffer.JagByteBuf
import io.rsbox.server.util.buffer.LITTLE
import io.rsbox.server.util.buffer.MIDDLE

@ServerPacket(opcode = 75, type = PacketType.FIXED)
class VarpLarge(val id: Int, val value: Int) : Packet {
    companion object : Codec<VarpLarge> {
        override fun encode(session: Session, packet: VarpLarge, out: JagByteBuf) {
            out.writeInt(packet.value, endian = MIDDLE)
            out.writeShort(packet.id, endian = LITTLE)
        }
    }
}