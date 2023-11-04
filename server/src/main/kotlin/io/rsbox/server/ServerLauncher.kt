package io.rsbox.server

import io.rsbox.server.cache.GameCache
import io.rsbox.server.common.get
import io.rsbox.server.common.inject
import io.rsbox.server.config.ServerConfig
import io.rsbox.server.config.XteaConfig
import io.rsbox.server.engine.Engine
import io.rsbox.server.game.GameScriptManager
import io.rsbox.server.util.security.RSA
import org.koin.core.context.startKoin
import org.tinylog.kotlin.Logger
import java.io.File
import kotlin.system.exitProcess

object ServerLauncher {

    private val engine: Engine by inject()
    private val scriptManager: GameScriptManager by inject()

    @JvmStatic
    fun main(args: Array<String>) {
        if(!File("data/").exists()) {
            Logger.error("RSBox server has not been setup. Run the 'setup server' gradle task first.")
            exitProcess(0)
        }
        start()
    }

    private fun start() {
        Logger.info("Initializing...")

        startKoin { modules(DI_MODULES) }

        /*
         * Loading Steps
         */
        checkDirs()
        loadConfigs()
        loadRsa()
        loadCache()

        /*
         * Load all game content scripts.
         */
        scriptManager.load()

        /*
         * Start server engine.
         */
        engine.start()

        Logger.info("RSBox server startup completed successfully.")
    }

    private fun checkDirs() {
        Logger.info("Checking required directories.")

        listOf(
            "cache/",
            "logs/",
            "saves/",
            "rsa/",
            "configs/",
        ).map { File("data/$it") }.forEach { dir ->
            if(!dir.exists()) {
                Logger.error("Missing required directory: ${dir.path}. Please run 'setup server' gradle task.")
                exitProcess(0)
            }
        }
    }

    private fun loadConfigs() {
        Logger.info("Loading server config file: server.toml.")
        ServerConfig.SERVER_NAME

        Logger.info("Loading xtea config file: xteas.json.")
        XteaConfig.xteas.size.also {
            Logger.info("Found $it region XTEA keys.")
        }
    }

    private fun loadRsa() {
        Logger.info("Loading RSA encryption keys.")
        get<RSA>().load()
    }

    private fun loadCache() {
        Logger.info("Preparing to load game cache files.")
        get<GameCache>().also {
            it.load()
            Logger.info("Found ${it.masterIndex.entries.size} cache archives.")
        }
    }
}