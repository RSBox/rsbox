package io.rsbox.server.engine.model.ui

@JvmInline
value class UserInterface(val id: Int) {

    @Suppress("NOTHING_TO_INLINE")
    inline fun child(child: Int): Component {
        return Component(id, child)
    }

    override fun toString(): String {
        return "UserInterface(id=$id)"
    }
}