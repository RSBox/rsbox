package io.rsbox.server.engine.net.js5

import io.netty.buffer.ByteBuf
import io.rsbox.server.engine.net.Message

data class JS5Response(val archive: Int, val group: Int, val data: ByteBuf) : Message