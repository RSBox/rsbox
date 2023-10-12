package io.rsbox.server

import io.rsbox.server.cache.CacheModule
import io.rsbox.server.config.ConfigModule
import io.rsbox.server.engine.EngineModule
import io.rsbox.server.engine.coroutine.CoroutineModule
import io.rsbox.server.game.GameModule
import io.rsbox.server.util.UtilModule

val DI_MODULES = listOf(
    ConfigModule,
    UtilModule,
    CacheModule,
    EngineModule,
    CoroutineModule,
    GameModule
)