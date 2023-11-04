@file:Suppress("NO_TAIL_CALLS_FOUND")

package io.rsbox.server.util.buffer

import io.netty.buffer.ByteBuf
import io.netty.util.ByteProcessor
import java.io.IOException
import java.nio.charset.Charset

fun ByteBuf.discard(amount: Int, writeMode: Boolean = false, readMode: Boolean = false) {
    if(writeMode) {
        val offset = writerIndex()
        writerIndex(offset + amount)
    }

    if(readMode) {
        val offset = readerIndex()
        readerIndex(offset + amount)
    }
}

val Charsets.CP_1252: Charset get() = WINDOWS_1252
val Charsets.WINDOWS_1252: Charset by lazy { Charset.forName("windows-1252") }
val Charsets.CESU_8: Charset by lazy { Charset.forName("CESU-8") }

fun ByteBuf.readString(charset: Charset = Charsets.CP_1252): String {
    val end = forEachByte(ByteProcessor.FIND_NUL)
    if(end == -1) throw IOException("String does not terminate.")
    val value = toString(readerIndex(), end - readerIndex(), charset)
    readerIndex(end + 1)
    return value
}

fun ByteBuf.readJagString(charset: Charset = Charsets.CP_1252): String {
    val version = readUnsignedByte().toInt()
    if(version != 0) throw IOException("String does not have 0 version.")
    return readString(charset)
}

fun ByteBuf.writeString(value: String, charset: Charset = Charsets.CP_1252): ByteBuf {
    writeCharSequence(value, charset)
    writeByte(0)
    return this
}

fun ByteBuf.writeJagString(value: String, charset: Charset = Charsets.CP_1252): ByteBuf {
    writeByte(0)
    writeString(value, charset)
    return this
}

fun ByteBuf.readIncrUnsignedShortSmart(): Int {
    var value = 0
    var curr = readUnsignedShortSmart()
    while (curr == 0x7FFF) {
        value += curr
        curr = readUnsignedShortSmart()
    }
    value += curr
    return value
}

fun ByteBuf.readShortSmart(): Int {
    val peek = getUnsignedByte(readerIndex()).toInt()
    return if ((peek and 0x80) == 0) {
        readUnsignedByte().toInt() - 0x40
    } else {
        (readUnsignedShort() and 0x7FFF) - 0x4000
    }
}

fun ByteBuf.writeShortSmart(v: Int): ByteBuf {
    when (v) {
        in -0x40..0x3F -> writeByte(v + 0x40)
        in -0x4000..0x3FFF -> writeShort(0x8000 or (v + 0x4000))
        else -> throw IllegalArgumentException()
    }

    return this
}

fun ByteBuf.readUnsignedShortSmart(): Int {
    val peek = getUnsignedByte(readerIndex()).toInt()
    return if ((peek and 0x80) == 0) {
        readUnsignedByte().toInt()
    } else {
        readUnsignedShort() and 0x7FFF
    }
}

fun ByteBuf.writeUnsignedShortSmart(v: Int): ByteBuf {
    when (v) {
        in 0..0x7F -> writeByte(v)
        in 0..0x7FFF -> writeShort(0x8000 or v)
        else -> throw IllegalArgumentException()
    }

    return this
}

fun ByteBuf.readIntSmart(): Int {
    val peek = getUnsignedByte(readerIndex()).toInt()
    return if ((peek and 0x80) == 0) {
        readUnsignedShort() - 0x4000
    } else {
        (readInt() and 0x7FFFFFFF) - 0x40000000
    }
}

fun ByteBuf.writeIntSmart(v: Int): ByteBuf {
    when (v) {
        in -0x4000..0x3FFF -> writeShort(v + 0x4000)
        in -0x40000000..0x3FFFFFFF -> writeInt(0x80000000.toInt() or (v + 0x40000000))
        else -> throw IllegalArgumentException()
    }

    return this
}

fun ByteBuf.readUnsignedIntSmart(): Int {
    val peek = getUnsignedByte(readerIndex()).toInt()
    return if ((peek and 0x80) == 0) {
        readUnsignedShort()
    } else {
        readInt() and 0x7FFFFFFF
    }
}

fun ByteBuf.writeUnsignedIntSmart(v: Int): ByteBuf {
    when (v) {
        in 0..0x7FFF -> writeShort(v)
        in 0..0x7FFFFFFF -> writeInt(0x80000000.toInt() or v)
        else -> throw IllegalArgumentException()
    }

    return this
}