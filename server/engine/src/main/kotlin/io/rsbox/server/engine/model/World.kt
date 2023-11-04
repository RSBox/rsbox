package io.rsbox.server.engine.model

import io.rsbox.server.cache.GameCache
import io.rsbox.server.common.inject
import io.rsbox.server.config.XteaConfig
import io.rsbox.server.engine.Engine
import io.rsbox.server.engine.coroutine.EngineCoroutineScope
import io.rsbox.server.engine.model.entity.EntityList
import io.rsbox.server.engine.model.entity.Npc
import io.rsbox.server.engine.model.entity.Player
import io.rsbox.server.engine.model.map.CollisionMap
import io.rsbox.server.engine.model.map.ZoneMap
import org.koin.core.qualifier.named
import org.tinylog.kotlin.Logger

class World {

    val engine: Engine by inject()
    val cache: GameCache by inject()
    private val coroutine: EngineCoroutineScope by inject(named("world"))

    val players: EntityList<Player> = EntityList(MAX_PLAYERS)
    val npcs: EntityList<Npc> = EntityList(MAX_NPCS)

    val zones = ZoneMap()
    val collision = CollisionMap()

    var tick: Long = 0L
        private set


    internal fun load() {
        Logger.info("Loading game world.")

        /*
         * Load the game world's map collision.
         */
        var loaded = 0
        for ((regionId, _) in XteaConfig.xteas) {
            val mapEntry = cache.mapArchive[regionId]
            collision.applyCollision(mapEntry)
            loaded++
        }
        Logger.info("Loaded collision for $loaded regions.")
    }

    suspend fun cycle() {
        tick++
        coroutine.advance()
    }

    fun addPlayer(player: Player) {
        zones[player.tile].addEntity(player)
        players.add(player)
    }

    fun removePlayer(player: Player) {
        zones[player.tile].removeEntity(player)
        players.remove(player)
        player.cleanup()
    }

    fun addNpc(npc: Npc) {
        zones[npc.tile].addEntity(npc)
        npcs.add(npc)
    }

    fun removeNpc(npc: Npc) {
        zones[npc.tile].removeEntity(npc)
        npcs.remove(npc)
        npc.cleanup()
    }

    companion object {
        const val MAX_PLAYERS = 2048
        const val MAX_NPCS = 65535
    }
}