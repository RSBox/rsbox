package io.rsbox.server.engine.model.entity

import io.rsbox.server.cache.GameCache
import io.rsbox.server.common.inject
import io.rsbox.server.engine.Engine
import io.rsbox.server.engine.model.Direction
import io.rsbox.server.engine.model.coord.Tile
import io.rsbox.server.engine.model.World
import io.rsbox.server.engine.model.entity.movement.Movement
import io.rsbox.server.engine.model.entity.update.UpdateFlag
import java.util.SortedSet

abstract class Entity {

    val engine: Engine by inject()
    val world: World by inject()
    val cache: GameCache by inject()

    abstract val sizeX: Int
    abstract val sizeY: Int

    abstract var tile: Tile
    abstract var prevTile: Tile

    var index: Int = -1
    var invisible = false

    abstract val updateFlags: SortedSet<out UpdateFlag>
    abstract fun flagMovement()

    var running = true
    var direction: Direction = Direction.SOUTH
    val movement by lazy { Movement(this) }

    abstract suspend fun cycle()

    fun canTravel(tile: Tile, direction: Direction) = world.collision.canTravel(tile, direction)

}