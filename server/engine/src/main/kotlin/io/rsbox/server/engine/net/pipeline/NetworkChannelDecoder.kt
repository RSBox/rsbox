package io.rsbox.server.engine.net.pipeline

import io.netty.buffer.ByteBuf
import io.netty.channel.ChannelHandlerContext
import io.netty.handler.codec.ByteToMessageDecoder
import io.rsbox.server.engine.net.session

class NetworkChannelDecoder : ByteToMessageDecoder() {
    override fun decode(ctx: ChannelHandlerContext, buf: ByteBuf, out: MutableList<Any>) {
        val protocol = ctx.session.protocol.get()
        val msg = protocol.decode(buf, out)
        out.add(msg)
    }
}