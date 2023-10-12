package io.rsbox.server.engine.model.ui.old

import io.rsbox.server.cache.GameCache
import io.rsbox.server.cache.config.EnumConfig
import io.rsbox.server.common.inject
import io.rsbox.server.engine.model.ui.DisplayMode
import io.rsbox.server.engine.model.ui.InterfaceType

enum class GameInterface(val interfaceId: Int, val resizableChildId: Int, val type: InterfaceType = InterfaceType.OVERLAY) {
    CHAT_BOX(interfaceId = 162, resizableChildId = 94, type = InterfaceType.OVERLAY),
    PRIVATE_CHAT(interfaceId = 163, resizableChildId = 91, type = InterfaceType.OVERLAY),
    MINI_MAP(interfaceId = 160, resizableChildId = 32, type = InterfaceType.OVERLAY),
    XP_TRACKER(interfaceId = 122, resizableChildId = 1, type = InterfaceType.OVERLAY),
    SKILLS(interfaceId = 320, resizableChildId = 76, type = InterfaceType.OVERLAY),
    QUESTS(interfaceId = 629, resizableChildId = 77, type = InterfaceType.OVERLAY),
    INVENTORY(interfaceId = 149, resizableChildId = 78, type = InterfaceType.OVERLAY),
    EQUIPMENT(interfaceId = 387, resizableChildId = 79, type = InterfaceType.OVERLAY),
    PRAYER(interfaceId = 541, resizableChildId = 80, type = InterfaceType.OVERLAY),
    SPELL_BOOK(interfaceId = 218, resizableChildId = 81, type = InterfaceType.OVERLAY),
    ACCOUNT(interfaceId = 109, resizableChildId = 83, type = InterfaceType.OVERLAY),
    SOCIAL(interfaceId = 429, resizableChildId = 84, type = InterfaceType.OVERLAY),
    LOG_OUT(interfaceId = 182, resizableChildId = 85, type = InterfaceType.OVERLAY),
    SETTINGS(interfaceId = 116, resizableChildId = 86, type = InterfaceType.OVERLAY),
    EMOTES(interfaceId = 216, resizableChildId = 87, type = InterfaceType.OVERLAY),
    MUSIC(interfaceId = 239, resizableChildId = 88, type = InterfaceType.OVERLAY),
    CLANS(interfaceId = 707, resizableChildId = 82, type = InterfaceType.OVERLAY),
    COMBAT(interfaceId = 593, resizableChildId = 75, type = InterfaceType.OVERLAY);

    private val cache: GameCache by inject()

    @Suppress("UNCHECKED_CAST")
    fun getEnumChildId(displayMode: DisplayMode): Int {
        val mappings = cache.configArchive.enums[displayMode.enumId]!!.entryMap as Map<EnumConfig.Component, EnumConfig.Component>
        return mappings[EnumConfig.Component(DisplayMode.RESIZABLE.interfaceId, resizableChildId)]?.child ?: throw IllegalArgumentException("Child id not found in enum.")
    }

    companion object {

        private val cache: GameCache by inject()

        private val values = values()

        @Suppress("UNCHECKED_CAST")
        fun fromEnumChildId(childId: Int, displayMode: DisplayMode): GameInterface? {
            val mappings = cache.configArchive.enums[displayMode.enumId]!!.entryMap
                .mapValues { it.key } as Map<EnumConfig.Component, EnumConfig.Component>
            val resizableChildId = mappings[EnumConfig.Component(displayMode.interfaceId, childId)]?.child ?: return null
            return values.firstOrNull { it.resizableChildId == resizableChildId }
        }
    }
}