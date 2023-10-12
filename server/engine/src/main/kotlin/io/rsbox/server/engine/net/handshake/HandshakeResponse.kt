package io.rsbox.server.engine.net.handshake

import io.rsbox.server.engine.net.Message

data class HandshakeResponse(val seed: Long) : Message