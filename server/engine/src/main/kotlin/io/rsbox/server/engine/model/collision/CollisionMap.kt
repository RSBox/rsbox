package io.rsbox.server.engine.model.collision

import io.rsbox.server.cache.GameCache
import io.rsbox.server.cache.map.MapRegionEntry
import io.rsbox.server.common.inject
import io.rsbox.server.engine.model.Direction
import io.rsbox.server.engine.model.GameObject
import io.rsbox.server.engine.model.coord.Region
import io.rsbox.server.engine.model.coord.Tile
import org.rsmod.pathfinder.StepValidator
import org.rsmod.pathfinder.ZoneFlags
import org.rsmod.pathfinder.collision.CollisionStrategies
import org.rsmod.pathfinder.flag.CollisionFlag
import org.rsmod.pathfinder.flag.CollisionFlag.BLOCK_NPCS
import org.rsmod.pathfinder.flag.CollisionFlag.FLOOR
import org.rsmod.pathfinder.flag.CollisionFlag.FLOOR_DECORATION

class CollisionMap(private val flags: ZoneFlags = ZoneFlags()) {

    private val cache: GameCache by inject()

    fun flags() = flags.flags

    fun canTravel(tile: Tile, direction: Direction): Boolean {
        return StepValidator(flags(), 0x0).canTravel(tile.x, tile.y, tile.level, 1,  direction.deltaX, direction.deltaY, 0, CollisionStrategies.Normal)
    }

    fun applyCollision(entry: MapRegionEntry) {
        for(level in 0 until 4) {
            for(x in 0 until Region.SIZE) {
                for(y in 0 until Region.SIZE) {
                    if((entry.terrain[entry.pack(x, y, level)]!!.collision and 0x1) != 0x1) continue
                    val newLevel = if(entry.terrain[entry.pack(x, y, 1)]!!.collision and 0x2 == 0x2) level - 1 else level
                    if(newLevel < 0) continue
                    val baseX = entry.regionX shl 6
                    val baseY = entry.regionY shl 6
                    val tile = Tile(baseX + x, baseY + y, newLevel)
                    addFloorCollision(tile)
                }
            }
        }

        for(level in 0 until 4) {
            for(x in 0 until Region.SIZE) {
                for(y in 0 until Region.SIZE) {
                    val baseX = entry.regionX shl 6
                    val baseY = entry.regionY shl 6
                    entry.locations[entry.pack(x, y, level)]?.forEach { loc ->
                        if(loc == null) return@forEach
                        val tile = Tile(baseX + loc.x, baseY + loc.y, loc.level)
                        if(!cache.configArchive.objects.containsKey(loc.id)) return@forEach
                        val gameObject = GameObject(loc.id, tile, loc.shape, loc.rotation)
                        addObjectCollision(gameObject)
                    }
                }
            }
        }
    }

    fun addEntityCollision(tile: Tile) = addCollisionFlag(tile, BLOCK_NPCS)
    fun removeEntityCollision(tile: Tile) = removeCollisionFlag(tile, BLOCK_NPCS)

    fun getCollisionFlag(tile: Tile) = flags[tile.x, tile.y, tile.level]


    fun addCollisionFlag(tile: Tile, mask: Int) = flags.add(tile.x, tile.y, tile.level, mask)
    fun removeCollisionFlag(tile: Tile, mask: Int) = flags.remove(tile.x, tile.y, tile.level, mask)

    fun addCollisionFlag(tile: Tile, mask: Int, add: Boolean) = when(add) {
        true -> addCollisionFlag(tile, mask)
        else -> removeCollisionFlag(tile, mask)
    }

    fun addFloorCollision(tile: Tile) = addCollisionFlag(tile, FLOOR)
    fun addFloorDecorCollision(tile: Tile, add: Boolean) = addCollisionFlag(tile, FLOOR_DECORATION, add)

    fun addObjectCollision(obj: GameObject) = changeNormalCollision(obj, true)
    fun removeObjectCollision(obj: GameObject) = changeNormalCollision(obj, false)

