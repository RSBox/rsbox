package io.rsbox.server.engine.model

import io.rsbox.server.engine.model.coord.Tile

@JvmInline
value class GameObject(val packed: Long) {

    constructor(id: Int, tile: Tile, shape: Int, rotation: Int) : this(
        ((id and 0x1FFFF) or ((shape and 0x1F) shl 17) or ((rotation and 0x3) shl 22)).toLong() or (tile.packed.toLong() shl 24)
    )

    val id get() = (packed and 0x1FFFF).toInt()
    val shape get() = (packed shr 17 and 0x1F).toInt()
    val rotation get() = (packed shr 22 and 0x3).toInt()
    val tile get() = Tile((packed shr 24 and 0xFFFFFFFFL).toInt())

    override fun toString(): String {
        return "GameObject[id=$id]"
    }
}