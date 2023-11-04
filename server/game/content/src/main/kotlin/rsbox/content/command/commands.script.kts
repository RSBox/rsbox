package rsbox.content.command

import io.rsbox.server.engine.api.Npcs
import io.rsbox.server.engine.model.Direction
import io.rsbox.server.engine.model.Privilege
import io.rsbox.server.engine.model.coord.Tile
import io.rsbox.server.engine.model.entity.Npc

on_command("test") { player, args ->
    player.sendGameMessage("Spawning test NPC")
    val npc = Npc(Npcs.man_3107, player.tile.translate(Direction.SOUTH))
    player.world.addNpc(npc)
    player.sendGameMessage("Successfully spawned npc")
    player.task {
        while(true) {
            npc.walkTo(player.prevTile)
            wait(1)
        }
    }
}

on_command("npc", Privilege.ADMIN) { player, args ->
    if(args.isEmpty()) {
        player.sendGameMessage("<col=ff0000>Usage: ::npc <id></col>")
        return@on_command
    }

    val id = args[0].toInt()
    val spawnTile = player.tile

    val npc = try { Npc(id, spawnTile) } catch (e: Throwable) {
        player.sendGameMessage("Npc[id=$id] was not found in game cache.")
        return@on_command
    }

    player.world.addNpc(npc)
    player.sendGameMessage("<col=0000ff>Spawned Npc[id=$id] at Tile[x: ${spawnTile.x}, y: ${spawnTile.y}, level: ${spawnTile.level}].</col>")
}

on_command("tele", Privilege.ADMIN) { player, args ->
    if(args.size < 2) {
        player.sendGameMessage("<col=ff0000>Usage: ::tele <x> <y> [level]</col>")
        return@on_command
    }

    val x = args[0].let {
        if(it === "~") player.tile.x
        else if(it.startsWith("~")) player.tile.x + it.substring(1).toInt()
        else it.toInt()
    }

    val y = args[1].let {
        if(it === "~") player.tile.y
        else if(it.startsWith("~")) player.tile.y + it.substring(1).toInt()
        else it.toInt()
    }

    val level = if(args.size == 3) {
        args[2].let {
            if(it === "~") player.tile.level
            else if(it.startsWith("~")) player.tile.level + it.substring(1).toInt()
            else it.toInt()
        }
    } else {
        player.tile.level
    }

    player.teleportTo(Tile(x, y, level))
    player.sendGameMessage("<col=0000ff>Teleporting to tile: [x: $x, y: $y, level: $level]</col>")
}