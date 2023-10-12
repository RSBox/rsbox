package io.rsbox.server.engine.net.game

import kotlin.reflect.KClass

class PacketRegistry {

    private val packets = mutableSetOf<PacketInfo>()

    val size get() = packets.size

    internal fun register(
        type: KClass<Packet>,
        opcode: Int,
        codec: Codec<Packet>,
        length: Int
    ) {
        val info = PacketInfo(type, opcode, codec, length)
        packets.add(info)
    }

    fun getOpcode(packet: KClass<out Packet>): Int = packets.first { it.packet == packet }.opcode
    fun getCodec(opcode: Int): Codec<Packet> = packets.first { it.opcode == opcode }.codec
    fun getLength(opcode: Int): Int = packets.first { it.opcode == opcode }.length
    fun getType(opcode: Int): PacketType = PacketType.fromLength(getLength(opcode))

    fun isUnknown(opcode: Int) = packets.firstOrNull { it.opcode == opcode } == null

    private data class PacketInfo(
        val packet: KClass<Packet>,
        val opcode: Int,
        val codec: Codec<Packet>,
        val length: Int
    )
}