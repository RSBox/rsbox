@file:Suppress("UNCHECKED_CAST")

package io.rsbox.server.engine.net.game

import io.github.classgraph.ClassGraph
import org.tinylog.kotlin.Logger
import kotlin.reflect.KClass
import kotlin.reflect.full.companionObjectInstance

object GamePackets {

    val clientPackets = PacketRegistry()
    val serverPackets = PacketRegistry()

    fun load() {
        Logger.info("Loading game engine packets.")
        loadClientPackets()
        loadServerPackets()
    }

    private fun loadClientPackets() {
        ClassGraph()
            .enableAnnotationInfo()
            .acceptPackagesNonRecursive("io.rsbox.server.engine.net.packet.client")
            .scan().also { res ->
                res.getClassesImplementing(Packet::class.qualifiedName).forEach { cls ->
                    val annotation = cls.annotationInfo.firstOrNull { it.name == ClientPacket::class.qualifiedName }?.let { it.loadClassAndInstantiate() as ClientPacket } ?: return@forEach
                    val opcode = annotation.opcode
                    val length = annotation.length
                    val packet = cls.loadClass().kotlin as KClass<Packet>
                    val codec = packet.companionObjectInstance as Codec<Packet>
                    clientPackets.register(packet, opcode, codec, length)
                }
            }

        Logger.info("Registered ${clientPackets.size} client packets.")
    }

    private fun loadServerPackets() {
        ClassGraph()
            .enableAnnotationInfo()
            .acceptPackagesNonRecursive("io.rsbox.server.engine.net.packet.server")
            .scan().also { res ->
                res.getClassesImplementing(Packet::class.qualifiedName).forEach { cls ->
                    val annotation = cls.annotationInfo.firstOrNull { it.name == ServerPacket::class.qualifiedName }?.let { it.loadClassAndInstantiate() as ServerPacket } ?: return@forEach
                    val opcode = annotation.opcode
                    val type = annotation.type
                    val packet = cls.loadClass().kotlin as KClass<Packet>
                    val codec = packet.companionObjectInstance as Codec<Packet>
                    val length = type.length
                    serverPackets.register(packet, opcode, codec, length)
                }
            }

        Logger.info("Registered ${serverPackets.size} server packets.")
    }

    internal val CLIENT_PACKET_LENGTHS = mapOf(
        0 to 0,
		1 to 7,
		2 to -1,
		3 to 1,
		4 to 6,
		5 to 11,
		6 to -1,
		7 to 13,
		8 to -1,
		9 to 22,
		10 to 10,
		11 to 3,
		12 to -1,
		13 to -1,
		14 to -1,
		15 to 4,
		16 to 2,
		17 to 2,
		18 to 2,
		19 to 8,
		20 to 15,
		21 to 9,
		22 to 4,
		23 to -1,
		24 to 7,
		25 to 16,
		26 to 3,
		27 to 8,
		28 to 8,
		29 to 7,
		30 to 0,
		31 to 3,
		32 to 6,
		33 to 7,
		34 to 4,
		35 to 3,
		36 to 2,
		37 to 1,
		38 to 7,
		39 to 7,
		40 to 11,
		41 to 0,
		42 to 1,
		43 to -1,
		44 to -1,
		45 to 2,
		46 to 11,
		47 to 3,
		48 to 5,
		49 to 3,
		50 to 8,
		51 to 8,
		52 to -1,
		53 to 3,
		54 to -1,
		55 to 0,
		56 to 4,
		57 to -1,
		58 to -1,
		59 to -2,
		60 to 8,
		61 to -2,
		62 to 11,
		63 to -1,
		64 to 7,
		65 to 3,
		66 to 3,
		67 to 2,
		68 to -1,
		69 to 7,
		70 to 3,
		71 to 3,
		72 to 3,
		73 to 6,
		74 to -2,
		75 to 8,
		76 to -1,
		77 to 3,
		78 to -1,
		79 to 7,
		80 to 4,
		81 to -1,
		82 to 8,
		83 to 0,
		84 to 8,
		85 to 3,
		86 to 7,
		87 to 8,
		88 to -1,
		89 to 7,
		90 to 15,
		91 to -1,
		92 to 15,
		93 to -1,
		94 to 4,
		95 to 15,
		96 to 16,
		97 to -1,
    )
}