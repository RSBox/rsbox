package io.rsbox.server.engine.sync

import io.rsbox.server.engine.sync.task.npc.NpcPostSyncTask
import io.rsbox.server.engine.sync.task.npc.NpcPreSyncTask
import io.rsbox.server.engine.sync.task.npc.NpcSyncTask
import io.rsbox.server.engine.sync.task.player.PlayerPostSyncTask
import io.rsbox.server.engine.sync.task.player.PlayerPreSyncTask
import io.rsbox.server.engine.sync.task.player.PlayerSyncTask

class SyncTaskList(
    private val tasks: MutableList<SyncTask> = mutableListOf()
) : List<SyncTask> by tasks {

    init {
        tasks.add(PlayerPreSyncTask())
        tasks.add(NpcPreSyncTask())
        tasks.add(PlayerSyncTask())
        tasks.add(NpcSyncTask())
        tasks.add(PlayerPostSyncTask())
        tasks.add(NpcPostSyncTask())
    }
}