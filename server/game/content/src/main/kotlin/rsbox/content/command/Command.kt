package rsbox.content.command

import io.rsbox.server.engine.model.Privilege
import io.rsbox.server.engine.model.entity.Player

data class Command(
    val command: String,
    val privilege: Privilege,
    val action: (player: Player, args: List<String>) -> Unit
)