    private fun changeNormalCollision(obj: GameObject, add: Boolean) {
        val entry = cache.configArchive.objects[obj.id] ?: return
        val shape = obj.shape
        val tile = obj.tile
        val rotation = obj.rotation
        val interactType = entry.interactType
        val blockProjectile = entry.blockProjectile
        val breakRouteFinding = entry.breakRouteFinding

        when {
            shape in GameObjectShape.WALL_SHAPES && interactType != 0 -> {
                changeWallCollision(
                    tile,
                    rotation,
                    shape,
                    blockProjectile,
                    !breakRouteFinding,
                    add
                )
            }
            shape in GameObjectShape.NORMAL_SHAPES && interactType != 0 -> {
                var width = entry.width
                var length = entry.length
                if (rotation == 1 || rotation == 3) {
                    width = entry.length
                    length = entry.width
                }
                changeNormalCollision(
                    tile,
                    width,
                    length,
                    blockProjectile,
                    !breakRouteFinding,
                    add
                )
            }
            shape in GameObjectShape.GROUND_DECOR_SHAPES && interactType == 1 -> addFloorDecorCollision(tile, add)
        }
    }

    private fun changeNormalCollision(
        tile: Tile,
        width: Int,
        length: Int,
        blocksProjectile: Boolean,
        breakRouteFinding: Boolean,
        add: Boolean
    ) {
        var flag = CollisionFlag.OBJECT

        if (blocksProjectile) {
            flag = flag or CollisionFlag.OBJECT_PROJECTILE_BLOCKER
        }

        if (breakRouteFinding) {
            flag = flag or CollisionFlag.OBJECT_ROUTE_BLOCKER
        }

        for (x in 0 until width) {
            for (y in 0 until length) {
                val translate = tile.translate(x, y)
                addCollisionFlag(translate, flag, add)
            }
        }
    }

