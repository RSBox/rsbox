package io.rsbox.server.engine.model.map

import io.rsbox.server.common.inject
import io.rsbox.server.engine.model.GameObject
import io.rsbox.server.engine.model.World
import io.rsbox.server.engine.model.coord.Chunk
import io.rsbox.server.engine.model.coord.Tile
import io.rsbox.server.engine.model.entity.Entity
import io.rsbox.server.engine.model.entity.Player

data class Zone(val chunk: Chunk) {

    private val world: World by inject()

    private val players = hashSetOf<Player>()

    private val dynamicObjectList = mutableListOf<GameObject>()
    private val staticObjectsList = mutableListOf<GameObject>()

    fun getPlayers(tile: Tile) = players.filter { it.tile == tile }
    fun getObjects(tile: Tile) = dynamicObjectList.plus(staticObjectsList).filter { it.tile == tile }

    fun addEntity(entity: Entity) {
        when(entity) {
            is Player -> players.add(entity)
            else -> error("Not Yet supported")
        }
    }

    fun removeEntity(entity: Entity) {
        when(entity) {
            is Player -> players.remove(entity)
            else -> error("")
        }
    }

    fun addObject(obj: GameObject, isDynamic: Boolean = true) {
        if(isDynamic) dynamicObjectList.add(obj) else staticObjectsList.add(obj)
        world.collision.addObjectCollision(obj)
    }

    fun removeObject(obj: GameObject) {
        dynamicObjectList.remove(obj)
        staticObjectsList.remove(obj)
        world.collision.removeObjectCollision(obj)
    }

    fun sendUpdates(player: Player) {

    }

}