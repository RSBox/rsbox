package io.rsbox.server.engine.model.coord

import io.rsbox.server.engine.model.Direction
import kotlin.math.abs
import kotlin.math.ceil
import kotlin.math.sqrt

@JvmInline
value class Tile(val packed: Int) {

    constructor(x: Int, y: Int, level: Int = 0) : this(
        ((x and 0x7FFF) or ((y and 0x7FFF) shl 15) or (level shl 30))
    )

    val x get() = packed and 0x7FFF
    val y get() = (packed shr 15) and 0x7FFF
    val level get() = (packed shr 30) and 0x3

    fun to18BitInteger() = (y shr 13) or ((x shr 13) shl 8) or ((level and 0x3) shl 16)
    fun to30BitInteger() = (y and 0x3FFF) or ((x and 0x3FFF) shl 14) or ((level and 0x3) shl 28)

    fun translate(x: Int = 0, y: Int = 0, level: Int = 0) = Tile(
        this.x + x,
        this.y + y,
        this.level + level
    )

    fun translate(direction: Direction, amount: Int = 1) = Tile(
        this.x + (direction.deltaX * amount),
        this.y + (direction.deltaY * amount),
        this.level
    )

    fun isWithinRadius(other: Tile, radius: Int): Boolean {
        if(level != other.level) return false
        val dx = abs(x - other.x)
        val dy = abs(y - other.y)
        return dx <= radius && dy <= radius
    }

    fun distanceTo(other: Tile): Int {
        val dx = x - other.x
        val dy = y - other.y
        return ceil(sqrt((dx * dx + dy * dy).toDouble())).toInt()
    }

    fun deltaTo(other: Tile) = abs(x - other.x) + abs(y - other.y)

    fun directionTo(other: Tile) = Direction.between(this, other)

    fun isSame(other: Tile) = x == other.x && y == other.y && level == other.level

    fun toChunk() = Chunk(
        x / Chunk.SIZE,
        y / Chunk.SIZE,
        level
    )

    fun toRegion() = Region(
        x / Region.SIZE,
        y / Region.SIZE
    )

    override fun toString(): String {
        return "Tile(x=$x, y=$y, level=$level)"
    }

    companion object {
        const val SIZE = 1
    }
}