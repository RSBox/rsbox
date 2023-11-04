package io.rsbox.server.engine.model.entity.movement

import io.rsbox.server.engine.model.Direction
import io.rsbox.server.engine.model.coord.Tile
import io.rsbox.server.engine.model.entity.Entity
import org.rsmod.pathfinder.Route
import org.rsmod.pathfinder.RouteCoordinates
import java.util.ArrayDeque
import java.util.Deque
import java.util.LinkedList
import kotlin.math.abs
import kotlin.math.max
import kotlin.math.sign

class Movement(val entity: Entity) {

    private val steps: Deque<Step> = ArrayDeque()
    private val routeSteps = LinkedList<RouteCoordinates>()

    var stepDirection: StepDirection? = null
    var moved = false
    var teleported = false

    fun lastTile() = lastStep()?.tile
    fun lastStep() = if(steps.isNotEmpty()) steps.peekLast() else null

    fun clear() {
        steps.clear()
    }

    fun cycle() {
        processRouteSteps()

        val collision = entity.world.collision

        var next = steps.poll()
        if(next != null) {
            var tile = entity.tile
            var walkDirection: Direction? = Direction.between(tile, next.tile)
            var runDirection: Direction? = null

            if(walkDirection != Direction.NONE && collision.canTravel(tile, walkDirection!!)) {
                tile = next.tile
                entity.direction = walkDirection

                val running = when(next.type) {
                    StepType.NORMAL -> entity.running || lastStep()?.type == StepType.FORCE_RUN
                    StepType.FORCE_RUN -> true
                    StepType.FORCE_WALK -> false
                }
                if(running) {
                    next = steps.poll()
                    if(next != null) {
                        runDirection = Direction.between(tile, next.tile)
                        if(collision.canTravel(tile, runDirection)) {
                            tile = next.tile
                            entity.direction = runDirection
                        } else {
                            clear()
                            runDirection = null
                        }
                    }
                }
            } else {
                walkDirection = null
                clear()
            }

            if(walkDirection != null) {
                stepDirection = StepDirection(walkDirection, runDirection)
                entity.tile = tile
                if(runDirection != null) {
                    entity.flagMovement()
                }
            }
        }
    }

    fun addStep(tile: Tile, type: StepType) {
        steps.add(Step(tile, type))
    }

    fun addRoute(route: Route) {
        routeSteps.clear()
        clear()
        routeSteps.addAll(route)
    }

    private fun processRouteSteps(tile: Tile = entity.tile) {
        if(steps.isNotEmpty() || routeSteps.isEmpty()) return
        clear()

        var turnCount = 0
        var cx = tile.x
        var cy = tile.y

        while(routeSteps.isNotEmpty()) {
            val step = routeSteps.poll()
            val nx = step.x
            val ny = step.y
            val dx = (nx - cx).sign
            val dy = (ny - cy).sign
            while(cx != nx || cy != ny) {
                cx += dx
                cy += dy
                addStep(Tile(cx, cy, tile.level), StepType.NORMAL)
                if(turnCount > 25) break
            }
            turnCount++
        }
    }
}