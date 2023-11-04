package io.rsbox.server.engine.sync.task.npc

import io.netty.buffer.ByteBuf
import io.rsbox.server.common.inject
import io.rsbox.server.engine.model.Direction
import io.rsbox.server.engine.model.World
import io.rsbox.server.engine.model.coord.Scene
import io.rsbox.server.engine.model.coord.Tile
import io.rsbox.server.engine.model.entity.Npc
import io.rsbox.server.engine.model.entity.Player
import io.rsbox.server.engine.model.entity.update.NpcUpdateFlag
import io.rsbox.server.engine.net.packet.server.NpcInfoSmall
import io.rsbox.server.engine.sync.SyncTask
import io.rsbox.server.util.buffer.BIT_MODE
import io.rsbox.server.util.buffer.BYTE_MODE
import io.rsbox.server.util.buffer.JagByteBuf
import io.rsbox.server.util.buffer.toJagBuf
import java.util.*

class NpcSyncTask : SyncTask {

    private val world: World by inject()

    override suspend fun execute() {
        world.players.forEachEntry { player ->
            val buf = player.encodeSync()
            val packet = NpcInfoSmall(buf)
            player.write(packet)
        }
    }

    private fun Player.encodeSync(): ByteBuf {
        val mainBuf = session.channel.alloc().buffer().toJagBuf()
        val maskBuf = session.channel.alloc().buffer().toJagBuf()

        mainBuf.switchWriteAccess(BIT_MODE)

        writeNpcs(mainBuf, maskBuf)

        mainBuf.switchWriteAccess(BYTE_MODE)

        mainBuf.writeBytes(maskBuf.toByteBuf())
        maskBuf.release()

        val buf = session.channel.alloc().buffer()
        buf.writeBytes(mainBuf.toByteBuf())
        mainBuf.release()

        return buf
    }

    private fun Player.writeNpcs(buf: JagByteBuf, maskBuf: JagByteBuf) {

        val npcs = localNpcs
        val itr = npcs.iterator()

        buf.writeNpcCount(npcs.size)

        while(itr.hasNext()) {
            val npc = itr.next()
            if(shouldRemove(npc)) {
                buf.writeRemoveNpc()
                itr.remove()
                continue
            }
            npc.active = true

            val shouldUpdate = npc.updateFlags.isNotEmpty()
            if(npc.movement.moved) {
                buf.writeShouldSkip(false)
                buf.writeMovementTeleport()
            } else if(npc.movement.stepDirection != null) {
                buf.writeShouldSkip(false)
                buf.writeMovementWalk(
                    npc.movement.stepDirection!!.walkDirection!!.npcValue,
                    npc.movement.stepDirection!!.runDirection?.npcValue ?: -1,
                    shouldUpdate
                )
                if(shouldUpdate) {
                    maskBuf.writeUpdateFlags(npc)
                }
            } else if(shouldUpdate) {
                buf.writeShouldSkip(false)
                buf.writeMovementNone()
                maskBuf.writeUpdateFlags(npc)
            } else {
                buf.writeShouldSkip(true)
            }
        }

        var added = 0
        for(npc in world.npcs) {
            if(added >= 40 || localNpcs.size >= MAX_LOCAL_NPCS) {
                break
            }

            if(npc == null || !this.shouldAdd(npc) || localNpcs.contains(npc)) {
                continue
            }

            val shouldUpdate = npc.updateFlags.isNotEmpty()
            buf.writeAddNpc(this, npc, shouldUpdate)
            if(shouldUpdate) {
                maskBuf.writeUpdateFlags(npc, sortedSetOf(NpcUpdateFlag.SPAWN))
            }

            added++
            localNpcs.add(npc)
        }
    }

    private fun JagByteBuf.writeNpcCount(count: Int) {
        writeBits(count, 8)
    }

    private fun JagByteBuf.writeRemoveNpc() {
        writeBits(1, 1)
        writeBits(3, 2)
    }

    private fun JagByteBuf.writeAddNpc(player: Player, npc: Npc, shouldUpdate: Boolean) {
        var dx = npc.tile.x - player.tile.x
        var dy = npc.tile.y - player.tile.y

        if(!player.largeViewport) {
            if(dx < Scene.VIEW_DISTANCE) {
                dx += 32
            }
            if(dy < Scene.VIEW_DISTANCE) {
                dy += 32
            }
        } else {
            if(dx < Scene.LARGE_VIEW_DISTANCE) {
                dx += 256
            }
            if(dy < Scene.LARGE_VIEW_DISTANCE) {
                dy += 256
            }
        }

        val id = if(npc.transmogId != -1) npc.transmogId else npc.id
        val faceDirection = if(npc.direction != Direction.NONE) npc.direction else Direction.SOUTH

        writeBits(npc.index, 16)
        writeBoolean(shouldUpdate)
        writeBoolean(player.largeViewport)
        writeBits(id, 14)
        writeBits(faceDirection.npcValue, 3)
        writeBits(dx, if(player.largeViewport) 8 else 5)
        writeBits(dy, if(player.largeViewport) 8 else 5)
        writeBoolean(shouldUpdate)
    }

    private fun JagByteBuf.writeShouldSkip(skip: Boolean) {
        writeBits(if(skip) 0 else 1, 1)
    }

    private fun JagByteBuf.writeMovementTeleport() {
        writeBits(3, 2)
    }

    private fun JagByteBuf.writeMovementWalk(walkDirection: Int, runDirection: Int, shouldUpdate: Boolean) {
        val running = runDirection != -1
        writeBits(if(running) 2 else 1, 2)
        writeBits(walkDirection, 3)
        if(running) {
            writeBits(runDirection, 3)
        }
        writeBits(if(shouldUpdate) 1 else 0, 1)
    }

    private fun JagByteBuf.writeMovementNone() {
        writeBits(0, 2)
    }

    private fun JagByteBuf.writeUpdateFlags(npc: Npc, updateFlags: SortedSet<NpcUpdateFlag> = sortedSetOf()) {
        var mask = 0

        updateFlags.addAll(npc.updateFlags)
        updateFlags.forEach {
            mask = mask or it.mask
        }

        val extraFlag1 = 0x40
        val extraFlag2 = 0x800

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
            updateFlag.encode(this, npc)
        }
    }

    private fun Player.shouldRemove(npc: Npc) = !npc.isSpawned() || npc.invisible || !isWithinView(npc.tile)
    private fun Player.shouldAdd(npc: Npc) = npc.isSpawned() && !npc.invisible && isWithinView(npc.tile)
    private fun Player.isWithinView(tile: Tile) = this.tile.isWithinRadius(tile, if(largeViewport) 127 else Scene.VIEW_DISTANCE)

    companion object {
        private const val MAX_LOCAL_NPCS = 255
    }
}