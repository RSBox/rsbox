package io.rsbox.server.engine.coroutine

import io.rsbox.server.engine.coroutine.completion.EngineCoroutineSimpleCompletion
import kotlin.coroutines.Continuation
import kotlin.coroutines.cancellation.CancellationException
import kotlin.coroutines.startCoroutine

class EngineCoroutineScope {

    val children = mutableListOf<EngineCoroutine>()

    fun launch(
        coroutine: EngineCoroutine = EngineCoroutine(),
        completion: Continuation<Unit> = EngineCoroutineSimpleCompletion,
        block: suspend EngineCoroutine.() -> Unit
    ): EngineCoroutine {
        block.startCoroutine(coroutine, completion)
        if(coroutine.isSuspended()) children += coroutine
        return coroutine
    }

    fun advance() {
        children.forEach { it.resume() }
        children.removeIf { it.isIdle() }
    }

    fun cancel() {
        children.forEach { it.cancel(CancellationException()) }
        children.clear()
    }
}