package io.rsbox.server.util.buffer

sealed class DataSignature

object UNSIGNED : DataSignature()
object SIGNED : DataSignature()