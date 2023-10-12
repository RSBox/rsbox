package io.rsbox.server.engine.sync.update

import io.rsbox.server.engine.model.entity.Entity
import io.rsbox.server.engine.model.entity.Player

abstract class UpdateFlag(val mask: Int, private val order: Int) : Comparable<UpdateFlag> {
    override fun compareTo(other: UpdateFlag): Int = when {
        order < other.order -> -1
        order > other.order -> 1
        else -> 0
    }
}