import io.rsbox.server.engine.model.entity.Player
import io.rsbox.server.engine.api.ext.on_login
import io.rsbox.server.engine.api.has_display_name
import io.rsbox.server.engine.api.varbit

on_login {
    player.setDisplayName()
}

fun Player.setDisplayName() {
    val hasDisplayName = displayName.isNotBlank()
    runClientScript(1105, if(hasDisplayName) 1 else 0)
    runClientScript(423, displayName)
    if(hasDisplayName) {
        vars.setVarbit(varbit.has_display_name, 1)
    }
}