package io.rsbox.server.engine.sync.task

import io.rsbox.server.common.inject
import io.rsbox.server.engine.model.World
import io.rsbox.server.engine.model.entity.Player
import io.rsbox.server.engine.model.MovementType
import io.rsbox.server.engine.sync.SyncTask
import org.tinylog.kotlin.Logger

class PlayerPostSyncTask : SyncTask {

    private val world: World by inject()

    override suspend fun execute() {
        world.players.forEachEntry { player ->
            player.updateFlags.clear()
            player.resetMovement()
        }
    }

    private fun Player.resetMovement() {
        teleportTile = null
        movementType = MovementType.NONE

        val hasMoved = prevTile != tile
        val hasChangedLevel = prevTile.level != tile.level

        if(hasMoved) {
            val prevZone = world.map.getZone(prevTile)
            val curZone = world.map.getZone(tile)
            if(prevZone != curZone) {
                prevZone.removeEntity(this)
                curZone.addEntity(this)
                Logger.info("Enter new chunk!")
            }
        }
    }
}