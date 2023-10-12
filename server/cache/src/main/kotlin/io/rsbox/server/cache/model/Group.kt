package io.rsbox.server.cache.model

import io.rsbox.server.cache.GameCache

data class Group(val archive: Archive, val id: Int) {

    val files = mutableMapOf<Int, File>()

    fun readFile(fileId: Int): File {
        return if(files.containsKey(fileId)) files[fileId]!!
        else {
            val fileData = GameCache.cache.read(archive.id, id, fileId)
            val file = File(this, fileId, fileData)
            files[fileId] = file
            file
        }
    }
}