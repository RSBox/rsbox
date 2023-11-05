package io.rsbox.server.engine

import io.rsbox.server.common.inject
import io.rsbox.server.config.ServerConfig
import io.rsbox.server.engine.event.EngineCycleEndEvent
import io.rsbox.server.engine.event.EngineCycleStartEvent
import io.rsbox.server.engine.event.EngineInitEvent
import io.rsbox.server.engine.event.EventBus.publish
import io.rsbox.server.engine.model.World
import io.rsbox.server.engine.net.NetworkServer
import io.rsbox.server.engine.net.http.HttpServer
import io.rsbox.server.engine.sync.SyncTaskList
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.cancel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.koin.core.qualifier.named
import org.tinylog.kotlin.Logger
import java.util.concurrent.TimeUnit
import kotlin.system.measureNanoTime

class Engine {

    private val networkServer: NetworkServer by inject()
    private val httpServer: HttpServer by inject()
    private val world: World by inject()
    private val syncTasks: SyncTaskList by inject()
    private val engineCoroutine: CoroutineScope by inject(named("engine"))

    var running = false
    private var prevCycleNanos = 0L

    fun start() {
        Logger.info("Starting RSBox engine.")

        running = true

        world.load()
        engineCoroutine.start()
        httpServer.start()
        networkServer.start()

        publish(EngineInitEvent)
    }

    fun stop() {
        Logger.info("Stopping RSBox engine.")

        running = false

        engineCoroutine.cancel()
        httpServer.stop()
        networkServer.stop()
    }

    private fun CoroutineScope.start() = launch {
        while(running) {
            val activeNanos = measureNanoTime { cycle() } + prevCycleNanos
            val activeMillis = TimeUnit.NANOSECONDS.toMillis(activeNanos)
            val idleMillis = if(activeMillis > ServerConfig.TICK_RATE) {
                val curCycle = activeMillis / ServerConfig.TICK_RATE
                (curCycle + 1) * ServerConfig.TICK_RATE - activeMillis
            } else {
                ServerConfig.TICK_RATE - activeMillis
            }
            if(activeMillis > ServerConfig.TICK_RATE) {
                Logger.warn("Cycle took longer than expected. Is the server lagging? (Active: ${activeMillis}ms, Idle: ${idleMillis}ms)")
            }
            prevCycleNanos = activeNanos - TimeUnit.MILLISECONDS.toNanos(activeMillis)
            delay(idleMillis)
        }
    }

    private suspend fun cycle() {
        publish(EngineCycleStartEvent)
        world.cycle()
        world.npcs.forEachEntry { it.cycle() }
        world.players.forEachEntry { it.cycle() }
        world.players.forEachEntry { it.session.cycle() }
        syncTasks.forEach { it.execute() }
        world.players.forEachEntry { it.session.flush() }
        publish(EngineCycleEndEvent)
    }
}