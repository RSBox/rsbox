package io.rsbox.server.engine.api.ext

import io.rsbox.server.engine.event.EventBus
import io.rsbox.server.engine.event.PlayerLoginEvent
import io.rsbox.server.engine.event.PlayerLogoutEvent

@ScriptDslMarker
fun on_login(action: PlayerLoginEvent.() -> Unit) = EventBus.subscribe(Int.MAX_VALUE, action)

@ScriptDslMarker
fun on_logout(action: PlayerLogoutEvent.() -> Unit) = EventBus.subscribe(Int.MAX_VALUE, action)