@file:Suppress("UNCHECKED_CAST")

package io.rsbox.server.engine.event

object EventBus {

    val events = mutableMapOf<Class<out Event>, MutableList<EventSubscriber<*>>>()

    inline fun <reified T : Event> subscribe(priority: Int = 0, noinline action: T.() -> Unit) {
        events.computeIfAbsent(T::class.java) { mutableListOf() }.add(EventSubscriber(priority, action))
    }

    inline fun <reified T : Event> publish(event: T) {
        val events = (events[T::class.java] as? MutableList<EventSubscriber<T>>)?.sortedByDescending { it.priority } ?: return
        events.forEach {
            it.action(event)
        }
    }
}