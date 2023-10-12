package io.rsbox.server.engine.net

import io.netty.bootstrap.ServerBootstrap
import io.netty.channel.ChannelOption
import io.netty.channel.nio.NioEventLoopGroup
import io.netty.channel.socket.nio.NioServerSocketChannel
import io.rsbox.server.config.ServerConfig
import io.rsbox.server.engine.net.game.GamePackets
import io.rsbox.server.engine.net.pipeline.NetworkChannelInitializer
import org.tinylog.kotlin.Logger
import java.net.InetSocketAddress
import kotlin.system.exitProcess

class NetworkServer {

    private val bootstrap = ServerBootstrap()
    private val bossGroup = NioEventLoopGroup(2)
    private val workerGroup = NioEventLoopGroup(1)
    private val channelInitializer = NetworkChannelInitializer()

    init {
        bootstrap.group(bossGroup, workerGroup)
            .channel(NioServerSocketChannel::class.java)
            .childHandler(channelInitializer)
            .childOption(ChannelOption.TCP_NODELAY, true)
            .childOption(ChannelOption.SO_KEEPALIVE, true)
    }

    fun start() {
        Logger.info("Starting engine network server.")

        GamePackets.load()

        val socketAddress = InetSocketAddress(ServerConfig.NETWORK.ADDRESS, ServerConfig.NETWORK.PORT)
        bootstrap.bind(socketAddress).addListener {
            if(it.isSuccess) onSuccess(socketAddress)
            else onFailure(socketAddress, it.cause())
        }
    }

    fun stop() {
        Logger.info("Stopping engine network server.")
        bossGroup.shutdownGracefully()
        workerGroup.shutdownGracefully()
    }

    private fun onSuccess(socket: InetSocketAddress) {
        Logger.info("Network server now listening for connections on ${socket.hostString}:${socket.port}.")
    }

    private fun onFailure(socket: InetSocketAddress, cause: Throwable) {
        Logger.error(cause) { "An error occurred while starting network server on ${socket.hostString}:${socket.port}. Exiting process." }
        exitProcess(0)
    }
}