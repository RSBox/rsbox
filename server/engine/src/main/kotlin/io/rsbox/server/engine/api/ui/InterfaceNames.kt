package io.rsbox.server.engine.api.ui

import io.rsbox.server.engine.model.ui.UserInterface

object interf {
    object gameframe
}

object component {
    object gameframe
}

val interf.gameframe.fixed get() = UserInterface(548)
val interf.gameframe.resizable get() = UserInterface(161)

val interf.chat_box get() = UserInterface(162)
val interf.private_chat get() = UserInterface(163)
val interf.minimap get() = UserInterface(160)
val interf.xp_tracker get() = UserInterface(122)
val interf.skills_tab get() = UserInterface(320)
val interf.quests_tab get() = UserInterface(629)
val interf.inventory_tab get() = UserInterface(149)
val interf.equipment_tab get() = UserInterface(387)
val interf.prayer_tab get() = UserInterface(541)
val interf.spellbook_tab get() = UserInterface(218)
val interf.account_tab get() = UserInterface(109)
val interf.social_tab get() = UserInterface(429)
val interf.logout_tab get() = UserInterface(182)
val interf.settings_tab get() = UserInterface(116)
val interf.emotes_tab get() = UserInterface(216)
val interf.music_tab get() = UserInterface(239)
val interf.clans_tab get() = UserInterface(707)
val interf.combat_tab get() = UserInterface(593)


val component.chat_box get() = interf.gameframe.resizable.child(94)
val component.private_chat get() = interf.gameframe.resizable.child(91)
val component.minimap get() = interf.gameframe.resizable.child(32)
val component.xp_tracker get() = interf.gameframe.resizable.child(1)
val component.skills_tab get() = interf.gameframe.resizable.child(76)
val component.quests_tab get() = interf.gameframe.resizable.child(77)
val component.inventory_tab get() = interf.gameframe.resizable.child(78)
val component.equipment_tab get() = interf.gameframe.resizable.child(79)
val component.prayer_tab get() = interf.gameframe.resizable.child(80)
val component.spellbook_tab get() = interf.gameframe.resizable.child(81)
val component.account_tab get() = interf.gameframe.resizable.child(83)
val component.social_tab get() = interf.gameframe.resizable.child(84)
val component.logout_tab get() = interf.gameframe.resizable.child(85)
val component.settings_tab get() = interf.gameframe.resizable.child(86)
val component.emotes_tab get() = interf.gameframe.resizable.child(87)
val component.music_tab get() = interf.gameframe.resizable.child(88)
val component.clans_tab get() = interf.gameframe.resizable.child(82)
val component.combat_tab get() = interf.gameframe.resizable.child(75)
