package io.rsbox.server.engine.sync.task.npc

import io.rsbox.server.common.inject
import io.rsbox.server.engine.model.World
import io.rsbox.server.engine.sync.SyncTask

class NpcPostSyncTask : SyncTask {

    private val world: World by inject()

    override suspend fun execute() {
        world.npcs.forEachEntry { npc ->
            val oldTile = npc.prevTile
            val hasMoved = !oldTile.isSame(npc.tile)

            if(hasMoved) {
                npc.prevTile = npc.tile
            }

            npc.movement.moved = false
            npc.movement.teleported = false
            npc.movement.stepDirection = null
            npc.updateFlags.clear()
        }
    }
}