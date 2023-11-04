package io.rsbox.server.engine.coroutine.resume

class PredicateResumeCondition(val resume: () -> Boolean) : ResumeCondition<Boolean> {

    override fun resumeOrNull(): Boolean? {
        if(resume()) return true
        return null
    }
}