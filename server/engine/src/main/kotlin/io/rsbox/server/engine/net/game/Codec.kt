package io.rsbox.server.engine.net.game

import io.rsbox.server.engine.net.Session
import io.rsbox.server.util.buffer.JagByteBuf

interface Codec<T : Packet> {

    fun encode(session: Session, packet: T, out: JagByteBuf) {
        throw UnsupportedOperationException()
    }

    fun decode(session: Session, buf: JagByteBuf): T {
        throw UnsupportedOperationException()
    }

}