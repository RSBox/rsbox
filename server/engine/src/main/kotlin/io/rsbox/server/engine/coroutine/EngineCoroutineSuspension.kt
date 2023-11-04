package io.rsbox.server.engine.coroutine

import io.rsbox.server.engine.coroutine.resume.ResumeCondition
import kotlin.coroutines.Continuation

data class EngineCoroutineSuspension<T>(
    val continuation: Continuation<T>,
    val condition: ResumeCondition<T>
)