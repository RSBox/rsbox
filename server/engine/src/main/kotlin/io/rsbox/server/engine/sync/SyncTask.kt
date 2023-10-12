package io.rsbox.server.engine.sync

interface SyncTask {
    suspend fun execute()
}