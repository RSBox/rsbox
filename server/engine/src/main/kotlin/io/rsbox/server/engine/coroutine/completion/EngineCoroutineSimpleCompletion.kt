package io.rsbox.server.engine.coroutine.completion

import kotlin.coroutines.Continuation
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.coroutines.cancellation.CancellationException

object EngineCoroutineSimpleCompletion : Continuation<Unit> {

    override val context get() = EmptyCoroutineContext

    override fun resumeWith(result: Result<Unit>) {
        result.exceptionOrNull()?.let { if(it !is CancellationException) throw it }
    }
}