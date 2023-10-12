package io.rsbox.server.engine.model.ui

@JvmInline
value class Component(val packed: Int) {

    val interfaceId get() = (packed shr 16) and 0xFFFF
    val child get() = packed and 0xFFFF

    constructor(interfaceId: Int, child: Int) : this((interfaceId shl 16) or (child and 0xFFFF))

    @Suppress("NOTHING_TO_INLINE")
    inline fun parent() = UserInterface(interfaceId)

    operator fun component1() = interfaceId
    operator fun component2() = child

    override fun toString(): String {
        return "Component(interface=$interfaceId, child=$child)"
    }

}