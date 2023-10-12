package io.rsbox.server.engine.net.pipeline

import io.netty.channel.ChannelInitializer
import io.netty.channel.socket.SocketChannel

class NetworkChannelInitializer : ChannelInitializer<SocketChannel>() {

    override fun initChannel(ch: SocketChannel) {
        val handler = NetworkChannelHandler()
        val encoder = NetworkChannelEncoder()
        val decoder = NetworkChannelDecoder()

        ch.pipeline()
            .addLast("decoder", decoder)
            .addLast("encoder", encoder)
            .addLast("handler", handler)
    }
}