package io.rsbox.server.cache.config

import io.netty.buffer.ByteBuf
import io.rsbox.server.util.buffer.readIntSmart
import io.rsbox.server.util.buffer.readShortSmart
import io.rsbox.server.util.buffer.readString

class NpcConfig(override val id: Int) : Config(id) {
    var name: String = "null"
    var size: Short = 1
    var combatLevel: Int? = null
    var isInteractable: Boolean = true
    var drawMapDot: Boolean = true
    var isClickable: Boolean = true
    var rotation: Int = 32
    var headIconGroups = emptyArray<Int>()
    var headIconIndexes = emptyArray<Int>()
    var options: Array<String?> = arrayOfNulls(5)
    var stanceAnimation: Int? = null
    var walkForwardAnimation: Int? = null
    var walkLeftAnimation: Int? = null
    var walkRightAnimation: Int? = null
    var walkBackAnimation: Int? = null
    var turnLeftAnimation: Int? = null
    var turnRightAnimation: Int? = null
    var runForwardAnimation: Int? = null
    var runLeftAnimation: Int? = null
    var runRightAnimation: Int? = null
    var runBackAnimation: Int? = null
    var crawlForwardAnimation: Int? = null
    var crawlLeftAnimation: Int? = null
    var crawlRightAnimation: Int? = null
    var crawlBackAnimation: Int? = null
    var colorFind: IntArray? = null
    var colorReplace: IntArray? = null
    var textureFind: IntArray? = null
    var textureReplace: IntArray? = null
    var models: IntArray? = null
    var headModels: IntArray? = null
    var resizeX: Int = 128
    var resizeY: Int = 128
    var contrast: Int = 0
    var ambient: Byte = 0
    var hasRenderPriority: Boolean = false
    var transformVarbit: Int? = null
    var transformVarp: Int? = null
    var transforms: Array<Int?>? = null
    var unknownBoolean1: Boolean = false
    var category: Int? = null
    var params: MutableMap<Int, Any>? = null

    companion object : ConfigCompanion<NpcConfig>() {

        override val id = 9

        override fun decode(id: Int, data: ByteBuf): NpcConfig {
            val config = NpcConfig(id)
            decoder@ while(true) {
                when(val opcode = data.readUnsignedByte().toInt()) {
                    0 -> break@decoder
                    1 -> {
                        val length = data.readUnsignedByte().toInt()
                        config.models = IntArray(length) { data.readUnsignedShort() }
                    }
                    2 -> config.name = data.readString()
                    12 -> config.size = data.readUnsignedByte()
                    13 -> config.stanceAnimation = data.readUnsignedShort()
                    14 -> config.walkForwardAnimation = data.readUnsignedShort()
                    15 -> config.turnLeftAnimation = data.readUnsignedShort()
                    16 -> config.turnRightAnimation = data.readUnsignedShort()
                    17 -> {
                        config.walkForwardAnimation = data.readUnsignedShort()
                        config.walkBackAnimation = data.readUnsignedShort()
                        config.walkLeftAnimation = data.readUnsignedShort()
                        config.walkRightAnimation = data.readUnsignedShort()
                    }
                    18 -> config.category = data.readUnsignedShort()
                    in 30..34 -> config.options[opcode - 30] = data.readString().takeIf { it != "Hidden" }
                    40 -> {
                        val colorsSize = data.readUnsignedByte().toInt()
                        val colorFind = IntArray(colorsSize)
                        val colorReplace = IntArray(colorsSize)
                        for(i in 0 until colorsSize) {
                            colorFind[i] = data.readUnsignedShort()
                            colorReplace[i] = data.readUnsignedShort()
                        }
                        config.colorFind = colorFind
                        config.colorReplace = colorReplace
                    }
                    41 -> {
                        val texturesSize = data.readUnsignedByte().toInt()
                        val textureFind = IntArray(texturesSize)
                        val textureReplace = IntArray(texturesSize)
                        for(i in 0 until texturesSize) {
                            textureFind[i] = data.readUnsignedShort()
                            textureReplace[i] = data.readUnsignedShort()
                        }
                        config.textureFind = textureFind
                        config.textureReplace = textureReplace
                    }
                    60 -> {
                        val length = data.readUnsignedByte().toInt()
                        config.headModels = IntArray(length) { data.readUnsignedShort() }
                    }
                    93 -> config.drawMapDot = false
                    95 -> config.combatLevel = data.readUnsignedShort()
                    97 -> config.resizeX = data.readUnsignedShort()
                    98 -> config.resizeY = data.readUnsignedShort()
                    99 -> config.hasRenderPriority = true
                    100 -> config.ambient = data.readByte()
                    101 -> config.contrast = data.readByte() * 5
                    102 -> {
                        val initialBits = data.readUnsignedByte().toInt()
                        var bits = initialBits
                        var count = 0
                        while(bits != 0) {
                            count++
                            bits = bits shr 1
                        }
                        val groups = mutableListOf<Int>()
                        val indexes = mutableListOf<Int>()
                        repeat(count) { i ->
                            if((initialBits and 0x1 shl i) == 0) {
                                groups += -1
                                indexes += -1
                                return@repeat
                            }
                            groups += data.readIntSmart()
                            indexes += data.readShortSmart()
                        }
                        config.headIconGroups = groups.toTypedArray()
                        config.headIconIndexes = indexes.toTypedArray()
                    }
                    103 -> config.rotation = data.readUnsignedShort()
                    106, 118 -> {
                        val transformVarbit = data.readUnsignedShort()
                        config.transformVarbit = if(transformVarbit == 65535) null else transformVarbit
                        val transformVarp = data.readUnsignedShort()
                        config.transformVarp = if(transformVarp == 65535) null else transformVarp
                        val lastEntry = if(opcode == 118) {
                            val entry = data.readUnsignedShort()
                            if(entry == 65535) null else entry
                        } else null
                        val size = data.readUnsignedByte().toInt()
                        val transforms = arrayOfNulls<Int?>(size + 2)
                        for(i in 0..size) {
                            val transform = data.readUnsignedShort()
                            transforms[i] = if(transform == 65535) null else transform
                        }
                        if(opcode == 118) {
                            transforms[size + 1] = lastEntry
                        }
                        config.transforms = transforms
                    }
                    107 -> config.isInteractable = false
                    109 -> config.isClickable = false
                    111 -> config.unknownBoolean1 = true
                    114 -> config.runForwardAnimation = data.readUnsignedShort()
                    115 -> {
                        config.runForwardAnimation = data.readUnsignedShort()
                        config.runBackAnimation = data.readUnsignedShort()
                        config.runLeftAnimation = data.readUnsignedShort()
                        config.runRightAnimation = data.readUnsignedShort()
                    }
                    116 -> config.crawlForwardAnimation = data.readUnsignedShort()
                    117 -> {
                        config.crawlForwardAnimation = data.readUnsignedShort()
                        config.crawlBackAnimation = data.readUnsignedShort()
                        config.crawlLeftAnimation = data.readUnsignedShort()
                        config.crawlRightAnimation = data.readUnsignedShort()
                    }
                    249 -> config.params = data.readParams()
                    else -> throw IllegalStateException("Unknown opcode $opcode.")
                }
            }
            return config
        }
    }
}