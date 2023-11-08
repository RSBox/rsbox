package io.rsbox.server.engine.net.login

import io.netty.buffer.ByteBuf
import io.rsbox.server.common.inject
import io.rsbox.server.engine.net.Message
import io.rsbox.server.engine.net.Protocol
import io.rsbox.server.engine.net.Session
import io.rsbox.server.engine.service.ServiceManager
import io.rsbox.server.engine.service.auth.LoginService

class LoginProtocol(session: Session) : Protocol(session) {

    private val serviceManager: ServiceManager by inject()

    private val loginService by lazy { serviceManager[LoginService::class] }

    private val encoder = LoginEncoder(session)
    private val decoder = LoginDecoder(session)

    override fun encode(msg: Message, out: ByteBuf) = encoder.encode(msg, out)
    override fun decode(buf: ByteBuf, out: MutableList<Any>) = decoder.decode(buf, out)

    override fun handle(msg: Message) {
        if(msg !is LoginRequest) return
        loginService.queueLogin(msg)
    }
}