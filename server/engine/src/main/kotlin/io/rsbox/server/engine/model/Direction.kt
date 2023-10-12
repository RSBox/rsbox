package io.rsbox.server.engine.model

import io.rsbox.server.engine.model.coord.Tile

enum class Direction(val value: Int, val playerValue: Int) {

    NONE(-1, -1),
    NORTH_WEST(0, 5),
    NORTH(1, 6),
    NORTH_EAST(2, 7),
    WEST(3, 3),
    EAST(4, 4),
    SOUTH_WEST(5, 0),
    SOUTH(6, 1),
    SOUTH_EAST(7, 2);

    fun isDiagonal() = this in listOf(SOUTH_EAST, SOUTH_WEST, NORTH_EAST, NORTH_WEST)

    val deltaX get() = when(this) {
        SOUTH_EAST, NORTH_EAST, EAST -> 1
        SOUTH_WEST, NORTH_WEST, WEST -> -1
        else -> 0
    }

    val deltaY get() = when(this) {
        NORTH_WEST, NORTH_EAST, NORTH -> 1
        SOUTH_WEST, SOUTH_EAST, SOUTH -> -1
        else -> 0
    }

    fun inv() = when(this) {
        NORTH -> SOUTH
        SOUTH -> NORTH
        EAST -> WEST
        WEST -> EAST
        NORTH_WEST -> SOUTH_EAST
        NORTH_EAST -> SOUTH_WEST
        SOUTH_EAST -> NORTH_WEST
        SOUTH_WEST -> NORTH_EAST
        else -> NONE
    }

    companion object {

        val DELTA_X = intArrayOf(-1, 0, 1, -1, 1, -1, 0, 1)
        val DELTA_Y = intArrayOf(-1, -1, -1, 0, 0, 1, 1, 1)

        fun fromValue(value: Int) = entries.firstOrNull { it.value == value }

        fun between(from: Tile, to: Tile): Direction {
            val dx = to.x - from.x
            val dy = to.y - from.y
            when(dy) {
                1 -> when(dx) {
                    1 -> return NORTH_EAST
                    0 -> return NORTH
                    -1 -> return NORTH_WEST
                }
                -1 -> when(dx) {
                    1 -> return SOUTH_EAST
                    0 -> return SOUTH
                    -1 -> return SOUTH_WEST
                }
                0 -> when(dx) {
                    1 -> return EAST
                    0 -> return NONE
                    -1 -> return WEST
                }
            }
            return NONE
        }
    }
}