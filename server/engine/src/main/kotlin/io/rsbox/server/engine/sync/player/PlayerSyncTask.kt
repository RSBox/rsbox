package io.rsbox.server.engine.sync.player

import io.netty.buffer.ByteBuf
import io.rsbox.server.common.inject
import io.rsbox.server.engine.model.World
import io.rsbox.server.engine.model.coord.Scene
import io.rsbox.server.engine.model.coord.Tile
import io.rsbox.server.engine.model.entity.Player
import io.rsbox.server.engine.model.MovementType
import io.rsbox.server.engine.net.packet.server.PlayerInfoServerPacket
import io.rsbox.server.engine.sync.SyncTask
import io.rsbox.server.engine.sync.update.PlayerUpdateFlag
import io.rsbox.server.util.buffer.BIT_MODE
import io.rsbox.server.util.buffer.BYTE_MODE
import io.rsbox.server.util.buffer.JagByteBuf
import io.rsbox.server.util.buffer.toJagBuf
import java.util.*
import kotlin.math.abs

class PlayerSyncTask : SyncTask {

    private val world: World by inject()

    override suspend fun execute() {
        world.players.forEachEntry { player ->
            val buf = player.encodeSync()
            val packet = PlayerInfoServerPacket(buf)
            player.session.write(packet)
        }
    }

    private fun Player.encodeSync(): ByteBuf {
        val mainBuf = session.channel.alloc().buffer().toJagBuf()
        val maskBuf = session.channel.alloc().buffer().toJagBuf()

        writeLocalPlayers(mainBuf, maskBuf, true)
        writeLocalPlayers(mainBuf, maskBuf, false)
        writeExternalPlayers(mainBuf, maskBuf, true)
        writeExternalPlayers(mainBuf, maskBuf, false)

        val buf = session.channel.alloc().buffer()

        gpi.localPlayerCount = 0
        gpi.externalPlayerCount = 0

        for(i in 1 until World.MAX_PLAYERS) {
            gpi.skipFlags[i] = gpi.skipFlags[i] shr 1
            if(gpi.localPlayers[i] != null) {
                gpi.localPlayerIndexes[gpi.localPlayerCount++] = i
            } else {
                gpi.externalPlayerIndexes[gpi.externalPlayerCount++] = i
            }
        }

        mainBuf.writeBytes(maskBuf.toByteBuf())
        maskBuf.release()

        buf.writeBytes(mainBuf.toByteBuf())
        mainBuf.release()
        return buf
    }

    private fun Player.writeLocalPlayers(buf: JagByteBuf, maskBuf: JagByteBuf, active: Boolean) {
        var skipCount = 0

        buf.switchWriteAccess(BIT_MODE)
        for(i in 0 until gpi.localPlayerCount) {
            val localIndex = gpi.localPlayerIndexes[i]
            val localPlayer = gpi.localPlayers[localIndex]

            val skip = when(active) {
                true -> (gpi.skipFlags[localIndex] and 0x1) != 0
                false -> (gpi.skipFlags[localIndex] and 0x1) == 0
            }

            if(skip) continue
            if(skipCount > 0) {
                skipCount--
                gpi.skipFlags[localIndex] = (gpi.skipFlags[localIndex] or 0x2)
                continue
            }

            if(localPlayer != this && (localPlayer == null || this.shouldRemove(localPlayer))) {
                val prevTile = gpi.tileUpdates[localIndex]
                val curTile = localPlayer?.tile?.to18BitInteger() ?: 0
                val updateTileLocation = prevTile != curTile

                buf.writeRemoveLocalPlayer(updateTileLocation)
                if(updateTileLocation) {
                    buf.writeUpdateTileLocation(prevTile, curTile)
                }

                gpi.localPlayers[localIndex] = null
                gpi.tileUpdates[localIndex] = curTile
                continue
            }

            val shouldUpdate = localPlayer.updateFlags.isNotEmpty()
            if(shouldUpdate) {
                maskBuf.writeUpdateFlags(localPlayer)
            }

            if(localPlayer.movementType != MovementType.NONE) {
                buf.writeMovementTeleport(localPlayer, shouldUpdate)
            }
            else if(shouldUpdate) {
                buf.writeShouldUpdate()
            }
            else {
                for(j in i + 1 until gpi.localPlayerCount) {
                    val nextIndex = gpi.localPlayerIndexes[j]
                    val nextPlayer = gpi.localPlayers[nextIndex]
                    val skipNext = when(active) {
                        true -> (gpi.skipFlags[nextIndex] and 0x1) != 0
                        false -> (gpi.skipFlags[nextIndex] and 0x1) == 0
                    }
                    if(skipNext) continue
                    if(nextPlayer == null || nextPlayer.updateFlags.isNotEmpty() || nextPlayer.movementType != MovementType.NONE ||nextPlayer != this && this.shouldRemove(nextPlayer)) {
                        break
                    }
                    skipCount++
                }
                buf.writeSkipCount(skipCount)
                gpi.skipFlags[localIndex] = (gpi.skipFlags[localIndex] or 0x2)
            }
        }
        if(skipCount > 0) throw RuntimeException()
        buf.switchWriteAccess(BYTE_MODE)
    }

