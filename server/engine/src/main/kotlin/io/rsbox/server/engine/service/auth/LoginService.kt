package io.rsbox.server.engine.service.auth

import com.google.common.util.concurrent.ThreadFactoryBuilder
import io.rsbox.server.common.inject
import io.rsbox.server.engine.model.World
import io.rsbox.server.engine.net.StatusResponse
import io.rsbox.server.engine.net.game.GameProtocol
import io.rsbox.server.engine.net.login.LoginRequest
import io.rsbox.server.engine.net.login.LoginResponse
import io.rsbox.server.engine.service.Service
import io.rsbox.server.engine.service.ServiceManager
import io.rsbox.server.engine.service.serializer.JsonPlayerSerializer
import org.tinylog.kotlin.Logger
import java.util.concurrent.Executors
import java.util.concurrent.LinkedBlockingQueue

class LoginService : Service {

    private val world: World by inject()
    private val serviceManager: ServiceManager by inject()
    private val serializer by lazy { serviceManager[JsonPlayerSerializer::class] }

    private val threadCount = 2
    private val executor = ThreadFactoryBuilder()
        .setNameFormat("login-thread")
        .setUncaughtExceptionHandler { _, e -> Logger.error(e) { "Error on during login." } }
        .build()
        .let { Executors.newFixedThreadPool(threadCount, it) }

    private val queue = LinkedBlockingQueue<LoginRequest>()

    override fun start() {
        repeat(threadCount) {
            executor.execute(::run)
        }
    }

    override fun stop() {
        executor.shutdown()
    }

    fun queueLogin(request: LoginRequest) {
        queue.add(request)
    }

    private fun run() {
        while(true) {
            val request = queue.take()
            try {
                var player = serializer.load(request) ?: serializer.create(request)

                if(player.username != request.username || player.passwordHash != request.password) {
                    if(request.reconnecting) {
                    } else {
                        request.session.writeAndFlush(StatusResponse.INVALID_CREDENTIALS)
                        continue
                    }
                }

                if(world.players.any { it?.username == request.username }) {
                    request.session.writeAndFlush(StatusResponse.ACCOUNT_ONLINE)
                    continue
                }

                // Successful
                world.addPlayer(player)

                val response = LoginResponse(player)
                player.session.writeAndFlush(response).addListener {
                    if(it.isSuccess) {
                        player.session.protocol.set(GameProtocol(player.session))
                        player.login()
                    }
                }

            } catch (e : Exception) {
                Logger.error(e) { "Error when processing login request." }
            }
        }
    }
}