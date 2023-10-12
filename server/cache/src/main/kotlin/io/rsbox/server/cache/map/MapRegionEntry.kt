package io.rsbox.server.cache.map

data class MapRegionEntry(
    val id: Int,
    val regionX: Int = id shr 8,
    val regionY: Int = id and 0xFF,
    val terrain: Array<MapRegionTerrain?> = arrayOfNulls(4 * 64 * 64),
    val locations: Array<Array<MapRegionLocation?>?> = arrayOfNulls(4 * 64 * 64)
) {

    fun pack(x: Int, y: Int, level: Int) = (x and 0x3F shl 6) or (y and 0x3F) or (level shl 12)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as MapRegionEntry

        if (id != other.id) return false
        if (regionX != other.regionX) return false
        if (regionY != other.regionY) return false
        if (!terrain.contentEquals(other.terrain)) return false
        return locations.contentDeepEquals(other.locations)
    }

    override fun hashCode(): Int {
        var result = id
        result = 31 * result + regionX
        result = 31 * result + regionY
        result = 31 * result + terrain.contentHashCode()
        result = 31 * result + locations.contentDeepHashCode()
        return result
    }
}