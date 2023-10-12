package io.rsbox.server.config

import com.uchuhimo.konf.Config
import com.uchuhimo.konf.ConfigSpec
import com.uchuhimo.konf.Item
import com.uchuhimo.konf.source.toml
import com.uchuhimo.konf.source.toml.toToml
import io.rsbox.server.common.inject
import java.io.File

class ServerConfig {

    var config = Config()
        private set

    private val file = File("data/configs/server.toml")

    fun load() {
        if(!file.exists()){
            config = Config { addSpec(Spec) }
            save()
        }
        config = Config { addSpec(Spec) }.from.toml.file(file)
        save()
    }

    fun save() {
        config.toToml.toFile(file)
    }

    operator fun <T> get(item: Item<T>): T = config[item]

    operator fun <T> set(item: Item<T>, value: T) { config[item] = value }

    object Spec : ConfigSpec("server") {
        val serverName by optional("RSBOX", "server-name")
        val revision by optional(215, "revision")
        val devMode by optional(true, "dev-mode")
        val tickRate by optional(600L, "tick-rate")

        object Network : ConfigSpec("network") {
            val address by optional("0.0.0.0", "address")
            val port by optional(43594, "port")
        }

        object SpawnTile : ConfigSpec("spawn-tile") {
            val x by optional(3221, "x")
            val y by optional(3218, "y")
            val level by optional(0, "level")
        }
    }

    companion object {

        private val config: ServerConfig by inject()

        init {
            config.load()
        }

        val SERVER_NAME get() = config[Spec.serverName]
        val REVISION get() = config[Spec.revision]
        val DEV_MODE get() = config[Spec.devMode]
        val TICK_RATE get() = config[Spec.tickRate]

        val NETWORK = NetworkCompanion(config)
        class NetworkCompanion(private val config: ServerConfig) {
            val ADDRESS get() = config[Spec.Network.address]
            val PORT get() = config[Spec.Network.port]
        }

        val SPAWN_TILE = SpawnTileCompanion(config)
        class SpawnTileCompanion(private val config: ServerConfig) {
            val X get() = config[Spec.SpawnTile.x]
            val Y get() = config[Spec.SpawnTile.y]
            val LEVEL get() = config[Spec.SpawnTile.level]
        }
    }
}