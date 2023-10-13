package io.rsbox.server.engine.model.map

import io.rsbox.server.cache.GameCache
import io.rsbox.server.common.inject
import io.rsbox.server.engine.model.World
import io.rsbox.server.engine.model.coord.Chunk
import io.rsbox.server.engine.model.coord.Tile

class ZoneMap {

    private val cache: GameCache by inject()
    private val world: World by inject()

    private val zones = arrayOfNulls<Zone>(2048 * 2048 * 4)

    operator fun get(chunk: Chunk) = zones[chunk.packed] ?: createZone(chunk)

    fun getZone(chunk: Chunk) = get(chunk)
    fun getZone(tile: Tile) = get(tile.toChunk())

    private fun createZone(chunk: Chunk) = Zone(chunk).also {
        zones[chunk.packed] = it
    }
}