package io.rsbox.toolbox

import io.rsbox.server.cache.CacheModule
import io.rsbox.server.cache.GameCache
import io.rsbox.server.common.inject
import org.koin.core.context.startKoin
import java.io.File

object NpcSourceGenerator {

    private val cache: GameCache by inject()

    @JvmStatic
    fun main(args: Array<String>) {
        println("Loading game cache.")

        startKoin { modules(CacheModule) }
        cache.load()

        println("Generating Npcs.kt source-code.")

        val text = StringBuilder()
        text.append("package io.rsbox.server.engine.api\n")
        text.append("\n")
        text.append("object npc {\n")

        cache.configArchive.npcs.forEach { (id, npc) ->
            if(npc.name == "null") return@forEach
            var name = npc.name.lowercase()
                .replace(" ", "_")
                .replace("-", "_")
                .replace("'", "")
                .replace("(", "")
                .replace(")", "")
                .replace(".", "")
                .replace("?", "")
                .replace(",", "")
                .replace("!", "")
                .replace("50%", "half")

            if(name.startsWith("<col=")) {
                name = name.substring(12).replace("</col>", "")
            }

            if(name.isNotBlank()) {
                val numbersStr = "0123456789"
                for(i in numbersStr.indices) {
                    if(name[0] == numbersStr[i]) {
                        name = "_$name"
                        break
                    }
                }
            }

            if(name.isNotBlank() && name.all { it == '_' }) {
                return@forEach
            }
            if(name.isNotBlank() && name.replace("_", "") == id.toString()) {
                return@forEach
            }

            if(name.isNotBlank()) {
                text.append("\tval ${name}_$id get() = $id\n")
            }
        }

        text.append("}")

        val file = File("Npcs.kt.txt")
        if(file.exists()) file.deleteRecursively()

        file.bufferedWriter().use { it.write(text.toString()) }

        println("Saved generated source to file: Npcs.kt.txt")
    }
}