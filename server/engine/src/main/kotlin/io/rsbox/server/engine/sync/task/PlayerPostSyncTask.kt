package io.rsbox.server.engine.sync.task

import io.rsbox.server.common.inject
import io.rsbox.server.engine.model.World
import io.rsbox.server.engine.model.entity.Player
import io.rsbox.server.engine.sync.SyncTask

class PlayerPostSyncTask : SyncTask {

    private val world: World by inject()

    override suspend fun execute() {
        world.players.forEachEntry { player ->
            player.vars.sync()

            val oldTile = player.prevTile
            val hasMoved = player.prevTile != player.tile
            val hasChangedLevel = player.prevTile.level != player.tile.level

            if(hasMoved) {
                player.prevTile = player.tile
            }

            player.movement.moved = false
            player.movement.teleported = false
            player.movement.stepDirection = null
            player.updateFlags.clear()

            if(hasMoved) {
                val prevZone = world.zones.getZone(oldTile)
                val curZone = world.zones.getZone(player.tile)
                if(prevZone != curZone) {
                    prevZone.removeEntity(player)
                    curZone.addEntity(player)
                }
            }
        }
    }

    private fun Player.resetMovement() {
        val oldTile = prevTile
        val hasMoved = prevTile != tile
        val hasChangedLevel = prevTile.level != tile.level

        if(hasMoved) {
            prevTile = tile
        }
        movement.moved = false
        movement.stepDirection = null

        if(hasMoved) {
            val prevZone = world.zones.getZone(prevTile)
            val curZone = world.zones.getZone(tile)
            if(prevZone != curZone) {
                prevZone.removeEntity(this)
                curZone.addEntity(this)
            }
        }
    }
}