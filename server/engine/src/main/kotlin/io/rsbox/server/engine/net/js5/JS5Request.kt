package io.rsbox.server.engine.net.js5

import io.rsbox.server.engine.net.Message

data class JS5Request(val archive: Int, val group: Int) : Message