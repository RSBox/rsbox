package io.rsbox.server.cache.model

import io.netty.buffer.ByteBuf

data class File(val group: Group, val id: Int, val data: ByteBuf) {

    val archive = group.archive

}