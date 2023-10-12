package io.rsbox.server.engine.model.ui

import io.rsbox.server.cache.GameCache
import io.rsbox.server.cache.config.EnumConfig
import io.rsbox.server.common.inject
import io.rsbox.server.engine.api.ui.*

@Suppress("UNCHECKED_CAST")
sealed class GameFrame(val toplevel: UserInterface, enum: Int) {

    private val cache: GameCache by inject()

    val mappings = mutableMapOf<Component, Component>()
    var overlays = mutableListOf<Pair<UserInterface, Component>>()

    init {
        val enumMappings = cache.configArchive.enums[enum]?.entryMap as Map<EnumConfig.Component, EnumConfig.Component>
        enumMappings.forEach { (base, target) ->
            mappings[Component(base.parent, base.child)] = Component(target.parent, target.child)
        }

        overlays.addAll(mutableListOf(
            interf.chat_box to component.chat_box,
            interf.private_chat to component.private_chat,
            interf.minimap to component.minimap,
            interf.xp_tracker to component.xp_tracker,
            interf.skills_tab to component.skills_tab,
            interf.quests_tab to component.quests_tab,
            interf.inventory_tab to component.inventory_tab,
            interf.combat_tab to component.combat_tab,
            interf.equipment_tab to component.equipment_tab,
            interf.prayer_tab to component.prayer_tab,
            interf.spellbook_tab to component.spellbook_tab,
            interf.account_tab to component.account_tab,
            interf.social_tab to component.social_tab,
            interf.logout_tab to component.logout_tab,
            interf.settings_tab to component.settings_tab,
            interf.emotes_tab to component.emotes_tab,
            interf.music_tab to component.music_tab,
            interf.clans_tab to component.clans_tab,
        ))
    }

    operator fun component1() = toplevel
    operator fun component2() = mappings
    operator fun component3() = overlays

    object Resizable : GameFrame(interf.gameframe.resizable, 1130) {
    }

    object Fixed : GameFrame(interf.gameframe.fixed, 1129) {

    }
}