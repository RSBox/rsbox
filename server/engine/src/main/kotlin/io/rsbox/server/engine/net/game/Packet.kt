package io.rsbox.server.engine.net.game

import io.rsbox.server.engine.net.Message
import io.rsbox.server.engine.net.Session

interface Packet : Message {

    fun handle(session: Session) {
        throw UnsupportedOperationException()
    }

}