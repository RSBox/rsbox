package io.rsbox.server.engine.net.login

import io.rsbox.server.engine.model.entity.Player
import io.rsbox.server.engine.net.Message

data class LoginResponse(val player: Player) : Message