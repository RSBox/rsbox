package io.rsbox.server.engine.event

import io.rsbox.server.common.get
import io.rsbox.server.engine.Engine

interface EngineEvent : Event {
    val engine get() = get<Engine>()
}

object EngineInitEvent : EngineEvent
object EngineCycleStartEvent : EngineEvent
object EngineCycleEndEvent : EngineEvent