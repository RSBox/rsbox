package io.rsbox.server.cache.config

import io.netty.buffer.ByteBuf

class VarClientConfig(override val id: Int) : Config(id) {

    var isPersistent: Boolean = false

    companion object : ConfigCompanion<VarClientConfig>() {

        override val id = 19

        override fun decode(id: Int, data: ByteBuf): VarClientConfig {
            val result = VarClientConfig(id)
            decoder@ while(true) {
                when(val opcode = data.readUnsignedByte().toInt()) {
                    0 -> break@decoder
                    2 -> result.isPersistent = true
                    else -> throw IllegalStateException("Unknown opcode: $opcode.")
                }
            }
            return result
        }
    }
}