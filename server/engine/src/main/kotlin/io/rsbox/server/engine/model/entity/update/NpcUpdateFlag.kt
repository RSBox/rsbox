package io.rsbox.server.engine.model.entity.update

import io.rsbox.server.engine.model.entity.Npc
import io.rsbox.server.util.buffer.JagByteBuf

class NpcUpdateFlag(mask: Int, order: Int, val encode: JagByteBuf.(Npc) -> Unit) : UpdateFlag(mask, order) {
    companion object {
        val SPAWN = NpcUpdateFlag(mask = 0x8, order = 4) { npc ->
            writeShort(0)
            writeInt(0)
        }
    }
}