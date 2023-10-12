package io.rsbox.server.util.buffer

sealed class AccessMode

object BIT_MODE : AccessMode()
object BYTE_MODE : AccessMode()