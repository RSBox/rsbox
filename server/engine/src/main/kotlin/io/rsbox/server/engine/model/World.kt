package io.rsbox.server.engine.model

import io.rsbox.server.cache.GameCache
import io.rsbox.server.common.inject
import io.rsbox.server.config.XteaConfig
import io.rsbox.server.engine.Engine
import io.rsbox.server.engine.model.map.CollisionMap
import io.rsbox.server.engine.model.entity.EntityList
import io.rsbox.server.engine.model.entity.Player
import io.rsbox.server.engine.model.map.ZoneMap
import org.tinylog.kotlin.Logger

class World {

    val engine: Engine by inject()
    private val cache: GameCache by inject()

    val players: EntityList<Player> = EntityList(MAX_PLAYERS)

    val map = ZoneMap()
    val collision = CollisionMap()

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

    }

    fun addPlayer(player: Player) {
        map.getZone(player.tile).addEntity(player)
        players.add(player)
    }

    fun removePlayer(player: Player) {
        map.getZone(player.tile).removeEntity(player)
        players.remove(player)
    }

    companion object {
        const val MAX_PLAYERS = 2048
        const val MAX_NPCS = 65535
    }
}