@file:Suppress("UNCHECKED_CAST")

package io.rsbox.server.engine.coroutine

import io.rsbox.server.engine.coroutine.resume.DeferResumeCondition
import io.rsbox.server.engine.coroutine.resume.PredicateResumeCondition
import io.rsbox.server.engine.coroutine.resume.TickResumeCondition
import kotlin.coroutines.cancellation.CancellationException
import kotlin.coroutines.intrinsics.COROUTINE_SUSPENDED
import kotlin.coroutines.intrinsics.suspendCoroutineUninterceptedOrReturn
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.reflect.KClass


class EngineCoroutine {

    var suspension: EngineCoroutineSuspension<Any>? = null

    fun isIdle() = !isSuspended()
    fun isSuspended() = suspension != null

    fun resume() {
        val suspension = suspension ?: return
        val resume = suspension.resume()
        if(resume && this.suspension === suspension) {
            this.suspension = null
        }
    }

    fun stop() {
        suspension = null
        throw CancellationException()
    }

    fun cancel(exception: CancellationException = CancellationException()) {
        suspension?.continuation?.resumeWithException(exception)
        suspension = null
    }

    fun resumeWith(value: Any) {
        val condition = suspension?.condition ?: error("Coroutine is not suspended.")
        if(condition !is DeferResumeCondition) return
        if(condition.type != value::class) return
        condition.set(value)
        resume()
    }

    suspend fun wait(ticks: Int) {
        if(ticks <= 0) return
        suspendCoroutineUninterceptedOrReturn {
            val condition = TickResumeCondition(ticks)
            suspension = EngineCoroutineSuspension(it, condition) as EngineCoroutineSuspension<Any>
            COROUTINE_SUSPENDED
        }
    }

    suspend fun wait(resume: () -> Boolean) {
        if(resume()) return
        suspendCoroutineUninterceptedOrReturn {
            val condition = PredicateResumeCondition(resume)
            suspension = EngineCoroutineSuspension(it, condition) as EngineCoroutineSuspension<Any>
            COROUTINE_SUSPENDED
        }
    }

    suspend inline fun <reified T : Any> wait(): T {
        return suspendCoroutineUninterceptedOrReturn {
            val condition = DeferResumeCondition(T::class)
            suspension = EngineCoroutineSuspension(it, condition) as EngineCoroutineSuspension<Any>
            COROUTINE_SUSPENDED
        }
    }

    suspend fun <T : Any> wait(type: KClass<T>): T {
        return suspendCoroutineUninterceptedOrReturn {
            val condition = DeferResumeCondition(type)
            suspension = EngineCoroutineSuspension(it, condition) as EngineCoroutineSuspension<Any>
            COROUTINE_SUSPENDED
        }
    }

    private companion object {
        private fun <T> EngineCoroutineSuspension<T>.resume(): Boolean {
            val deferred = condition.resumeOrNull() ?: return false
            continuation.resume(deferred)
            return true
        }
    }
}