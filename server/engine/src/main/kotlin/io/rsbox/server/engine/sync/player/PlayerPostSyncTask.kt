package io.rsbox.server.engine.sync.player

import io.rsbox.server.common.inject
import io.rsbox.server.engine.model.World
import io.rsbox.server.engine.model.entity.Player
import io.rsbox.server.engine.model.MovementType
import io.rsbox.server.engine.sync.SyncTask

class PlayerPostSyncTask : SyncTask {

    private val world: World by inject()

    override suspend fun execute() {
        world.players.forEachEntry { player ->
            player.updateFlags.clear()
            player.clearMovement()
        }
    }

    private fun Player.clearMovement() {
        teleportTile = null
        movementType = MovementType.NONE

    }
}