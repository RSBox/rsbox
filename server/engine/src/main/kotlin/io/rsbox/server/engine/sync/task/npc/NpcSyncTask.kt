package io.rsbox.server.engine.sync.task.npc

import io.rsbox.server.common.inject
import io.rsbox.server.engine.model.World
import io.rsbox.server.engine.sync.SyncTask

class NpcSyncTask : SyncTask {

    private val world: World by inject()

    override suspend fun execute() {
        world.players.forEachEntry { player ->

        }
    }
}