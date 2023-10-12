package io.rsbox.server.engine.net.pipeline

import io.netty.channel.ChannelHandlerContext
import io.netty.channel.ChannelInboundHandlerAdapter
import io.netty.channel.SimpleChannelInboundHandler
import io.rsbox.server.engine.net.Message
import io.rsbox.server.engine.net.Session
import io.rsbox.server.engine.net.session

class NetworkChannelHandler : SimpleChannelInboundHandler<Message>() {

    override fun channelActive(ctx: ChannelHandlerContext) {
        val newSession = Session(ctx)
        newSession.onConnect()
        ctx.session = newSession
    }

    override fun channelInactive(ctx: ChannelHandlerContext) {
        ctx.session.onDisconnect()
    }

    override fun channelRead0(ctx: ChannelHandlerContext, msg: Message) {
        ctx.session.onMessage(msg)
    }

    override fun exceptionCaught(ctx: ChannelHandlerContext, cause: Throwable) {
        ctx.session.onError(cause)
    }
}