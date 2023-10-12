package io.rsbox.server.engine.model.coord

@JvmInline
value class Scene(val packed: Int) {

    constructor(x: Int, y: Int) : this(
        (x and 0xFFFF) or ((y and 0xFFFF) shl 16)
    )

    val x get() = packed and 0xFFFF
    val y get() = (packed shr 16) and 0xFFFF

    override fun toString(): String {
        return "Scene[x=$x, y=$y]"
    }

    companion object {
        const val SIZE = 104
        const val VIEW_DISTANCE = 15
        const val REBUILD_DISTANCE = 16
    }
}