    private fun changeWallRouteFinding(
        tile: Tile,
        rotation: Int,
        shape: Int,
        add: Boolean
    ) {
        when (shape) {
            GameObjectShape.WALL_STRAIGHT -> when (rotation) {
                0 -> {
                    addCollisionFlag(tile, CollisionFlag.WALL_WEST_ROUTE_BLOCKER, add)
                    addCollisionFlag(tile.translate(-1, 0), CollisionFlag.WALL_EAST_ROUTE_BLOCKER, add)
                }
                1 -> {
                    addCollisionFlag(tile, CollisionFlag.WALL_NORTH_ROUTE_BLOCKER, add)
                    addCollisionFlag(tile.translate(0, 1), CollisionFlag.WALL_SOUTH_ROUTE_BLOCKER, add)
                }
                2 -> {
                    addCollisionFlag(tile, CollisionFlag.WALL_EAST_ROUTE_BLOCKER, add)
                    addCollisionFlag(tile.translate(1, 0), CollisionFlag.WALL_WEST_ROUTE_BLOCKER, add)
                }
                3 -> {
                    addCollisionFlag(tile, CollisionFlag.WALL_SOUTH_ROUTE_BLOCKER, add)
                    addCollisionFlag(tile.translate(0, -1), CollisionFlag.WALL_NORTH_ROUTE_BLOCKER, add)
                }
            }
            GameObjectShape.WALL_DIAGONALCORNER, GameObjectShape.WALL_SQUARECORNER -> when (rotation) {
                0 -> {
                    addCollisionFlag(tile, CollisionFlag.WALL_NORTH_WEST_ROUTE_BLOCKER, add)
                    addCollisionFlag(tile.translate(-1, 1), CollisionFlag.WALL_SOUTH_EAST_ROUTE_BLOCKER, add)
                }
                1 -> {
                    addCollisionFlag(tile, CollisionFlag.WALL_NORTH_EAST_ROUTE_BLOCKER, add)
                    addCollisionFlag(tile.translate(1, 1), CollisionFlag.WALL_SOUTH_WEST_ROUTE_BLOCKER, add)
                }
                2 -> {
                    addCollisionFlag(tile, CollisionFlag.WALL_SOUTH_EAST_ROUTE_BLOCKER, add)
                    addCollisionFlag(tile.translate(1, -1), CollisionFlag.WALL_NORTH_WEST_ROUTE_BLOCKER, add)
                }
                3 -> {
                    addCollisionFlag(tile, CollisionFlag.WALL_SOUTH_WEST_ROUTE_BLOCKER, add)
                    addCollisionFlag(tile.translate(-1, -1), CollisionFlag.WALL_NORTH_EAST_ROUTE_BLOCKER, add)
                }
            }
            GameObjectShape.WALL_L -> when (rotation) {
                0 -> {
                    addCollisionFlag(tile, CollisionFlag.WALL_NORTH_ROUTE_BLOCKER or CollisionFlag.WALL_WEST_ROUTE_BLOCKER, add)
                    addCollisionFlag(tile.translate(-1, 0), CollisionFlag.WALL_EAST_ROUTE_BLOCKER, add)
                    addCollisionFlag(tile.translate(0, 1), CollisionFlag.WALL_SOUTH_ROUTE_BLOCKER, add)
                }
                1 -> {
                    addCollisionFlag(tile, CollisionFlag.WALL_NORTH_ROUTE_BLOCKER or CollisionFlag.WALL_EAST_ROUTE_BLOCKER, add)
                    addCollisionFlag(tile.translate(0, 1), CollisionFlag.WALL_SOUTH_ROUTE_BLOCKER, add)
                    addCollisionFlag(tile.translate(1, 0), CollisionFlag.WALL_WEST_ROUTE_BLOCKER, add)
                }
                2 -> {
                    addCollisionFlag(tile, CollisionFlag.WALL_SOUTH_ROUTE_BLOCKER or CollisionFlag.WALL_EAST_ROUTE_BLOCKER, add)
                    addCollisionFlag(tile.translate(1, 0), CollisionFlag.WALL_WEST_ROUTE_BLOCKER, add)
                    addCollisionFlag(tile.translate(0, -1), CollisionFlag.WALL_NORTH_ROUTE_BLOCKER, add)
                }
                3 -> {
                    addCollisionFlag(tile, CollisionFlag.WALL_SOUTH_ROUTE_BLOCKER or CollisionFlag.WALL_WEST_ROUTE_BLOCKER, add)
                    addCollisionFlag(tile.translate(0, -1), CollisionFlag.WALL_NORTH_ROUTE_BLOCKER, add)
                    addCollisionFlag(tile.translate(-1, 0), CollisionFlag.WALL_EAST_ROUTE_BLOCKER, add)
                }
            }
        }
    }

    private fun changeWallCollision(
        tile: Tile,
        rotation: Int,
        shape: Int,
        blockProjectile: Boolean,
        breakRouteFinding: Boolean,
        add: Boolean
    ) {
        changeWallCollision(tile, rotation, shape, add)
        if (blockProjectile) changeWallProjectileCollision(tile, rotation, shape, add)
        if (breakRouteFinding) changeWallRouteFinding(tile, rotation, shape, add)
    }

