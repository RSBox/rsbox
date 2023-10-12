package io.rsbox.server.engine.model

import io.rsbox.server.cache.GameCache
import io.rsbox.server.common.inject
import io.rsbox.server.config.XteaConfig
import io.rsbox.server.engine.Engine
import io.rsbox.server.engine.model.collision.CollisionMap
import io.rsbox.server.engine.model.entity.EntityList
import io.rsbox.server.engine.model.entity.Player
import org.tinylog.kotlin.Logger

class World {

    val engine: Engine by inject()
    private val cache: GameCache by inject()

    val players: EntityList<Player> = EntityList(MAX_PLAYERS)

    val collisionMap = CollisionMap()

    internal fun load() {
        Logger.info("Loading game world.")

        /*
         * Load the game world's map collision.
         */
        var regionCount = 0
        XteaConfig.xteas.keys.forEach { regionId ->
            val mapEntry = cache.mapArchive[regionId]
            collisionMap.applyCollision(mapEntry)
            regionCount++
        }
        Logger.info("Successfully loaded $regionCount region collision maps.")
    }

    fun cycle() {

    }

    fun addPlayer(player: Player) {
        players.add(player)
    }

    fun removePlayer(player: Player) {
        players.remove(player)
    }

    companion object {
        const val MAX_PLAYERS = 2048
        const val MAX_NPCS = 65535
    }
}