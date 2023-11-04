package io.rsbox.server.engine.model.entity.manager

import io.rsbox.server.cache.GameCache
import io.rsbox.server.common.inject
import io.rsbox.server.engine.model.entity.Player
import io.rsbox.server.engine.net.packet.server.VarpLarge
import io.rsbox.server.engine.net.packet.server.VarpSmall

class VarpManager(private val player: Player) {

    private val cache: GameCache by inject()

    private val varps = hashMapOf<Int, Int>()
    private val changed = hashSetOf<Int>()

    fun sync() {
        changed.forEach { id ->
            player.writeVarp(id, getVarp(id))
        }
        changed.clear()
    }

    fun getVarp(id: Int) = this[id] ?: 0

    fun setVarp(id: Int, value: Int) { this[id] = value }

    fun toggleVarp(id: Int) {
        val value = if(getVarp(id) == 0) 1 else 0
        setVarp(id, value)
    }

    fun getVarbit(id: Int): Int {
        val varbitConfig = cache.configArchive.varbits[id]!!
        val value = this[varbitConfig.varp] ?: 0
        return value.getBits(varbitConfig.lsb, varbitConfig.msb)
    }

    fun setVarbit(id: Int, value: Int) {
        val varbitConfig = cache.configArchive.varbits[id]!!
        val cur = this[varbitConfig.varp] ?: 0
        val new = cur.setBits(varbitConfig.lsb, varbitConfig.msb, value)
        this[varbitConfig.varp] = new
    }

    private operator fun get(id: Int) = varps[id]

    private operator fun set(id: Int, value: Int): Int? {
        if((varps[id] ?: -1) != value) changed.add(id)
        if(value == 0) return varps.remove(id)
        return varps.put(id, value)
    }

    private fun Player.writeVarp(id: Int, value: Int) {
        val packet = when(value) {
            in Byte.MIN_VALUE .. Byte.MAX_VALUE -> VarpSmall(id, value)
            else -> VarpLarge(id, value)
        }
        this.write(packet)
    }

    private companion object {

        private val BIT_SIZES = IntArray(Int.SIZE_BYTES).apply {
            var size = 2
            for(i in indices) {
                this[i] = size - 1
                size += size
            }
        }

        private fun Int.getBits(lsb: Int, msb: Int): Int {
            val size = BIT_SIZES[msb - lsb]
            return (this shr lsb) and size
        }

        private fun Int.setBits(lsb: Int, msb: Int, value: Int): Int {
            val size = BIT_SIZES[msb - lsb] shl lsb
            return (this and size.inv()) or ((value shl lsb) and size)
        }
    }
}