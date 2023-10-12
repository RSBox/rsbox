package io.rsbox.server.engine.coroutine

import kotlin.coroutines.*
import kotlin.coroutines.intrinsics.COROUTINE_SUSPENDED
import kotlin.coroutines.intrinsics.suspendCoroutineUninterceptedOrReturn
import kotlin.coroutines.cancellation.CancellationException
import kotlin.reflect.KClass

val CoroutineContext.task: EngineCoroutineTask get() = get(EngineCoroutineTask) ?: error("Engine coroutine task has not been set.")

suspend fun wait(ticks: Int = 1) {
    if(ticks <= 0) return
    return suspendCoroutineUninterceptedOrReturn {
        it.context.task.wait(ticks, it)
        COROUTINE_SUSPENDED
    }
}

suspend fun waitUntil(predicate: () -> Boolean) {
    if(predicate()) return
    return suspendCoroutineUninterceptedOrReturn {
        it.context.task.wait(predicate, it)
        COROUTINE_SUSPENDED
    }
}

suspend inline fun <reified T : Any> waitForEvent(noinline predicate: (T) -> Boolean = { true }): T {
    return suspendCoroutineUninterceptedOrReturn {
        it.context.task.wait(T::class, predicate, it)
        COROUTINE_SUSPENDED
    }
}

suspend fun cancel() = coroutineContext.task.cancel()

class EngineCoroutine<T : Any>(
    private val continuation: Continuation<T>,
    private val state: EngineCoroutineState<T>
) {

    fun resume(): Boolean {
        if(!state.resume()) {
            return false
        }
        val value = state.get()
        continuation.resume(value)
        return true
    }

    fun submit(value: T) {
        if(state !is EngineCoroutineEventState) return
        if(state.type == value::class) {
            state.set(value)
        }
    }
}

class EngineCoroutineTask(private var coroutine: EngineCoroutine<out Any>? = null) : AbstractCoroutineContextElement(EngineCoroutineTask) {

    companion object Key : CoroutineContext.Key<EngineCoroutineTask>

    val idle: Boolean get() = coroutine == null

    fun wait(ticks: Int, continuation: Continuation<Unit>) {
        val condition = EngineCoroutineTickState(ticks)
        coroutine = EngineCoroutine(continuation, condition)
    }

    fun wait(predicate: () -> Boolean, continuation: Continuation<Unit>) {
        val condition = EngineCoroutinePredicateState(predicate)
        coroutine = EngineCoroutine(continuation, condition)
    }

    fun <T : Any> wait(event: KClass<T>, predicate: (T) -> Boolean, continuation: Continuation<T>) {
        val condition = EngineCoroutineEventState(event, predicate)
        coroutine = EngineCoroutine(continuation, condition)
    }

    fun cycle() {
        val coroutine = coroutine ?: return
        val resume = coroutine.resume()
        if(resume && this.coroutine == coroutine) {
            this.coroutine = null
        }
    }

    fun cancel() {
        coroutine = null
        throw CancellationException()
    }

    @Suppress("UNCHECKED_CAST")
    fun <T : Any> submit(event: T) {
        val coroutine = coroutine as? EngineCoroutine<Any> ?: return
        coroutine.submit(event)
    }

    fun launch(block: suspend () -> Unit) {
        block.startCoroutine(DefaultEngineCoroutineContinuation)
    }
}

object DefaultEngineCoroutineContinuation : Continuation<Unit> {

    override val context: CoroutineContext = EmptyCoroutineContext

    override fun resumeWith(result: Result<Unit>) {
        val error = result.exceptionOrNull()
        if(error != null && error !is CancellationException) {
            throw error
        }
    }
}

interface EngineCoroutineState<T> {
    fun resume(): Boolean
    fun get(): T
}

class EngineCoroutineTickState(private var ticks: Int) : EngineCoroutineState<Unit> {

    override fun resume(): Boolean {
        return --ticks == 0
    }

    override fun get() {}
}

class EngineCoroutinePredicateState(private val predicate: () -> Boolean) : EngineCoroutineState<Unit> {

    override fun resume(): Boolean {
        return predicate()
    }

    override fun get() {}
}

class EngineCoroutineEventState<T : Any>(
    val type: KClass<T>,
    val predicate: (T) -> Boolean,
    private var resume: Boolean = false
) : EngineCoroutineState<T> {

    private lateinit var value: T

    fun set(value: T) {
        this.value = value
        this.resume = true
    }

    override fun resume(): Boolean {
        return resume && predicate(value)
    }

    override fun get(): T {
        return value
    }
}