@file:Suppress("KotlinConstantConditions")

package io.rsbox.server.engine.model

import io.rsbox.server.engine.model.coord.Tile
import io.rsbox.server.engine.model.entity.Entity
import io.rsbox.server.engine.model.entity.Player
import io.rsbox.server.engine.sync.update.PlayerUpdateFlag
import org.rsmod.pathfinder.Route
import org.rsmod.pathfinder.RouteCoordinates
import java.util.Deque
import java.util.LinkedList
import kotlin.math.sign

class MovementQueue(val entity: Entity, private val steps: LinkedList<Tile> = LinkedList()) : Deque<Tile> by steps {

    private val routeSteps = LinkedList<RouteCoordinates>()

    private val collision = entity.world.collisionMap

    fun cycle() {
        processRouteSteps()

        if(entity.teleportTile != null) {
            cancelRoute()
            entity.movementType = MovementType.TELEPORT
            entity.let { it as? Player }?.updateFlags?.add(PlayerUpdateFlag.MOVEMENT)
            entity.tile = entity.teleportTile!!
            entity.followTile = entity.tile.translate(Direction.WEST)
            return
        }

        var step = poll()
        if(step != null) {
            var tile = entity.tile

            var walkDirection = Direction.between(tile, step)
            var runDirection: Direction? = null

            if(walkDirection != Direction.NONE && collision.canTravel(tile, walkDirection)) {
                tile = step
                entity.direction = walkDirection

                if(entity.running) {
                    step = poll()
                    if(step != null) {
                        runDirection = Direction.between(tile, step)
                        if(collision.canTravel(tile, runDirection)) {
                            tile = step
                            entity.direction = runDirection
                        } else {
                            cancelRoute()
                            runDirection = null
                        }
                    } else {
                        runDirection = null
                    }
                }
            } else {
                walkDirection = Direction.NONE
                cancelRoute()
            }

            if(walkDirection != Direction.NONE) {
                entity.movementType = if(runDirection != null) MovementType.RUN else MovementType.WALK
                entity.followTile = entity.tile
                entity.tile = tile
                if(runDirection != null) {
                    entity.let { it as? Player }?.updateFlags?.add(PlayerUpdateFlag.MOVEMENT)
                }
            }
        }
    }

    private fun processRouteSteps(tile: Tile = entity.tile) {
        if(isNotEmpty()|| routeSteps.isEmpty()) return
        clear()

        var turnCount = 0
        var curX = tile.x
        var curY = tile.y

        while(routeSteps.isNotEmpty()) {
            val step = routeSteps.poll()
            val destX = step.x
            val destY = step.y
            val dx = (destX - curX).sign
            val dy = (destY - curY).sign
            while(curX != destX || curY != destY) {
                curX += dx
                curY += dy
                add(Tile(curX, curY, tile.level))
                if(turnCount > 25) break
            }
            turnCount++
        }
    }

    fun addRoute(route: Route) {
        routeSteps.clear()
        clear()
        routeSteps.addAll(route)
    }

    fun cancelRoute() {
        routeSteps.clear()
        steps.clear()
    }
}