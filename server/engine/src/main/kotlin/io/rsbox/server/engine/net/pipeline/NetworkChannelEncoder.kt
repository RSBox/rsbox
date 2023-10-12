package io.rsbox.server.engine.net.pipeline

import io.netty.buffer.ByteBuf
import io.netty.channel.ChannelHandlerContext
import io.netty.handler.codec.MessageToByteEncoder
import io.rsbox.server.engine.net.Message
import io.rsbox.server.engine.net.StatusResponse
import io.rsbox.server.engine.net.session

class NetworkChannelEncoder : MessageToByteEncoder<Message>() {
    override fun encode(ctx: ChannelHandlerContext, msg: Message, out: ByteBuf) {
        val protocol = ctx.session.protocol.get()
        if(msg is StatusResponse) {
            out.writeByte(msg.opcode)
        } else {
            protocol.encode(msg, out)
        }
    }
}