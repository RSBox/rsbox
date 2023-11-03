package io.rsbox.server.cache.config

import io.netty.buffer.ByteBuf

class VarPlayerConfig(override val id: Int) : Config(id) {

    var type: Int = 0

    companion object : ConfigCompanion<VarPlayerConfig>() {

        override val id: Int = 16

        override fun decode(id: Int, data: ByteBuf): VarPlayerConfig {
            val config = VarPlayerConfig(id)
            decoder@ while(true) {
                when(val opcode = data.readUnsignedByte().toInt()) {
                    0 -> break@decoder
                    5 -> config.type = data.readUnsignedShort()
                    else -> throw IllegalStateException("Unknown opcode: $opcode")
                }
            }
            return config
        }
    }


}