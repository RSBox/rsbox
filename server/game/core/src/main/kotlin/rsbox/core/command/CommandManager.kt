package rsbox.core.command

import io.rsbox.server.engine.event.EventBus
import io.rsbox.server.engine.event.PlayerCommandEvent
import io.rsbox.server.engine.model.entity.Player
import org.tinylog.kotlin.Logger

object CommandManager {

    private val commands = mutableMapOf<String, Command>()

    init {
        EventBus.subscribe<PlayerCommandEvent> {
            handleCommand(player, command, args)
        }
    }

    internal fun registerCommand(command: Command) {
        if(commands.containsKey(command.command)) {
            Logger.error("Failed to register command: ${command.command} as it already is registered.")
            return
        }
        commands[command.command] = command
    }

    private fun handleCommand(player: Player, command: String, args: Array<out String>) {
        val cmd = commands[command]
        if(cmd == null) {
            player.sendGameMessage("Command does not exist.")
            return
        }

        if(player.privilege < cmd.privilege) {
            player.sendGameMessage("You do not have permission to use this command.")
            return
        }

        cmd.action(player, args.toList())
    }
}