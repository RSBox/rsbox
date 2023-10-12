package io.rsbox.server.engine.sync.player

import io.rsbox.server.common.inject
import io.rsbox.server.engine.model.Direction
import io.rsbox.server.engine.model.MovementQueue
import io.rsbox.server.engine.model.MovementType
import io.rsbox.server.engine.model.World
import io.rsbox.server.engine.model.entity.Player
import io.rsbox.server.engine.sync.SyncTask
import io.rsbox.server.engine.sync.update.PlayerUpdateFlag

class PlayerPreSyncTask : SyncTask {

    private val world: World by inject()

    override suspend fun execute() {
            world.players.forEachEntry { player ->
                player.updateMovement()
                player.scene.cycle()
            }
    }

    private fun Player.updateMovement() {
        prevTile = tile
        movementQueue.cycle()
    }
}