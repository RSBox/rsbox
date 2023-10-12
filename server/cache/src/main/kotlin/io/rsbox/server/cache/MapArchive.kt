@file:Suppress("NO_TAIL_CALLS_FOUND")

package io.rsbox.server.cache

import io.netty.buffer.ByteBuf
import io.rsbox.server.cache.map.MapRegionEntry
import io.rsbox.server.cache.map.MapRegionLocation
import io.rsbox.server.cache.map.MapRegionTerrain
import io.rsbox.server.config.XteaConfig
import io.rsbox.server.util.buffer.readIncrShortSmart
import io.rsbox.server.util.buffer.readUnsignedShortSmart
import org.openrs2.crypto.SymmetricKey
import org.tinylog.kotlin.Logger

class MapArchive(private val entryMap: MutableMap<Int, MapRegionEntry> = mutableMapOf()) : Map<Int, MapRegionEntry> by entryMap {

    override operator fun get(key: Int): MapRegionEntry {
        if(!entryMap.containsKey(key)) {
            entryMap[key] = loadMapRegionEntry(key, XteaConfig.getRegionKey(key))
        }
        return entryMap[key]!!
    }



    companion object {

        const val id = 5

        fun load(): MapArchive {
            return MapArchive()
        }

        private fun loadMapRegionEntry(regionId: Int, xteas: IntArray): MapRegionEntry {
            val entry = MapRegionEntry(regionId)

            if(xteas.isEmpty()) {
                Logger.warn("The XTEA keys for region: $regionId are missing.")
                return entry
            }

            /*
             * Load region map terrain
             */
            val mapData = GameCache.cache.read(id, "m${entry.regionX}_${entry.regionY}", 0)
            try {
                for(level in 0 until 4) {
                    for(x in 0 until 64) {
                        for(y in 0 until 64) {
                            entry.terrain[entry.pack(x, y, level)] = mapData.loadTerrain()
                        }
                    }
                }
            } catch (e: Exception) {
                Logger.warn { "Failed to load map archive terrain. [region=$regionId, group=m${entry.regionX}_${entry.regionY}]" }
            } finally {
                mapData.release()
            }


            /*
             * Load region map locations (objects)
             */
            var locData: ByteBuf? = null
            try {
                locData = GameCache.cache.read(id, "l${entry.regionX}_${entry.regionY}", 0, xteas.toXteaKey())
                locData.loadLocation(entry)
            } catch (e: Exception) {
                Logger.warn { "Failed to load map archive locations. [region=$regionId, group=l${entry.regionX}_${entry.regionY}, keys=(${xteas.joinToString(", ") { it.toString() }}]" }
            } finally {
                locData?.release()
            }

            return entry
        }

        private tailrec fun ByteBuf.loadTerrain(
            height: Int = 0,
            overlayId: Int = 0,
            overlayPath: Int = 0,
            overlayRotation: Int = 0,
            collision: Int = 0,
            underlayId: Int = 0
        ): MapRegionTerrain {
            return when(val opcode = readUnsignedShort()) {
                0 -> MapRegionTerrain(collision)
                1 -> {
                    readUnsignedByte()
                    MapRegionTerrain(collision)
                }
                else -> loadTerrain(
                    height = height,
                    overlayId = if(opcode in 2..49) readShort().toInt() else overlayId,
                    overlayPath = if(opcode in 2..49) (opcode - 2) / 4 else overlayPath,
                    overlayRotation = if(opcode in 2..49) opcode - 2 and 3 else overlayRotation,
                    collision = if(opcode in 50..81) opcode - 49 else collision,
                    underlayId = if(opcode > 81) opcode - 81 else underlayId
                )
            }
        }

        private tailrec fun ByteBuf.loadLocation(entry: MapRegionEntry, locId: Int = -1) {
            val offset = readIncrShortSmart()
            if(offset == 0) return
            loadLocationCollision(entry, locId + offset, 0)
            return loadLocation(entry, locId + offset)
        }

        private tailrec fun ByteBuf.loadLocationCollision(entry: MapRegionEntry, locId: Int, position: Int) {
            var positionOffset = readUnsignedShortSmart().toInt()
            if(positionOffset == 0) return
            val packedTile = position + positionOffset - 1
            val y = packedTile and 0x3F
            val x = (packedTile shr 6) and 0x3F
            var level = (packedTile shr 12) and 0x3
            if(entry.terrain[entry.pack(x, y, 1)]!!.collision and 0x2 == 0x2) { level-- }
            if(level < 0) {
                readUnsignedByte()
            } else {
                val attributes = readUnsignedByte().toInt()
                val shape = attributes shr 2
                val rotation = attributes and 0x3
                entry.locations[entry.pack(x, y, level)] = when(val size = entry.locations[entry.pack(x, y, level)]?.size ?: 0) {
                    0 -> Array(1) { MapRegionLocation(locId, x, y, level, shape, rotation) }
                    in 1..4 -> entry.locations[entry.pack(x, y, level)]!!.copyOf(size + 1).also {
                        it[size] = MapRegionLocation(locId, x, y, level, shape, rotation)
                    }
                    else -> error("Too many objects within a single tile. Only max of 5 are allowed.")
                }
            }
            return loadLocationCollision(entry, locId, packedTile)
        }

        private fun IntArray.toXteaKey() = SymmetricKey(this[0], this[1], this[2], this[3])
    }

}