    private fun Player.writeExternalPlayers(buf: JagByteBuf, maskBuf: JagByteBuf, active: Boolean) {
        var skipCount = 0

        buf.switchWriteAccess(BIT_MODE)
        for(i in 0 until gpi.externalPlayerCount) {
            val externalIndex = gpi.externalPlayerIndexes[i]
            val skip = when(active) {
                true -> (gpi.skipFlags[externalIndex] and 0x1) == 0
                false -> (gpi.skipFlags[externalIndex] and 0x1) != 0
            }
            if(skip) continue
            if(skipCount > 0) {
                skipCount--
                gpi.skipFlags[externalIndex] = (gpi.skipFlags[externalIndex] or 0x2)
                continue
            }

            val externalPlayer = world.players[externalIndex]
            if(externalPlayer != null && shouldAdd(externalPlayer)) {
                val prevTile = gpi.tileUpdates[externalIndex]
                val curTile = externalPlayer.tile.to18BitInteger()
                val updateTileLocation = prevTile != curTile

                buf.writeAddLocalPlayer(externalPlayer, updateTileLocation, prevTile, curTile)
                maskBuf.writeUpdateFlags(externalPlayer, sortedSetOf(PlayerUpdateFlag.APPEARANCE, PlayerUpdateFlag.MOVEMENT))

                gpi.skipFlags[externalIndex] = (gpi.skipFlags[externalIndex] or 0x2)
                gpi.tileUpdates[externalIndex] = curTile
                gpi.localPlayers[externalIndex] = externalPlayer
                continue
            }

            for(j in i + 1 until gpi.externalPlayerCount) {
                val nextIndex = gpi.externalPlayerIndexes[j]
                val skipNext = when(active) {
                    true -> (gpi.skipFlags[nextIndex] and 0x1) == 0
                    false -> (gpi.skipFlags[nextIndex] and 0x1) != 0
                }
                if(skipNext) continue
                val nextPlayer = world.players[nextIndex]
                if(nextPlayer != null && (shouldAdd(nextPlayer) || nextPlayer.tile.to18BitInteger() != gpi.tileUpdates[nextIndex])) {
                    break
                }
                skipCount++
            }
            buf.writeSkipCount(skipCount)
            gpi.skipFlags[externalIndex] = (gpi.skipFlags[externalIndex] or 0x2)
        }
        if(skipCount > 0) throw RuntimeException()
        buf.switchWriteAccess(BYTE_MODE)
    }

    private fun JagByteBuf.writeUpdateFlags(player: Player, updateFlags: SortedSet<PlayerUpdateFlag> = sortedSetOf()) {
        var mask = 0

        updateFlags.addAll(player.updateFlags)
        updateFlags.forEach {
            mask = mask or it.mask
        }

        val extraFlag1 = 0x1
        val extraFlag2 = 0x1000

        if(mask and 0xFF.inv() != 0) {
           mask = mask or extraFlag1
        }
        if(mask and 0xFFFF.inv() != 0) {
            mask = mask or extraFlag2
        }

        writeByte(mask)
        if(mask and extraFlag1 != 0) {
            writeByte(mask ushr 8)
        }
        if(mask and extraFlag2 != 0) {
            writeByte(mask ushr 16)
        }

        updateFlags.forEach { updateFlag ->
            updateFlag.encode(this, player)
        }
    }