    private fun changeWallProjectileCollision(tile: Tile, rotation: Int, shape: Int, add: Boolean) {
        when (shape) {
            GameObjectShape.WALL_STRAIGHT -> when (rotation) {
                0 -> {
                    addCollisionFlag(tile, CollisionFlag.WALL_WEST_PROJECTILE_BLOCKER, add)
                    addCollisionFlag(tile.translate(-1, 0), CollisionFlag.WALL_EAST_PROJECTILE_BLOCKER, add)
                }
                1 -> {
                    addCollisionFlag(tile, CollisionFlag.WALL_NORTH_PROJECTILE_BLOCKER, add)
                    addCollisionFlag(tile.translate(0, 1), CollisionFlag.WALL_SOUTH_PROJECTILE_BLOCKER, add)
                }
                2 -> {
                    addCollisionFlag(tile, CollisionFlag.WALL_EAST_PROJECTILE_BLOCKER, add)
                    addCollisionFlag(tile.translate(1, 0), CollisionFlag.WALL_WEST_PROJECTILE_BLOCKER, add)
                }
                3 -> {
                    addCollisionFlag(tile, CollisionFlag.WALL_SOUTH_PROJECTILE_BLOCKER, add)
                    addCollisionFlag(tile.translate(0, -1), CollisionFlag.WALL_NORTH_PROJECTILE_BLOCKER, add)
                }
            }
            GameObjectShape.WALL_DIAGONALCORNER, GameObjectShape.WALL_SQUARECORNER -> when (rotation) {
                0 -> {
                    addCollisionFlag(tile, CollisionFlag.WALL_NORTH_WEST_PROJECTILE_BLOCKER, add)
                    addCollisionFlag(tile.translate(-1, 1), CollisionFlag.WALL_SOUTH_EAST_PROJECTILE_BLOCKER, add)
                }
                1 -> {
                    addCollisionFlag(tile, CollisionFlag.WALL_NORTH_EAST_PROJECTILE_BLOCKER, add)
                    addCollisionFlag(tile.translate(1, 1), CollisionFlag.WALL_SOUTH_WEST_PROJECTILE_BLOCKER, add)
                }
                2 -> {
                    addCollisionFlag(tile, CollisionFlag.WALL_SOUTH_EAST_PROJECTILE_BLOCKER, add)
                    addCollisionFlag(tile.translate(1, -1), CollisionFlag.WALL_NORTH_WEST_PROJECTILE_BLOCKER, add)
                }
                3 -> {
                    addCollisionFlag(tile, CollisionFlag.WALL_SOUTH_WEST_PROJECTILE_BLOCKER, add)
                    addCollisionFlag(tile.translate(-1, -1), CollisionFlag.WALL_NORTH_EAST_PROJECTILE_BLOCKER, add)
                }
            }
            GameObjectShape.WALL_L -> when (rotation) {
                0 -> {
                    val flag = CollisionFlag.WALL_WEST_PROJECTILE_BLOCKER or CollisionFlag.WALL_NORTH_PROJECTILE_BLOCKER
                    addCollisionFlag(tile, flag, add)
                    addCollisionFlag(tile.translate(-1, 0), CollisionFlag.WALL_EAST_PROJECTILE_BLOCKER, add)
                    addCollisionFlag(tile.translate(0, 1), CollisionFlag.WALL_SOUTH_PROJECTILE_BLOCKER, add)
                }
                1 -> {
                    val flag = CollisionFlag.WALL_NORTH_PROJECTILE_BLOCKER or CollisionFlag.WALL_EAST_PROJECTILE_BLOCKER
                    addCollisionFlag(tile, flag, add)
                    addCollisionFlag(tile.translate(0, 1), CollisionFlag.WALL_SOUTH_PROJECTILE_BLOCKER, add)
                    addCollisionFlag(tile.translate(1, 0), CollisionFlag.WALL_WEST_PROJECTILE_BLOCKER, add)
                }
                2 -> {
                    val flag = CollisionFlag.WALL_EAST_PROJECTILE_BLOCKER or CollisionFlag.WALL_SOUTH_PROJECTILE_BLOCKER
                    addCollisionFlag(tile, flag, add)
                    addCollisionFlag(tile.translate(1, 0), CollisionFlag.WALL_WEST_PROJECTILE_BLOCKER, add)
                    addCollisionFlag(tile.translate(0, -1), CollisionFlag.WALL_NORTH_PROJECTILE_BLOCKER, add)
                }
                3 -> {
                    val flag = CollisionFlag.WALL_SOUTH_PROJECTILE_BLOCKER or CollisionFlag.WALL_WEST_PROJECTILE_BLOCKER
                    addCollisionFlag(tile, flag, add)
                    addCollisionFlag(tile.translate(0, -1), CollisionFlag.WALL_NORTH_PROJECTILE_BLOCKER, add)
                    addCollisionFlag(tile.translate(-1, 0), CollisionFlag.WALL_EAST_PROJECTILE_BLOCKER, add)
                }
            }
        }
    }

