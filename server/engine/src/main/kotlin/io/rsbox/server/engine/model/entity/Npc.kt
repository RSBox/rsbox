package io.rsbox.server.engine.model.entity

import io.rsbox.server.engine.model.coord.Tile
import io.rsbox.server.engine.model.entity.update.NpcUpdateFlag

class Npc(val id: Int, val spawnTile: Tile) : Entity() {

    val info = world.cache.configArchive.npcs[id] ?: error("Unknown Npc with id: $id.")

    override var tile = spawnTile
    override var prevTile = tile

    override val sizeX = info.size.toInt()
    override val sizeY = info.size.toInt()

    override val updateFlags = sortedSetOf<NpcUpdateFlag>()
    override fun flagMovement() {}

    override suspend fun cycle() {

    }

}