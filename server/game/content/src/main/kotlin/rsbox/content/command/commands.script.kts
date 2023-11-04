import io.rsbox.server.engine.model.Privilege
import io.rsbox.server.engine.model.coord.Tile
import rsbox.content.command.on_command

on_command("test") { player, args ->
    player.sendGameMessage("Boom this works")
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