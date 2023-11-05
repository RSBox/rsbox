package rsbox.core.mechanics.npc

import io.rsbox.server.common.inject
import io.rsbox.server.engine.api.ext.on_init
import io.rsbox.server.engine.model.Direction
import io.rsbox.server.engine.model.World
import io.rsbox.server.engine.model.coord.Tile
import io.rsbox.server.engine.model.entity.Npc
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import org.tinylog.kotlin.Logger
import kotlin.math.min
import kotlin.random.Random

private val world: World by inject()

on_init {
    val spawns = loadNpcSpawns()
    val npcs = spawns.mapNotNull { createNpc(it) }
    npcs.forEach { npc ->
        world.addNpc(npc)
        npc.wander(npc.wanderRadius)
    }
    Logger.debug("Spawned ${npcs.size} NPCs in world.")
}

@Serializable
data class NpcSpawn(
    val name: String,
    val id: Int,
    val x: Int,
    val y: Int,
    val level: Int,
    val radius: Int,
    val direction: Int
)

fun loadNpcSpawns(): Array<NpcSpawn> {
    val text = this::class.java.getResourceAsStream("/data/npc_spawns.json")?.bufferedReader()?.readText()
        ?: error("Failed to find '/data/npc_spawns.json' resource file.")
    return Json.decodeFromString<Array<NpcSpawn>>(text)
}

fun createNpc(spawn: NpcSpawn): Npc? {
    val tile = Tile(spawn.x, spawn.y, spawn.level)
    val npc = try { Npc(spawn.id, tile) } catch (e: Throwable) { return null }
    npc.wanderRadius = spawn.radius
    npc.direction = Direction.fromOrientation(spawn.direction)
    return npc
}

fun Npc.wander(radius: Int) {
    if(radius == 0) return
    val wanderRadius = min(radius, 5)
    task {
        while(true) {
            if(Random.nextInt(1, 8) != 7) {
                wait(ticks = 1)
                continue
            } else {
                val dest = spawnTile.translate(x = Random.nextInt(-wanderRadius, wanderRadius), y = Random.nextInt(-wanderRadius, wanderRadius))
                walkTo(dest)
            }
        }
    }
}