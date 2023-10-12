package io.rsbox.server.util.buffer

sealed class DataTransform

object NONE : DataTransform()
object ADD : DataTransform()
object SUB : DataTransform()
object NEG : DataTransform()