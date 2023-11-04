package io.rsbox.server.engine.sync.task

import io.rsbox.server.common.inject
import io.rsbox.server.engine.model.World
import io.rsbox.server.engine.model.entity.Player
import io.rsbox.server.engine.sync.SyncTask

class PlayerPreSyncTask : SyncTask {

    private val world: World by inject()

    override suspend fun execute() {
            world.players.forEachEntry { player ->
                player.movement.cycle()
                player.scene.cycle()
            }
    }
}