package io.rsbox.server.engine.net.packet.server

import io.rsbox.server.engine.model.World
import io.rsbox.server.engine.model.entity.Player
import io.rsbox.server.engine.net.Session
import io.rsbox.server.engine.net.game.Codec
import io.rsbox.server.engine.net.game.Packet
import io.rsbox.server.engine.net.game.PacketType
import io.rsbox.server.engine.net.game.ServerPacket
import io.rsbox.server.util.buffer.ADD
import io.rsbox.server.util.buffer.BIT_MODE
import io.rsbox.server.util.buffer.BYTE_MODE
import io.rsbox.server.util.buffer.JagByteBuf

@ServerPacket(opcode = 73, type = PacketType.VARIABLE_SHORT)
data class RebuildNormalServerPacket(
    val player: Player,
    val gpi: Boolean = false
) : Packet {
    companion object : Codec<RebuildNormalServerPacket> {
        override fun encode(session: Session, packet: RebuildNormalServerPacket, out: JagByteBuf) {
            if(packet.gpi) {
                out.switchWriteAccess(BIT_MODE)
                out.writeBits(packet.player.tile.to30BitInteger(), 30)
                for(i in 1 until World.MAX_PLAYERS) {
                    if(i == packet.player.index) continue
                    out.writeBits(packet.player.gpi.tileUpdates[i], 18)
                }
                out.switchWriteAccess(BYTE_MODE)
            }

            val baseChunk = packet.player.scene.baseTile.toChunk()
            val regions = packet.player.scene.regions

            out.writeShort(baseChunk.y)
            out.writeShort(baseChunk.x, transform = ADD)
            out.writeShort(regions.size)

            regions.forEach { region ->
                region.xteaKeys.forEach { out.writeInt(it) }
            }
        }
    }
}