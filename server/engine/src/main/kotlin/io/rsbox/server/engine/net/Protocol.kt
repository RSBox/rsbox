package io.rsbox.server.engine.net

import io.netty.buffer.ByteBuf

abstract class Protocol(val session: Session) {

    open fun encode(msg: Message, out: ByteBuf) {}

    open fun decode(buf: ByteBuf, out: MutableList<Any>) {}

    open fun handle(msg: Message) {}
}