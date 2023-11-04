package io.rsbox.server.engine.model.entity.update

import io.rsbox.server.engine.model.entity.Npc
import io.rsbox.server.util.buffer.JagByteBuf

class NpcUpdateFlag(mask: Int, order: Int, val encode: JagByteBuf.(Npc) -> Unit) : UpdateFlag(mask, order) {
    companion object {

    }
}