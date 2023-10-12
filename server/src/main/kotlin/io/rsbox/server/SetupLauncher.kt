package io.rsbox.server

import io.rsbox.server.cache.GameCache
import io.rsbox.server.common.get
import io.rsbox.server.config.ServerConfig
import io.rsbox.server.config.XteaConfig
import io.rsbox.server.util.security.RSA
import org.koin.core.context.startKoin
import org.tinylog.kotlin.Logger
import java.io.File
import java.net.URL
import java.util.zip.ZipFile
import kotlin.system.exitProcess

object SetupLauncher {

    private const val CACHE_URL = "https://archive.openrs2.org/caches/runescape/1551/disk.zip"
    private const val XTEAS_URL = "https://archive.openrs2.org/caches/runescape/1551/keys.json"

    private val DATA_DIR = File("data/")

    @JvmStatic
    fun main(args: Array<String>) {
        Logger.info("Setting up RSBox Server...")

        if(DATA_DIR.exists()) {
            Logger.info("The data/ directory already exists. Please delete it and re-run the setup gradle task.")
            exitProcess(0)
        }

        startKoin { modules(DI_MODULES) }

        /*
         * Setup Steps
         */
        createDirs()
        downloadCacheAndXteas()
        createConfigs()
        createRsa()
        checkCache()

        Logger.info("""
            The RSBox server setup has completed successfully. You may now start the server using the 'run server' gradle task.
        """.trimIndent())
    }

    private fun createDirs() {
        Logger.info("Creating default directories.")

        listOf(
            "cache/",
            "logs/",
            "saves/",
            "rsa/",
            "configs/",
        ).map { DATA_DIR.resolve(it) }.forEach { dir ->
            Logger.info("Creating missing directory: ${dir.path}.")
            dir.mkdirs()
        }
    }

    private fun downloadCacheAndXteas() {
        Logger.info("Downloading game cache files...")

        val file = File.createTempFile("tmp-cache", ".zip")
        file.deleteOnExit()
        val cacheBytes = URL(CACHE_URL).openConnection().getInputStream().use { it.readBytes() }
        file.writeBytes(cacheBytes)

        Logger.info("Extracting RSBox cache.zip files.")

        ZipFile(file).use { zip ->
            zip.entries().asSequence().forEach { entry ->
                if(!entry.isDirectory) {
                    zip.getInputStream(entry).use { input ->
                        File("data/cache/${entry.name}").outputStream().use { output ->
                            Logger.info("Extracting file: ${entry.name}.")
                            input.copyTo(output)
                        }
                    }
                }
            }
        }

        Logger.info("Downloading XTEA encryption keys...")

        val xteaFile = File("data/cache/xteas.json")
        if(xteaFile.exists()) xteaFile.deleteRecursively()
        val xteaData = URL(XTEAS_URL).openConnection().getInputStream().use { it.bufferedReader().readText() }
        xteaFile.writeText(xteaData)

        Logger.info("Finished downloading all required files.")
    }

    private fun createConfigs() {
        Logger.info("Creating default server.toml config file.")
        ServerConfig.SERVER_NAME

        Logger.info("Checking region XTEA keys config file.")
        XteaConfig.xteas.size
    }

    private fun checkCache() {
        Logger.info("Checking game cache files.")
        val cache = get<GameCache>()
        cache.load()
        Logger.info("Found ${cache.masterIndex.entries.size} cache archives.")
    }

    private fun createRsa() {
        Logger.info("Creating RSA encryption keys.")
        RSA.generateNewKeyPair()
    }
}