package io.rsbox.server.engine.sync.update

import io.rsbox.server.engine.model.entity.Player
import io.rsbox.server.util.buffer.JagByteBuf
import io.rsbox.server.util.buffer.NEG
import io.rsbox.server.util.buffer.SUB
import io.rsbox.server.util.buffer.toJagBuf
import kotlin.math.max

class PlayerUpdateFlag(mask: Int, order: Int, val encode: JagByteBuf.(Player) -> Unit) : UpdateFlag(mask, order) {
    companion object {
        /**
         * === APPEARANCE ===
         */
        val APPEARANCE = PlayerUpdateFlag(mask = 0x40, order = 13) { player ->
            val buf = player.session.channel.alloc().buffer().toJagBuf()

            buf.writeByte(player.appearance.gender.id)
            buf.writeByte(player.skullIcon)
            buf.writeByte(player.prayerIcon)

            if(player.transmog < 0) {
                val translation = arrayOf(-1, -1, -1, -1, 2, -1, 3, 5, 0, 4, 6, 1)
                for(i in 0 until 12) {
                    if(translation[i] == -1) {
                        buf.writeByte(0)
                    } else {
                        buf.writeShort(0x100 + player.appearance.looks[translation[i]])
                    }
                }
            }

            for(i in 0 until 12) {
                buf.writeByte(0)
            }

            for(i in 0 until 5) {
                val color = max(0, player.appearance.colors[i])
                buf.writeByte(color)
            }

            player.appearance.animations.forEach { id ->
                buf.writeShort(id)
            }

            buf.writeString(player.displayName)
            buf.writeByte(3)
            buf.writeShort(0)
            buf.writeByte(if(player.invisible) 1 else 0)
            buf.writeShort(0)
            repeat(3) { buf.writeString("") }
            buf.writeByte(player.appearance.gender.id)

            writeByte(buf.writerIndex() and 0xFF, transform = NEG)
            writeBytesReversed(buf.toByteBuf())
            buf.release()
        }

        val MOVEMENT = PlayerUpdateFlag(mask = 0x2000, order = 14) { player ->
            writeByte(player.movementType.id)
        }
    }
}