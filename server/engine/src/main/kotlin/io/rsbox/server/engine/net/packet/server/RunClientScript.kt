package io.rsbox.server.engine.net.packet.server

import io.rsbox.server.engine.net.Session
import io.rsbox.server.engine.net.game.Codec
import io.rsbox.server.engine.net.game.Packet
import io.rsbox.server.engine.net.game.PacketType
import io.rsbox.server.engine.net.game.ServerPacket
import io.rsbox.server.util.buffer.JagByteBuf

@ServerPacket(opcode = 22, type = PacketType.VARIABLE_SHORT)
class RunClientScript(val id: Int, vararg val args: Any) : Packet {
    companion object : Codec<RunClientScript> {
        override fun encode(session: Session, packet: RunClientScript, out: JagByteBuf) {
            val types = CharArray(packet.args.size) { i -> if(packet.args[i] is String) 's' else 'i' }
            out.writeString(String(types))
            for(i in packet.args.size - 1 downTo 0) {
                val arg = packet.args[i]
                if(arg is String) {
                    out.writeString(arg)
                } else if(arg is Number) {
                    out.writeInt(arg.toInt())
                }
            }
            out.writeInt(packet.id)
        }
    }
}