package io.rsbox.server.engine.net.http

import io.netty.channel.ChannelInitializer
import io.netty.channel.socket.SocketChannel
import io.netty.handler.codec.http.HttpObjectAggregator
import io.netty.handler.codec.http.HttpServerCodec

class HttpChannelInitializer : ChannelInitializer<SocketChannel>() {

    private val handler = HttpRequestHandler()

    override fun initChannel(ch: SocketChannel) {
        ch.pipeline()
            .addLast("codec", HttpServerCodec())
            .addLast("aggregator", HttpObjectAggregator(2048))
            .addLast("handler", handler)
    }
}