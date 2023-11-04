package io.rsbox.server.engine.event

import io.rsbox.server.engine.model.entity.Player

interface PlayerEvent : Event {
    val player: Player
}

class PlayerLoginEvent(override val player: Player) : PlayerEvent

class PlayerLogoutEvent(override val player: Player) : PlayerEvent

class PlayerCommandEvent(override val player: Player, val command: String, vararg val args: String) : PlayerEvent