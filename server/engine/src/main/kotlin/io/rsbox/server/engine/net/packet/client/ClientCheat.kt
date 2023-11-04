package io.rsbox.server.engine.net.packet.client

import io.rsbox.server.engine.event.EventBus
import io.rsbox.server.engine.event.PlayerCommandEvent
import io.rsbox.server.engine.net.Session
import io.rsbox.server.engine.net.game.ClientPacket
import io.rsbox.server.engine.net.game.Codec
import io.rsbox.server.engine.net.game.Packet
import io.rsbox.server.engine.net.game.PacketType
import io.rsbox.server.util.buffer.JagByteBuf

@ClientPacket(opcode = 54, type = PacketType.VARIABLE_BYTE)
class ClientCheat(val command: String, vararg val args: String) : Packet {

    override fun handle(session: Session) {
        EventBus.publish(PlayerCommandEvent(session.player, command, *args))
    }

    companion object : Codec<ClientCheat> {
        override fun decode(session: Session, buf: JagByteBuf): ClientCheat {
            val split = buf.readString().split(" ")
            val command = split[0]
            val args = split.drop(1)
            return ClientCheat(command, *args.toTypedArray())
        }
    }
}