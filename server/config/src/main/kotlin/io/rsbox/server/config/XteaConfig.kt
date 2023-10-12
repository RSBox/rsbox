package io.rsbox.server.config

import com.uchuhimo.konf.Config
import com.uchuhimo.konf.toValue
import io.rsbox.server.common.inject
import java.io.File
import java.io.FileNotFoundException

class XteaConfig {

    private var config = Config()
    private val file = File("data/cache/xteas.json")

    val xteas = mutableMapOf<Int, IntArray>()

    fun load() {
        if(!file.exists()) {
            throw FileNotFoundException("Failed to load '/data/cache/xteas.json' config file.")
        }

        val entries = config.from.json.file(file).toValue<Array<XteaEntry>>()
        entries.forEach {
            xteas[it.region] = it.keys
        }
    }

    operator fun get(region: Int): IntArray = xteas[region] ?: EMPTY_KEYS

    data class XteaEntry(
        private val archive: Int,
        private val group: Int,
        private val name_hash: Int,
        private val name: String,
        private val mapsquare: Int,
        private val key: IntArray
    ) {

        val region = mapsquare
        val keys = key

        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (other !is XteaEntry) return false

            if (archive != other.archive) return false
            if (group != other.group) return false
            if (name_hash != other.name_hash) return false
            if (name != other.name) return false
            if (mapsquare != other.mapsquare) return false
            if (!key.contentEquals(other.key)) return false
            if (region != other.region) return false
            return keys.contentEquals(other.keys)
        }

        override fun hashCode(): Int {
            var result = archive
            result = 31 * result + group
            result = 31 * result + name_hash
            result = 31 * result + name.hashCode()
            result = 31 * result + mapsquare
            result = 31 * result + key.contentHashCode()
            result = 31 * result + region
            result = 31 * result + keys.contentHashCode()
            return result
        }


    }

    companion object {

        val EMPTY_KEYS = IntArray(4) { 0 }

        private val config: XteaConfig by inject()

        init {
            config.load()
        }

        val xteas = config.xteas

        fun getRegionKey(region: Int): IntArray = config[region]

    }
}