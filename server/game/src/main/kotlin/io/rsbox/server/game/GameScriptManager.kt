package io.rsbox.server.game

import io.github.classgraph.ClassGraph
import io.rsbox.server.script.GameScript
import org.tinylog.kotlin.Logger
import kotlin.reflect.full.createInstance

class GameScriptManager {

    fun load() {
        Logger.info("Scanning for game scripts to be loaded.")

        var count = 0
        ClassGraph().enableAllInfo().scan().use { scan ->
            scan.getSubclasses(GameScript::class.java).directOnly().forEach { info ->
                try {
                    val klass = info.loadClass(GameScript::class.java)
                    val inst = klass.kotlin.createInstance()
                    count++
                } catch (e: Exception) {
                    Logger.error(e) { "Failed to load plugin: ${info.name}. " }
                    return@forEach
                }
            }
        }

        Logger.info("Loaded $count game scripts.")
    }
}