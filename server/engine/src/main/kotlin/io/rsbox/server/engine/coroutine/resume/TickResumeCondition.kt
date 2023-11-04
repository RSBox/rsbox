package io.rsbox.server.engine.coroutine.resume

class TickResumeCondition(private var ticks: Int) : ResumeCondition<Unit> {

    override fun resumeOrNull(): Unit? {
        if(--ticks == 0) return Unit
        return null
    }
}