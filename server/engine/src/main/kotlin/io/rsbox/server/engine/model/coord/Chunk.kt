package io.rsbox.server.engine.model.coord

@JvmInline
value class Chunk(val packed: Int) {

    constructor(x: Int, y: Int, level: Int = 0) : this(
        (x and 0x7FF) or ((y and 0x7FF) shl 11) or (level shl 22)
    )

    val x get() = packed and 0x7FF
    val y get() = (packed shr 11) and 0x7FF
    val level get() = (packed shr 22) and 0x3

    fun toTile() = Tile(
        x * SIZE,
        y * SIZE,
        level
    )

    fun toRegion() = Region(
        x / (Region.SIZE / SIZE),
        y / (Region.SIZE / SIZE)
    )

    override fun toString(): String {
        return "Chunk[x=$x, y=$y, level=$level]"
    }

    companion object {
        const val SIZE = 8
    }
}