package io.rsbox.server.engine.event

import io.rsbox.server.engine.model.entity.Player

interface PlayerEvent : Event {
    val player: Player
}

data class PlayerLoginEvent(override val player: Player) : PlayerEvent
data class PlayerLogoutEvent(override val player: Player) : PlayerEvent