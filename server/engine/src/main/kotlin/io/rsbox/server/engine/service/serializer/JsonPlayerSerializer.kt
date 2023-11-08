package io.rsbox.server.engine.service.serializer

import io.rsbox.server.engine.model.Appearance
import io.rsbox.server.engine.model.Privilege
import io.rsbox.server.engine.model.coord.Tile
import io.rsbox.server.engine.model.entity.Player
import io.rsbox.server.engine.model.ui.DisplayMode
import io.rsbox.server.engine.net.login.LoginRequest
import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import java.io.File

class JsonPlayerSerializer : PlayerSerializer {

    override fun create(request: LoginRequest): Player {
        val player = Player.create(request)
        save(player)
        return player
    }

    override fun load(request: LoginRequest): Player? {
        val file = File("data/saves/${request.username}.json")
        if(!file.exists()) return null

        val data = Json.decodeFromString<PlayerData>(file.readText())
        val player = Player.create(request)
        player.username = data.username
        player.displayName = data.displayName
        player.passwordHash = data.passwordHash
        player.session.reconnectXteas = data.xteas
        player.privilege = data.privilege
        player.isMember = data.isMember
        player.displayMode = data.displayMode
        player.appearance = data.appearance
        player.tile = data.tile

        return player
    }

    override fun save(player: Player) {
        val file = File("data/saves/${player.username}.json")
        if(file.exists()) file.delete()

        val data = PlayerData(
            player.username,
            player.passwordHash,
            player.session.xteas,
            player.displayName,
            player.privilege,
            player.isMember,
            player.displayMode,
            player.appearance,
            player.tile
        )
        val json = Json { prettyPrint = true }
        val text = json.encodeToString(data)

        file.createNewFile()
        file.writeText(text)
    }

    @Serializable
    private data class PlayerData(
        val username: String,
        val passwordHash: String,
        val xteas: IntArray,
        val displayName: String,
        val privilege: Privilege,
        val isMember: Boolean,
        val displayMode: DisplayMode,
        val appearance: Appearance,
        val tile: Tile
    ) {
        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (javaClass != other?.javaClass) return false

            other as PlayerData

            if (username != other.username) return false
            if (passwordHash != other.passwordHash) return false
            if (!xteas.contentEquals(other.xteas)) return false
            if (displayName != other.displayName) return false
            if (privilege != other.privilege) return false
            if (isMember != other.isMember) return false
            if (displayMode != other.displayMode) return false
            if (appearance != other.appearance) return false
            return tile == other.tile
        }

        override fun hashCode(): Int {
            var result = username.hashCode()
            result = 31 * result + passwordHash.hashCode()
            result = 31 * result + xteas.contentHashCode()
            result = 31 * result + displayName.hashCode()
            result = 31 * result + privilege.hashCode()
            result = 31 * result + isMember.hashCode()
            result = 31 * result + displayMode.hashCode()
            result = 31 * result + appearance.hashCode()
            result = 31 * result + tile.hashCode()
            return result
        }
    }
}