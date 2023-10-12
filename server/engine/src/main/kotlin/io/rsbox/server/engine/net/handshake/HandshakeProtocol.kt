package io.rsbox.server.engine.net.handshake

import io.netty.buffer.ByteBuf
import io.rsbox.server.config.ServerConfig
import io.rsbox.server.engine.net.Message
import io.rsbox.server.engine.net.Protocol
import io.rsbox.server.engine.net.Session
import io.rsbox.server.engine.net.StatusResponse
import io.rsbox.server.engine.net.js5.JS5Protocol
import io.rsbox.server.engine.net.login.LoginProtocol

class HandshakeProtocol(session: Session) : Protocol(session) {

    override fun decode(buf: ByteBuf, out: MutableList<Any>) {
        when(HandshakeType.fromOpcode(buf.readUnsignedByte().toInt())) {
            HandshakeType.JS5 -> HandshakeRequest.JS5(buf.readInt())
            HandshakeType.LOGIN -> HandshakeRequest.LOGIN()
            else -> throw IllegalStateException("Invalid handshake type.")
        }.also { out.add(it) }
    }

    override fun encode(msg: Message, out: ByteBuf) {
        if(msg !is HandshakeResponse) return

        out.writeByte(StatusResponse.SUCCESSFUL.opcode)
        out.writeLong(msg.seed)
    }

    override fun handle(msg: Message) {
        when(msg) {
            is HandshakeRequest.JS5 -> msg.handle()
            is HandshakeRequest.LOGIN -> msg.handle()
        }
    }

    private fun HandshakeRequest.JS5.handle() {
        if(revision != ServerConfig.REVISION) {
            session.writeAndClose(StatusResponse.OUT_OF_DATE)
            return
        }
        session.writeAndFlush(StatusResponse.SUCCESSFUL)
        session.protocol.set(JS5Protocol(session))
    }

    private fun HandshakeRequest.LOGIN.handle() {
        session.writeAndFlush(HandshakeResponse(session.seed))
        session.protocol.set(LoginProtocol(session))
    }
}