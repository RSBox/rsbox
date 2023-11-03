package io.rsbox.server.engine.model.entity

import io.rsbox.server.common.inject
import io.rsbox.server.config.ServerConfig
import io.rsbox.server.engine.event.EventBus.publish
import io.rsbox.server.engine.event.PlayerLoginEvent
import io.rsbox.server.engine.event.PlayerLogoutEvent
import io.rsbox.server.engine.model.Appearance
import io.rsbox.server.engine.model.Direction
import io.rsbox.server.engine.model.World
import io.rsbox.server.engine.model.coord.Tile
import io.rsbox.server.engine.model.manager.GpiManager
import io.rsbox.server.engine.model.manager.InterfaceManager
import io.rsbox.server.engine.model.manager.SceneManager
import io.rsbox.server.engine.model.manager.VarpManager
import io.rsbox.server.engine.model.ui.DisplayMode
import io.rsbox.server.engine.net.Session
import io.rsbox.server.engine.net.game.Packet
import io.rsbox.server.engine.net.login.LoginRequest
import io.rsbox.server.engine.net.packet.server.RunClientScript
import io.rsbox.server.engine.sync.update.PlayerUpdateFlag
import org.rsmod.pathfinder.SmartPathFinder
import org.rsmod.pathfinder.collision.CollisionStrategies
import org.tinylog.kotlin.Logger

class Player internal constructor(val session: Session) : Entity() {

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
    override var followTile = tile.translate(Direction.WEST)

    var username: String = ""
    var displayName: String = ""
    var passwordHash: String = ""
    var privilege = 3
    var isMember = true
    var displayMode = DisplayMode.RESIZABLE
    var appearance = Appearance.DEFAULT
    var skullIcon = -1
    var prayerIcon = -1
    var transmog = -1

    override val updateFlags = sortedSetOf<PlayerUpdateFlag>()

    override suspend fun cycle() {

    }

    private fun init() {
        gpi.init()
        scene.init()
        ui.init()
    }

    fun login() {
        Logger.info("[$username] has connected to the server.")
        this.init()
        updateFlags.add(PlayerUpdateFlag.APPEARANCE)
        publish(PlayerLoginEvent(this))
    }

    fun logout() {
        Logger.info("[$username] has disconnected from the server.")
        world.removePlayer(this)
        session.ctx.disconnect()
        publish(PlayerLogoutEvent(this))
    }

    fun isOnline() = world.players.contains(this)

    fun moveTo(tile: Tile) {
        val route = pathFinder.findPath(this.tile.x, this.tile.y, tile.x, tile.y, tile.level, collision = CollisionStrategies.Normal)
        movementQueue.addRoute(route)
    }

    fun teleportTo(tile: Tile) {
        movementQueue.clear()
        teleportTile = tile
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