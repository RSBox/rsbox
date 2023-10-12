package io.rsbox.server.engine.net.login

import io.rsbox.server.engine.net.Message
import io.rsbox.server.engine.net.Session

data class LoginRequest(
    val session: Session,
    val username: String,
    val password: String?,
    val authCode: Int?,
    val seed: Long,
    val xteas: IntArray,
    val reconnectXteas: IntArray?,
    val reconnecting: Boolean
) : Message {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as LoginRequest

        if (session != other.session) return false
        if (username != other.username) return false
        if (password != other.password) return false
        if (authCode != other.authCode) return false
        if (seed != other.seed) return false
        if (!xteas.contentEquals(other.xteas)) return false
        if (reconnectXteas != null) {
            if (other.reconnectXteas == null) return false
            if (!reconnectXteas.contentEquals(other.reconnectXteas)) return false
        } else if (other.reconnectXteas != null) return false
        return reconnecting == other.reconnecting
    }

    override fun hashCode(): Int {
        var result = session.hashCode()
        result = 31 * result + username.hashCode()
        result = 31 * result + (password?.hashCode() ?: 0)
        result = 31 * result + (authCode ?: 0)
        result = 31 * result + seed.hashCode()
        result = 31 * result + xteas.contentHashCode()
        result = 31 * result + (reconnectXteas?.contentHashCode() ?: 0)
        result = 31 * result + reconnecting.hashCode()
        return result
    }
}