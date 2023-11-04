package io.rsbox.server.engine.coroutine.resume

import kotlin.reflect.KClass

class DeferResumeCondition<T : Any>(val type: KClass<T>) : ResumeCondition<T> {

    private var value: T? = null

    fun set(value: T) {
        this.value = value
    }

    override fun resumeOrNull(): T? {
        return value
    }
}