package io.rsbox.server.engine.model.manager

import io.rsbox.server.engine.model.coord.Chunk
import io.rsbox.server.engine.model.coord.Region
import io.rsbox.server.engine.model.coord.Tile
import io.rsbox.server.engine.model.entity.Player
import io.rsbox.server.engine.net.packet.server.RebuildNormalServerPacket
import kotlin.math.abs

class SceneManager(private val player: Player) {

    var baseTile: Tile = player.tile

    val regions: List<Region> get() {
        val list = mutableListOf<Region>()
        val baseChunk = baseTile.toChunk()

        for(rx in baseChunk.x.sceneMin..baseChunk.x.sceneMax) {
            for(ry in baseChunk.y.sceneMin .. baseChunk.y.sceneMax) {
                val region = Region(rx, ry)
                list.add(region)
            }
        }

        return list
    }

    fun init() {
        baseTile = player.tile
        player.session.write(RebuildNormalServerPacket(player, gpi = true))
    }

    fun cycle() {
        if(shouldRebuild()) {
            baseTile = player.tile
            player.session.write(RebuildNormalServerPacket(player, gpi = false))
        }
    }

    private fun shouldRebuild(): Boolean {
        val baseChunk = baseTile.toChunk()
        val chunk = player.tile.toChunk()
        val limit = ((104 shr 3) / 2) - 1
        return abs(baseChunk.x - chunk.x) >= limit || abs(baseChunk.y - chunk.y) >= limit
    }

    companion object {

        private val Int.sceneMin get() = (this - 6) / Chunk.SIZE
        private val Int.sceneMax get() = (this + 6) / Chunk.SIZE
    }
}