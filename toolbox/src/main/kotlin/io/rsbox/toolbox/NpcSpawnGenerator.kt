package io.rsbox.toolbox

import io.rsbox.server.cache.CacheModule
import io.rsbox.server.cache.GameCache
import io.rsbox.server.common.inject
import io.rsbox.server.engine.EngineModule
import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import org.koin.core.context.startKoin
import java.io.File
import kotlin.math.max
import kotlin.math.min

object NpcSpawnGenerator {

    private val cache: GameCache by inject()

    @JvmStatic
    fun main(args: Array<String>) {
        println("Loading game cache.")

        startKoin { modules(CacheModule, EngineModule) }
        cache.load()

        println("Parsing input json: 'npc_spawns.json'.")

        val jsonText = NpcSpawnGenerator::class.java.getResourceAsStream("/npc_spawns.json")!!.bufferedReader().readText()
        val npcSpawns = Json.decodeFromString<Array<NpcSpawn>>(jsonText).toMutableList()
        println("Loaded ${npcSpawns.size} NPC spawns.")

        println("Processing spawn points.")
        npcSpawns.sortWith(Comparator.comparingInt(NpcSpawn::npc))

        val outNpcSpawns = mutableListOf<OutNpcSpawn>()
        npcSpawns.forEach { spawn ->
            val deltaX = spawn.maxX - spawn.minX
            val deltaY = spawn.maxY - spawn.maxY
            val walkRadius = max(deltaX, deltaY)
            val spawnX = spawn.minX + deltaX / 2
            val spawnY = spawn.minY + deltaY / 2
            val name = cache.configArchive.npcs[spawn.npc]?.name ?: "null"
            val id = spawn.npc
            val direction = if(spawn.orientation == -1) 0 else spawn.orientation
            outNpcSpawns.add(OutNpcSpawn(name, id, spawnX, spawnY, spawn.minPlane, walkRadius, direction))
        }

        println("Exporting processed NPC spawns to file: 'npc_spawns.json.txt'.")

        val json = Json { prettyPrint = true }

        val file = File("npc_spawns.json.txt")
        if(file.exists()) file.deleteRecursively()

        val outJsonText = json.encodeToString<Array<OutNpcSpawn>>(outNpcSpawns.toTypedArray())

        file.createNewFile()
        file.writeText(outJsonText)

        println("Successfully exported json file. Finished.")
    }

    @Serializable
    data class NpcSpawn(
        val npc: Int,
        val index: Int,
        val orientation: Int,
        val points: Array<Point>
    ) {

        val minX: Int get() {
            var ret = Int.MAX_VALUE
            points.forEach { point ->
                ret = min(ret, point.x)
            }
            return ret
        }

        val maxX: Int get() {
            var ret = Int.MIN_VALUE
            points.forEach { point ->
                ret = max(ret, point.x)
            }
            return ret
        }

        val minY: Int get() {
            var ret = Int.MAX_VALUE
            points.forEach { point ->
                ret = min(ret, point.y)
            }
            return ret
        }

        val maxY: Int get() {
            var ret = Int.MIN_VALUE
            points.forEach { point ->
                ret = max(ret, point.y)
            }
            return ret
        }

        val minPlane: Int get() {
            var ret = Int.MAX_VALUE
            points.forEach { point ->
                ret = min(ret, point.plane)
            }
            return ret
        }

        val maxPlane: Int get() {
            var ret = Int.MIN_VALUE
            points.forEach { point ->
                ret = max(ret, point.plane)
            }
            return ret
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (javaClass != other?.javaClass) return false

            other as NpcSpawn

            if (npc != other.npc) return false
            if (index != other.index) return false
            if (orientation != other.orientation) return false
            return points.contentEquals(other.points)
        }

        override fun hashCode(): Int {
            var result = npc
            result = 31 * result + index
            result = 31 * result + orientation
            result = 31 * result + points.contentHashCode()
            return result
        }
    }

    @Serializable
    data class Point(val x: Int, val y: Int, val plane: Int)

    @Serializable
    data class OutNpcSpawn(
        val name: String,
        val id: Int,
        val x: Int,
        val y: Int,
        val level: Int,
        val radius: Int,
        val direction: Int
    )
}