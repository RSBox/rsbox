package io.rsbox.server.engine.net.js5

import io.netty.buffer.ByteBuf
import io.netty.buffer.Unpooled
import io.rsbox.server.cache.GameCache
import io.rsbox.server.common.inject
import io.rsbox.server.engine.net.Message
import io.rsbox.server.engine.net.Protocol
import io.rsbox.server.engine.net.Session
import org.openrs2.cache.Js5Compression
import org.openrs2.cache.Js5CompressionType
import org.openrs2.cache.VersionTrailer
import kotlin.math.min

class JS5Protocol(session: Session) : Protocol(session) {

    private val cache: GameCache by inject()

    override fun decode(buf: ByteBuf, out: MutableList<Any>) {
        when(JS5RequestType.fromOpcode(buf.readByte().toInt())) {
            JS5RequestType.GAME_INIT,
            JS5RequestType.GAME_LOADED,
            JS5RequestType.GAME_READY -> {
                buf.skipBytes(3)
            }

            JS5RequestType.REQUEST_PRIORITY,
            JS5RequestType.REQUEST_NORMAL -> {
                val archive = buf.readUnsignedByte().toInt()
                val group = buf.readUnsignedShort()
                JS5Request(archive, group).also { out.add(it) }
            }
        }
    }

    override fun encode(msg: Message, out: ByteBuf) {
        if(msg !is JS5Response) return

        val compression = msg.data.readUnsignedByte().toInt()
        out.writeByte(msg.archive)
        out.writeShort(msg.group)
        out.writeByte(compression)
        out.writeBytes(msg.data, min(msg.data.readableBytes(), 508))
        while(msg.data.isReadable) {
            out.writeByte(0xFF)
            out.writeBytes(msg.data, min(msg.data.readableBytes(), 511))
        }
    }

    override fun handle(msg: Message) {
        if(msg !is JS5Request) return

        val data = if(msg.archive == 255 && msg.group == 255) {
            val uncompressed = Unpooled.buffer()
            cache.masterIndex.write(uncompressed)
            Js5Compression.compress(uncompressed.retain(), Js5CompressionType.UNCOMPRESSED)
        } else {
            val resBuf = cache.store.read(msg.archive, msg.group)
            if(msg.archive != 255) {
                VersionTrailer.strip(resBuf)
            }
            resBuf.retain()
        }

        JS5Response(msg.archive, msg.group, data).also {
            session.writeAndFlush(it)
        }
    }

    companion object {
        private val cachedResponses = hashMapOf<JS5Request, JS5Response>()
    }
}