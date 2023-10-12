package io.rsbox.server.engine.net

import io.netty.channel.Channel
import io.netty.channel.ChannelHandlerContext
import io.netty.util.AttributeKey

val SESSION_ATTR = AttributeKey.valueOf<Session>("session")

var Channel.session: Session
    get() = this.attr(SESSION_ATTR).get()
    set(value) { this.attr(SESSION_ATTR).set(value) }

var ChannelHandlerContext.session: Session
    get() = this.channel().session
    set(value) { this.channel().session = value }