package io.rsbox.server.engine.sync

import io.rsbox.server.engine.sync.task.PlayerPostSyncTask
import io.rsbox.server.engine.sync.task.PlayerPreSyncTask
import io.rsbox.server.engine.sync.task.PlayerSyncTask

class SyncTaskList(
    private val tasks: MutableList<SyncTask> = mutableListOf()
) : List<SyncTask> by tasks {

    init {
        tasks.add(PlayerPreSyncTask())
        tasks.add(PlayerSyncTask())
        tasks.add(PlayerPostSyncTask())
    }
}