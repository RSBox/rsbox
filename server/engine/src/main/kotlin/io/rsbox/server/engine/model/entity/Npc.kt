package io.rsbox.server.engine.model.entity

import io.rsbox.server.engine.model.coord.Tile
import io.rsbox.server.engine.model.entity.update.NpcUpdateFlag
import org.rsmod.pathfinder.DumbPathFinder

class Npc(val id: Int, val spawnTile: Tile) : Entity() {

    val info = world.cache.configArchive.npcs[id] ?: error("Unknown Npc with id: $id.")

    override var tile = spawnTile
    override var prevTile = tile

    override val sizeX = info.size.toInt()
    override val sizeY = info.size.toInt()

    override val updateFlags = sortedSetOf<NpcUpdateFlag>()
    override fun flagMovement() {}

    var active = false

    var transmogId: Int = -1

    override suspend fun cycle() {
        super.cycle()
    }

    fun isSpawned() = index > 0

    override fun walkTo(tile: Tile) {
        val route = DumbPathFinder(world.collision.flags(), -1).findPath(
            this.tile.x,
            this.tile.y,
            tile.x,
            tile.y,
            this.tile.level
        )
        movement.addRoute(route)
    }

    override fun teleportTo(tile: Tile) {
        movement.moved = true
        movement.teleported = true
        this.tile = tile
        movement.clear()
    }
}