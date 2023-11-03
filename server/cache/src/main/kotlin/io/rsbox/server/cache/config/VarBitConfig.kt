package io.rsbox.server.cache.config

import io.netty.buffer.ByteBuf

data class VarBitConfig(override val id: Int) : Config(id) {

    var varp: Int = 0
    var lsb: Int = 0
    var msb: Int = 0

    companion object : ConfigCompanion<VarBitConfig>() {

        override val id: Int = 14

        override fun decode(id: Int, data: ByteBuf): VarBitConfig {
            val config = VarBitConfig(id)
            decoder@ while(true) {
                when(val opcode = data.readUnsignedByte().toInt()) {
                    0 -> break@decoder
                    1 -> {
                        config.varp = data.readUnsignedShort()
                        config.lsb = data.readUnsignedByte().toInt()
                        config.msb = data.readUnsignedByte().toInt()
                    }
                    else -> throw IllegalStateException("Unknown opcode: $opcode")
                }
            }
            return config
        }
    }
}