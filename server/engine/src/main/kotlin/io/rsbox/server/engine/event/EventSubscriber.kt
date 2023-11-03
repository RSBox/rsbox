package io.rsbox.server.engine.event

class EventSubscriber<T : Event>(val priority: Int = 0, val action: T.() -> Unit)