package io.rsbox.server.engine.service.serializer

import io.rsbox.server.engine.model.entity.Player
import io.rsbox.server.engine.net.login.LoginRequest
import io.rsbox.server.engine.service.Service

interface PlayerSerializer : Service {
    override fun start() {}
    override fun stop() {}

    fun create(request: LoginRequest): Player
    fun load(request: LoginRequest): Player?
    fun save(player: Player)

}