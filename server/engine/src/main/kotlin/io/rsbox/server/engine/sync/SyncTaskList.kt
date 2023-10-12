package io.rsbox.server.engine.sync

import io.rsbox.server.engine.sync.player.PlayerPostSyncTask
import io.rsbox.server.engine.sync.player.PlayerPreSyncTask
import io.rsbox.server.engine.sync.player.PlayerSyncTask

class SyncTaskList(
    private val tasks: MutableList<SyncTask> = mutableListOf()
) : List<SyncTask> by tasks {

    init {
        tasks.add(PlayerPreSyncTask())
        tasks.add(PlayerSyncTask())
        tasks.add(PlayerPostSyncTask())
    }
}