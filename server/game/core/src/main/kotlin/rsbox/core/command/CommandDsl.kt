package rsbox.core.command

import io.rsbox.server.engine.model.Privilege
import io.rsbox.server.engine.model.entity.Player

@DslMarker
annotation class CommandDsl

@CommandDsl
fun on_command(
    command: String,
    privilege: Privilege = Privilege.PLAYER,
    action: (player: Player, args: List<String>) -> Unit
) {
    CommandManager.registerCommand(Command(command, privilege, action))
}