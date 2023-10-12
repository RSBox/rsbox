package io.rsbox.server.engine.model.manager

import io.rsbox.server.engine.model.entity.Player
import io.rsbox.server.engine.model.ui.*
import io.rsbox.server.engine.net.packet.server.IfOpenSub
import io.rsbox.server.engine.net.packet.server.IfOpenTop

class InterfaceManager(private val player: Player) {

    val toplevel: MutableSet<UserInterface> = mutableSetOf()
    val overlays: MutableMap<Component, UserInterface> = mutableMapOf()
    val modals: MutableMap<Component, UserInterface> = mutableMapOf()
    val properties: MutableMap<Component, ComponentProperty> = mutableMapOf()
    val gameframe: MutableMap<Component, Component> = mutableMapOf()

    fun init() {
        openGameFrame(GameFrame.Fixed)
    }

    fun openGameFrame(gameframe: GameFrame) {
        val (toplevel, mappings, overlays) = gameframe
        setGameFrame(mappings)
        openTopLevel(toplevel)
        overlays.forEach { (overlay, target) ->
            openOverlay(overlay, target)
        }
    }

    fun openTopLevel(userInterface: UserInterface) {
        closeTopLevels()
        this.toplevel += userInterface
        player.write(IfOpenTop(userInterface))
    }

    fun openOverlay(overlay: UserInterface, target: Component) {
        val mapped = gameframe[target] ?: target
        overlays[mapped] = overlay
        player.write(IfOpenSub(overlay, mapped, InterfaceType.OVERLAY))
    }

    fun closeTopLevels() {
        toplevel.clear()
    }

    private fun setGameFrame(mappings: Map<Component, Component>) {
        this.gameframe.clear()
        mappings.forEach { (base, cur) ->
            gameframe[base] = cur
        }
    }

}