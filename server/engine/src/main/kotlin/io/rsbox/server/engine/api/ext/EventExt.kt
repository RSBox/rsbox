package io.rsbox.server.engine.api.ext

import io.rsbox.server.engine.event.EngineInitEvent
import io.rsbox.server.engine.event.EventBus.subscribe
import io.rsbox.server.engine.event.PlayerEvent
import io.rsbox.server.engine.event.PlayerLoginEvent
import io.rsbox.server.engine.event.PlayerLogoutEvent
import kotlin.reflect.KClass

suspend fun PlayerEvent.wait(ticks: Int) = player.coroutine?.wait(ticks)
suspend fun PlayerEvent.wait(resume: () -> Boolean) = player.coroutine?.wait(resume)
suspend inline fun <reified T : Any> PlayerEvent.wait() = player.coroutine?.wait<T>()
suspend fun <T : Any> PlayerEvent.wait(type: KClass<T>) = player.coroutine?.wait(type)

@DslMarker
annotation class ScriptDslMarker

@ScriptDslMarker
fun on_login(action: suspend PlayerLoginEvent.() -> Unit) {
    subscribe<PlayerLoginEvent>(Int.MAX_VALUE) { player.task { action() } }
}

@ScriptDslMarker
fun on_logout(action: suspend PlayerLogoutEvent.() -> Unit) {
    subscribe<PlayerLogoutEvent>(Int.MAX_VALUE) { player.task { action() } }
}

@ScriptDslMarker
fun on_init(action: EngineInitEvent.() -> Unit) {
    subscribe<EngineInitEvent> { action() }
}