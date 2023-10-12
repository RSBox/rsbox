package io.rsbox.server.engine.net.handshake

import io.rsbox.server.engine.net.Message

sealed class HandshakeRequest(val type: HandshakeType) : Message {
    class JS5(val revision: Int) : HandshakeRequest(HandshakeType.JS5)
    class LOGIN : HandshakeRequest(HandshakeType.LOGIN)
}