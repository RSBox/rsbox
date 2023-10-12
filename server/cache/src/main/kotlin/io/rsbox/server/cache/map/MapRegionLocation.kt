package io.rsbox.server.cache.map

@JvmInline
value class MapRegionLocation(private val packed: Long) {

    constructor(
        id: Int,
        x: Int,
        y: Int,
        level: Int,
        shape: Int,
        rotation: Int
    ) : this(
        ((id and 0x1FFFF) or ((shape and 0x1F) shl 17) or ((rotation and 0x3) shl 22)).toLong() or (((y and 0x3FFF) or ((x and 0x3FFF) shl 14) or ((level and 0x3) shl 28)).toLong() shl 24)
    )

    val id get() = (packed and 0x1FFFF).toInt()
    val shape get() = (packed shr 17 and 0x1F).toInt()
    val rotation get() = (packed shr 22 and 0x3).toInt()
    val x get() = ((packed shr 24 and 0xFFFFFFFFL).toInt() shr 14 and 0x3FFF)
    val y get() = ((packed shr 24 and 0xFFFFFFFFL).toInt() and 0x3FFF)
    val level get() = ((packed shr 24 and 0xFFFFFFFFL).toInt() shr 28 and 0x3F)
}