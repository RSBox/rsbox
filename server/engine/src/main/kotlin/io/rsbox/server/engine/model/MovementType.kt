package io.rsbox.server.engine.model

enum class MovementType(val id: Int) {
    NONE(-1),
    CRAWL(0),
    WALK(1),
    RUN(2),
    TELEPORT(127)
}