package io.rsbox.server.engine.model.entity

class EntityList<T>(
    private val initialCapacity: Int,
    private val entries: MutableList<T?> = createMutableList<T?>(initialCapacity)
) : List<T?> by entries {

    override val size: Int get() = entries.count { it != null }

    val indices: IntRange get() = entries.indices

    val capacity: Int get() = entries.size

    @Suppress("UNCHECKED_CAST")
    fun add(entity: Entity): Boolean {
        val index = entries.freeIndex()
        if(index == -1) return false
        entries[index] = entity as T
        entity.index = index
        return entries[entity.index] != null
    }

    fun remove(entity: Entity): Boolean = when {
        entity.index == -1 -> false
        entries[entity.index] != entity -> false
        else -> {
            entries[entity.index] = null
            entries[entity.index] == null
        }
    }

    override fun isEmpty(): Boolean = size == 0

    suspend fun forEachEntry(action: suspend (T) -> Unit) {
        entries.filterNotNull().forEach { action(it) }
    }

    private fun <T> List<T>.freeIndex(): Int = (1 until indices.last).firstOrNull { this[it] == null } ?: -1

    private companion object {
        @Suppress("UNCHECKED_CAST")
        fun <T> createMutableList(size: Int): MutableList<T?> = (arrayOfNulls<Any?>(size) as Array<T?>).toMutableList()
    }
}