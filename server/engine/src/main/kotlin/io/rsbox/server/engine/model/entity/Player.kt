package io.rsbox.server.engine.model.entity

import io.rsbox.server.common.inject
import io.rsbox.server.config.ServerConfig
import io.rsbox.server.engine.event.EventBus.publish
import io.rsbox.server.engine.event.PlayerLoginEvent
import io.rsbox.server.engine.event.PlayerLogoutEvent
import io.rsbox.server.engine.model.Appearance
import io.rsbox.server.engine.model.Privilege
import io.rsbox.server.engine.model.World
import io.rsbox.server.engine.model.coord.Tile
import io.rsbox.server.engine.model.entity.manager.GpiManager
import io.rsbox.server.engine.model.entity.manager.InterfaceManager
import io.rsbox.server.engine.model.entity.manager.SceneManager
import io.rsbox.server.engine.model.entity.manager.VarpManager
import io.rsbox.server.engine.model.entity.update.PlayerUpdateFlag
import io.rsbox.server.engine.model.ui.DisplayMode
import io.rsbox.server.engine.net.Session
import io.rsbox.server.engine.net.game.Packet
import io.rsbox.server.engine.net.login.LoginRequest
import io.rsbox.server.engine.net.packet.server.MessageGame
import io.rsbox.server.engine.net.packet.server.RunClientScript
import io.rsbox.server.engine.service.ServiceManager
import io.rsbox.server.engine.service.serializer.JsonPlayerSerializer
import org.rsmod.pathfinder.SmartPathFinder
import org.tinylog.kotlin.Logger

class Player internal constructor(val session: Session) : Entity() {

    private val serviceManager: ServiceManager by inject()

    init {
        session.player = this
    }

    /*
     * Player context Managers
     */
    val gpi = GpiManager(this)
    val scene = SceneManager(this)
    val ui = InterfaceManager(this)
    val vars = VarpManager(this)

    override val sizeX = 1
    override val sizeY = 1

    override var tile = Tile(ServerConfig.SPAWN_TILE.X, ServerConfig.SPAWN_TILE.Y, ServerConfig.SPAWN_TILE.LEVEL)
    override var prevTile = tile

    var username: String = ""
    var displayName: String = ""
    var passwordHash: String = ""
    var privilege = Privilege.ADMIN
    var isMember = true
    var displayMode = DisplayMode.RESIZABLE
    var appearance = Appearance.DEFAULT
    var skullIcon = -1
    var prayerIcon = -1
    var transmog = -1
    var largeViewport = false

    override val updateFlags = sortedSetOf<PlayerUpdateFlag>()
    override fun flagMovement() { updateFlags.add(PlayerUpdateFlag.MOVEMENT) }

    internal val localNpcs = mutableListOf<Npc>()

    override suspend fun cycle() {
        super.cycle()
    }

    private fun init() {
        gpi.init()
        scene.init()
        ui.init()
        running = true
    }

    fun login() {
        Logger.info("[$username] has connected to the server.")
        this.init()
        updateFlags.add(PlayerUpdateFlag.APPEARANCE)
        publish(PlayerLoginEvent(this))
    }

    fun logout() {
        Logger.info("[$username] has disconnected from the server.")
        serviceManager[JsonPlayerSerializer::class].save(this)
        world.removePlayer(this)
        session.ctx.disconnect()
        publish(PlayerLogoutEvent(this))
    }

    fun isOnline() = world.players.contains(this)

    override fun walkTo(tile: Tile) {
        val route = SmartPathFinder(flags = world.collision.flags(), defaultFlag = -1)
            .findPath(
                this.tile.x,
                this.tile.y,
                tile.x,
                tile.y,
                this.tile.level
            )
        movement.addRoute(route)
    }

    override fun teleportTo(tile: Tile) {
        movement.moved = true
        movement.teleported = true
        this.tile = tile
        movement.clear()
        flagMovement()
    }

    override fun equals(other: Any?): Boolean {
        return other is Player && other.username == username && other.passwordHash == passwordHash
    }

    fun write(packet: Packet) = session.write(packet)
    fun writeAndFlush(packet: Packet) = session.writeAndFlush(packet)
    fun flush() = session.flush()

    fun runClientScript(id: Int, vararg args: Any) {
        write(RunClientScript(id, *args))
    }

    fun sendGameMessage(message: String) {
        write(MessageGame(0, message))
    }

    override fun hashCode(): Int {
        var result = session.hashCode()
        result = 31 * result + gpi.hashCode()
        result = 31 * result + scene.hashCode()
        result = 31 * result + ui.hashCode()
        result = 31 * result + vars.hashCode()
        result = 31 * result + sizeX
        result = 31 * result + sizeY
        result = 31 * result + tile.hashCode()
        result = 31 * result + prevTile.hashCode()
        result = 31 * result + username.hashCode()
        result = 31 * result + displayName.hashCode()
        result = 31 * result + passwordHash.hashCode()
        result = 31 * result + privilege.hashCode()
        result = 31 * result + isMember.hashCode()
        result = 31 * result + displayMode.hashCode()
        result = 31 * result + appearance.hashCode()
        result = 31 * result + skullIcon
        result = 31 * result + prayerIcon
        result = 31 * result + transmog
        result = 31 * result + updateFlags.hashCode()
        return result
    }

    companion object {

        private val world: World by inject()

        private val pathFinder = SmartPathFinder(flags = world.collision.flags(), defaultFlag = 0x0, useRouteBlockerFlags = false)

        fun create(request: LoginRequest): Player {
            val player = Player(request.session)
            player.username = request.username
            player.displayName = request.username
            player.passwordHash = request.password ?: ""

            player.session.xteas = request.xteas
            player.session.reconnectXteas = request.reconnectXteas
            player.session.encoderIsaac.init(IntArray(4) { player.session.xteas[it] + 50 })
            player.session.decoderIsaac.init(player.session.xteas)

            return player
        }
    }
}