    private fun changeWallCollision(
        tile: Tile,
        rotation: Int,
        shape: Int,
        add: Boolean
    ) {
        when (shape) {
            GameObjectShape.WALL_STRAIGHT -> when (rotation) {
                0 -> {
                    addCollisionFlag(tile, CollisionFlag.WALL_WEST, add)
                    addCollisionFlag(tile.translate(-1, 0), CollisionFlag.WALL_EAST, add)
                }
                1 -> {
                    addCollisionFlag(tile, CollisionFlag.WALL_NORTH, add)
                    addCollisionFlag(tile.translate(0, 1), CollisionFlag.WALL_SOUTH, add)
                }
                2 -> {
                    addCollisionFlag(tile, CollisionFlag.WALL_EAST, add)
                    addCollisionFlag(tile.translate(1, 0), CollisionFlag.WALL_WEST, add)
                }
                3 -> {
                    addCollisionFlag(tile, CollisionFlag.WALL_SOUTH, add)
                    addCollisionFlag(tile.translate(0, -1), CollisionFlag.WALL_NORTH, add)
                }
            }
            GameObjectShape.WALL_DIAGONALCORNER, GameObjectShape.WALL_SQUARECORNER -> when (rotation) {
                0 -> {
                    addCollisionFlag(tile, CollisionFlag.WALL_NORTH_WEST, add)
                    addCollisionFlag(tile.translate(-1, 1), CollisionFlag.WALL_SOUTH_EAST, add)
                }
                1 -> {
                    addCollisionFlag(tile, CollisionFlag.WALL_NORTH_EAST, add)
                    addCollisionFlag(tile.translate(1, 1), CollisionFlag.WALL_SOUTH_WEST, add)
                }
                2 -> {
                    addCollisionFlag(tile, CollisionFlag.WALL_SOUTH_EAST, add)
                    addCollisionFlag(tile.translate(1, -1), CollisionFlag.WALL_NORTH_WEST, add)
                }
                3 -> {
                    addCollisionFlag(tile, CollisionFlag.WALL_SOUTH_WEST, add)
                    addCollisionFlag(tile.translate(-1, -1), CollisionFlag.WALL_NORTH_EAST, add)
                }
            }
            GameObjectShape.WALL_L -> when (rotation) {
                0 -> {
                    addCollisionFlag(tile, CollisionFlag.WALL_NORTH or CollisionFlag.WALL_WEST, add)
                    addCollisionFlag(tile.translate(-1, 0), CollisionFlag.WALL_EAST, add)
                    addCollisionFlag(tile.translate(0, 1), CollisionFlag.WALL_SOUTH, add)
                }
                1 -> {
                    addCollisionFlag(tile, CollisionFlag.WALL_NORTH or CollisionFlag.WALL_EAST, add)
                    addCollisionFlag(tile.translate(0, 1), CollisionFlag.WALL_SOUTH, add)
                    addCollisionFlag(tile.translate(1, 0), CollisionFlag.WALL_WEST, add)
                }
                2 -> {
                    addCollisionFlag(tile, CollisionFlag.WALL_SOUTH or CollisionFlag.WALL_EAST, add)
                    addCollisionFlag(tile.translate(1, 0), CollisionFlag.WALL_WEST, add)
                    addCollisionFlag(tile.translate(0, -1), CollisionFlag.WALL_NORTH, add)
                }
                3 -> {
                    addCollisionFlag(tile, CollisionFlag.WALL_SOUTH or CollisionFlag.WALL_WEST, add)
                    addCollisionFlag(tile.translate(0, -1), CollisionFlag.WALL_NORTH, add)
                    addCollisionFlag(tile.translate(-1, 0), CollisionFlag.WALL_EAST, add)
                }
            }
        }
    }
}