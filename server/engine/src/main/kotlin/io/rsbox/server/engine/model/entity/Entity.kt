package io.rsbox.server.engine.model.entity

import io.rsbox.server.common.inject
import io.rsbox.server.engine.Engine
import io.rsbox.server.engine.model.Direction
import io.rsbox.server.engine.model.MovementQueue
import io.rsbox.server.engine.model.coord.Tile
import io.rsbox.server.engine.model.World
import io.rsbox.server.engine.model.MovementType
import io.rsbox.server.engine.sync.update.UpdateFlag
import org.rsmod.pathfinder.PathFinder
import java.util.SortedSet

abstract class Entity {

    val engine: Engine by inject()
    val world: World by inject()

    abstract val sizeX: Int
    abstract val sizeY: Int

    abstract var tile: Tile
    abstract var prevTile: Tile
    abstract var followTile: Tile

    var index: Int = -1
    var invisible = false

    abstract val updateFlags: SortedSet<out UpdateFlag>

    var running = true
    var direction: Direction = Direction.EAST

    var movementType = MovementType.NONE
    var teleportTile: Tile? = null
    val movementQueue = MovementQueue(this)

    abstract suspend fun cycle()

    fun canTravel(tile: Tile, direction: Direction) = world.collisionMap.canTravel(tile, direction)

}