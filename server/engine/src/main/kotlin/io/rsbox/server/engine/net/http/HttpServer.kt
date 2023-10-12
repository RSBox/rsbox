package io.rsbox.server.engine.net.http

import io.netty.bootstrap.ServerBootstrap
import io.netty.channel.ChannelOption
import io.netty.channel.nio.NioEventLoopGroup
import io.netty.channel.socket.nio.NioServerSocketChannel
import io.rsbox.server.config.ServerConfig
import org.tinylog.kotlin.Logger
import java.net.InetSocketAddress
import kotlin.system.exitProcess

class HttpServer {

    private val bootstrap = ServerBootstrap()
    private val bossGroup = NioEventLoopGroup()
    private val workerGroup = NioEventLoopGroup()

    init {
        bootstrap.group(bossGroup, workerGroup)
            .channel(NioServerSocketChannel::class.java)
            .childHandler(HttpChannelInitializer())
            .childOption(ChannelOption.TCP_NODELAY, true)
            .childOption(ChannelOption.SO_REUSEADDR, true)
    }

    fun start() {
        Logger.info("Starting internal HTTP server.")

        val socketAddress = InetSocketAddress(ServerConfig.NETWORK.ADDRESS, 80)
        bootstrap.bind(socketAddress).sync().addListener {
            if(!it.isSuccess) {
                Logger.error(it.cause()) { "Failed to bind HTTP server to address: ${socketAddress.hostString}:${socketAddress.port}."}
                exitProcess(0)
            }
        }
    }

    fun stop() {
        workerGroup.shutdownGracefully()
        bossGroup.shutdownGracefully()
    }
}