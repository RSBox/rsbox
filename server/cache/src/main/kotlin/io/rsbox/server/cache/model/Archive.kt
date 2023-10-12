package io.rsbox.server.cache.model

data class Archive(val id: Int) {

    val groups = mutableMapOf<Int, Group>()

    fun readGroup(groupId: Int): Group {
        return if(groups.containsKey(groupId)) groups[groupId]!!
        else {
            val group = Group(this, groupId)
            groups[groupId] = group
            group
        }
    }

}