package io.rsbox.server.engine.net.packet.client

import io.rsbox.server.engine.model.coord.Tile
import io.rsbox.server.engine.net.Session
import io.rsbox.server.engine.net.game.ClientPacket
import io.rsbox.server.engine.net.game.Codec
import io.rsbox.server.engine.net.game.Packet
import io.rsbox.server.engine.net.game.PacketType
import io.rsbox.server.engine.sync.update.PlayerUpdateFlag
import io.rsbox.server.util.buffer.ADD
import io.rsbox.server.util.buffer.JagByteBuf
import io.rsbox.server.util.buffer.LITTLE

@ClientPacket(opcode = 88, type = PacketType.VARIABLE_BYTE)
class MoveGameClickClientPacket(val tile: Tile, val clickType: Int) : Packet {

    override fun handle(session: Session) {
        val player = session.player
        if(clickType == 1 || clickType == 2) {
            player.teleportTo(tile)
        } else {
            player.moveTo(tile)
        }
    }

    companion object : Codec<MoveGameClickClientPacket> {
        override fun decode(session: Session, buf: JagByteBuf): MoveGameClickClientPacket {
            val tileY = buf.readUnsignedShort(endian = LITTLE, transform = ADD)
            val clickType = buf.readByte().toInt()
            val tileX = buf.readUnsignedShort(endian = LITTLE, transform = ADD)
            val tile = Tile(tileX, tileY, session.player.tile.level)
            return MoveGameClickClientPacket(tile, clickType)
        }
    }
}