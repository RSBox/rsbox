package io.rsbox.server.engine.net.http

import io.netty.channel.ChannelHandler
import io.netty.channel.ChannelHandlerContext
import io.netty.channel.SimpleChannelInboundHandler
import io.netty.handler.codec.http.FullHttpRequest
import io.netty.handler.codec.http.HttpMethod
import io.netty.handler.codec.http.HttpResponseStatus
import io.netty.handler.codec.http.QueryStringDecoder
import io.rsbox.server.engine.net.http.endpoint.GamepackEndpoint
import io.rsbox.server.engine.net.http.endpoint.JavConfigEndpoint

@ChannelHandler.Sharable
class HttpRequestHandler : SimpleChannelInboundHandler<FullHttpRequest>() {

    override fun channelRead0(ctx: ChannelHandlerContext, msg: FullHttpRequest) {
        if(!msg.decoderResult().isSuccess) {
            ctx.writeHttpError(HttpResponseStatus.BAD_REQUEST)
            return
        }

        if(msg.method() != HttpMethod.GET) {
            ctx.writeHttpError(HttpResponseStatus.METHOD_NOT_ALLOWED)
            return
        }

        val uri = msg.uri()
        val query = QueryStringDecoder(uri)

        when {
            query.path() == "/jav_config.ws" -> JavConfigEndpoint.handle(ctx, msg, query)
            query.path() == "/gamepack.jar" -> GamepackEndpoint.handle(ctx, msg, query)
            else -> ctx.writeHttpError(HttpResponseStatus.NOT_FOUND)
        }
    }

    @Suppress("OVERRIDE_DEPRECATION")
    override fun exceptionCaught(ctx: ChannelHandlerContext, cause: Throwable) {
        cause.printStackTrace()
        if(ctx.channel().isActive) {
            ctx.writeHttpError(HttpResponseStatus.INTERNAL_SERVER_ERROR)
        }
    }
}