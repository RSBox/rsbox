package io.rsbox.server.engine.coroutine.resume

interface ResumeCondition<T> {

    fun resumeOrNull(): T?

}