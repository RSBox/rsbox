package io.rsbox.server.engine.net.handshake

enum class HandshakeType(val opcode: Int) {
    LOGIN(14),
    JS5(15);

    companion object {
        private val values = values()
        fun fromOpcode(opcode: Int) = values.firstOrNull { it.opcode == opcode }
    }
}