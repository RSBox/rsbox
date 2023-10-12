package io.rsbox.server.engine.net.http.endpoint

import io.netty.channel.ChannelHandlerContext
import io.netty.handler.codec.http.FullHttpRequest
import io.netty.handler.codec.http.QueryStringDecoder
import io.rsbox.server.engine.net.http.writeHttpFile
import java.io.File

object GamepackEndpoint {

    private val gamepackBytes: ByteArray get() {
        val file: File = File("data/gamepack/gamepack.jar")
        return if(file.exists()) file.readBytes() else ByteArray(0)
    }

    fun handle(ctx: ChannelHandlerContext, msg: FullHttpRequest, query: QueryStringDecoder) {
        ctx.writeHttpFile(gamepackBytes, "gamepack.jar")
    }
}