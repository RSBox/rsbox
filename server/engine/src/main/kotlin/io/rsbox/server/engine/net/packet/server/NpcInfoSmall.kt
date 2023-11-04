package io.rsbox.server.engine.net.packet.server

import io.netty.buffer.ByteBuf
import io.rsbox.server.engine.net.Session
import io.rsbox.server.engine.net.game.Codec
import io.rsbox.server.engine.net.game.Packet
import io.rsbox.server.engine.net.game.PacketType
import io.rsbox.server.engine.net.game.ServerPacket
import io.rsbox.server.util.buffer.JagByteBuf

@ServerPacket(opcode = 44, type = PacketType.VARIABLE_SHORT)
class NpcInfoSmall(val buf: ByteBuf) : Packet {
    companion object : Codec<NpcInfoSmall> {
        override fun encode(session: Session, packet: NpcInfoSmall, out: JagByteBuf) {
            out.writeBytes(packet.buf)
            packet.buf.release()
        }
    }
}