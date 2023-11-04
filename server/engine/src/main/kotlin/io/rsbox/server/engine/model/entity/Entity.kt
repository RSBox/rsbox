package io.rsbox.server.engine.model.entity

import io.rsbox.server.common.inject
import io.rsbox.server.engine.Engine
import io.rsbox.server.engine.coroutine.EngineCoroutine
import io.rsbox.server.engine.coroutine.EngineCoroutineScope
import io.rsbox.server.engine.model.Direction
import io.rsbox.server.engine.model.World
import io.rsbox.server.engine.model.coord.Tile
import io.rsbox.server.engine.model.entity.movement.Movement
import io.rsbox.server.engine.model.entity.update.UpdateFlag
import java.util.*

abstract class Entity {

    val engine: Engine by inject()
    val world: World by inject()

    private val coroutineScope = EngineCoroutineScope()

    var activeCoroutine: EngineCoroutine? = null
        private set

    fun task(block: suspend (EngineCoroutine).() -> Unit): EngineCoroutine {
        return coroutineScope.launch(block = block)
    }

    fun strictTask(block: suspend EngineCoroutine.() -> Unit): EngineCoroutine {
        activeCoroutine?.cancel()
        val coroutine = coroutineScope.launch(block = block)
        if(coroutine.isSuspended()) {
            activeCoroutine = coroutine
        }
        return coroutine
    }

    internal fun cleanup() {
        coroutineScope.cancel()
    }

    abstract val sizeX: Int
    abstract val sizeY: Int

    abstract var tile: Tile
    abstract var prevTile: Tile

    var index: Int = -1
    var invisible = false

    abstract val updateFlags: SortedSet<out UpdateFlag>
    abstract fun flagMovement()

    var running = false
    var direction: Direction = Direction.SOUTH
    val movement by lazy { Movement(this) }

    open suspend fun cycle() {
        coroutineScope.advance()
    }

    abstract fun walkTo(tile: Tile)
    abstract fun teleportTo(tile: Tile)
}