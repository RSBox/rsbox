package io.rsbox.server.engine.net.login

import io.netty.buffer.ByteBuf
import io.rsbox.server.engine.net.Message
import io.rsbox.server.engine.net.Session

class LoginEncoder(private val session: Session) {

    fun encode(msg: Message, out: ByteBuf) {
        if(msg !is LoginResponse) return

        out.writeByte(2)
        out.writeByte(37)
        out.writeBoolean(false)
        out.writeInt(0)
        out.writeByte(msg.player.privilege)
        out.writeBoolean(msg.player.privilege > 0)
        out.writeShort(msg.player.index)
        out.writeBoolean(msg.player.isMember)
        out.writeLong(msg.player.session.seed)
        out.writeLong(0L)
        out.writeLong(0L)
    }

}