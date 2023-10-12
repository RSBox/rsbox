package io.rsbox.server.util.buffer

sealed class DataEndian

object BIG : DataEndian()
object LITTLE : DataEndian()
object MIDDLE : DataEndian()
object INVERSE_MIDDLE : DataEndian()