package io.rsbox.server.cache

import io.rsbox.server.cache.config.*
import io.rsbox.server.cache.model.Archive

class ConfigArchive(
    val enums: Map<Int, EnumConfig<Any, Any>>,
    val varcs: Map<Int, VarClientConfig>,
    val varps: Map<Int, VarPlayerConfig>,
    val varbits: Map<Int, VarBitConfig>,
    val objects: Map<Int, ObjectConfig>,
    val npcs: Map<Int, NpcConfig>
) {

    companion object {

        const val id = 2

        fun load(archive: Archive) = ConfigArchive(
            EnumConfig.load(archive.readGroup(EnumConfig.id)),
            VarClientConfig.load(archive.readGroup(VarClientConfig.id)),
            VarPlayerConfig.load(archive.readGroup(VarPlayerConfig.id)),
            VarBitConfig.load(archive.readGroup(VarBitConfig.id)),
            ObjectConfig.load(archive.readGroup(ObjectConfig.id)),
            NpcConfig.load(archive.readGroup(NpcConfig.id))
        )
    }
}