    private fun JagByteBuf.writeAddLocalPlayer(player: Player, updateTileLocation: Boolean, prevTile: Int = 0, curTile: Int = 0) {
        writeBits(1, 1)
        writeBits(0, 2)
        writeBits(if(updateTileLocation) 1 else 0, 1)
        if(updateTileLocation) {
            writeUpdateTileLocation(prevTile, curTile)
        }
        writeBits(player.tile.x and 0x1FFF, 13)
        writeBits(player.tile.y and 0x1FFF, 13)
        writeBits(1, 1)
    }

    private fun JagByteBuf.writeRemoveLocalPlayer(updateTileLocation: Boolean) {
        writeBits(1, 1)
        writeBits(0, 1)
        writeBits(0, 2)
        writeBits(if(updateTileLocation) 1 else 0, 1)
    }

    private fun JagByteBuf.writeUpdateTileLocation(prev: Int, cur: Int) {
        val px = (prev shr 8) and 0xFF
        val py = prev and 0xFF
        val pz = prev shr 16

        val cx = (cur shr 8) and 0xFF
        val cy = cur and 0xFF
        val cz = cur shr 16

        val dx = cx - px
        val dy = cy - py
        val dz = (cz - pz) and 0x3

        if(px == cx && py == cy) {
            writeBits(1, 2)
            writeBits(dz, 2)
        }
        else if(abs(dx) <= 1 && abs(dy) <= 1) {
            writeBits(2, 2)
            writeBits(dz, 2)
            writeBits(getDirectionType(dx, dy), 3)
        }
        else {
            writeBits(3, 2)
            writeBits(Tile(dx, dy, dz).to18BitInteger(), 18)
        }
    }

    private fun JagByteBuf.writeMovementTeleport(player: Player, shouldUpdate: Boolean) {
        writeBits(1, 1)
        writeBoolean(shouldUpdate)
        writeBits(3, 2)

        val dx = player.tile.x - player.prevTile.x
        val dy = player.tile.y - player.prevTile.y
        val dz = player.tile.level - player.prevTile.level

        if(abs(dx) <= Scene.VIEW_DISTANCE && abs(dy) <= Scene.VIEW_DISTANCE) {
            writeBits(0, 1)
            writeBits(dz and 0x3, 2)
            writeBits(dx and 0x1F, 5)
            writeBits(dy and 0x1F, 5)
        } else {
            writeBits(1,1)
            writeBits(dz and 0x3, 2)
            writeBits(dx and 0x3FFF, 14)
            writeBits(dy and 0x3FFF, 14)
        }
    }

    private fun JagByteBuf.writeShouldUpdate() {
        writeBits(1, 1)
        writeBits(1, 1)
        writeBits(0, 2)
    }

    private fun JagByteBuf.writeSkipCount(count: Int) {
        writeBits(0, 1)
        when {
            count == 0 -> {
                writeBits(0, 2)
            }
            count < 32 -> {
                writeBits(1, 2)
                writeBits(count, 5)
            }
            count < 256 -> {
                writeBits(2, 2)
                writeBits(count, 8)
            }
            count < 2048 -> {
                writeBits(3, 2)
                writeBits(count, 11)
            }
        }
    }

    private fun Player.shouldRemove(other: Player) = other !in world.players || other.invisible || !other.tile.isWithinRadius(tile, Scene.VIEW_DISTANCE)
    private fun Player.shouldAdd(other: Player) = other != this && !other.invisible && other.tile.isWithinRadius(tile, Scene.VIEW_DISTANCE)

    private fun getDirectionType(dx: Int, dy: Int) = MOVEMENT_DIRS[2 - dy][dx + 2]

    private fun getMovementDir(player: Player): Int {
        val dx = player.tile.x - player.prevTile.x
        val dy = player.tile.y - player.prevTile.y
        return getDirectionType(dx, dy)
    }

    companion object {

        private const val EXCESS_MASK = 0x4

        private val MOVEMENT_DIRS = arrayOf(
            intArrayOf(11, 12, 13, 14, 15),
            intArrayOf(9, 5, 6, 7, 10),
            intArrayOf(7, 3, -1, 4, 8),
            intArrayOf(5, 0, 1, 2, 6),
            intArrayOf(0, 1, 2, 3, 4)
        )
    }
}