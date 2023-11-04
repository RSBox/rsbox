package io.rsbox.server.engine

import com.google.common.util.concurrent.ThreadFactoryBuilder
import io.rsbox.server.engine.coroutine.EngineCoroutineScope
import io.rsbox.server.engine.model.World
import io.rsbox.server.engine.model.map.ZoneMap
import io.rsbox.server.engine.net.NetworkServer
import io.rsbox.server.engine.net.http.HttpServer
import io.rsbox.server.engine.sync.SyncTaskList
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.asCoroutineDispatcher
import org.koin.core.qualifier.named
import org.koin.dsl.module
import java.util.concurrent.Executors

val EngineModule = module {
    single { Engine() }
    single { NetworkServer() }
    single { HttpServer() }
    single { World() }
    single { SyncTaskList() }

    single(named("engine")) {
        Executors.newSingleThreadExecutor(
            ThreadFactoryBuilder()
            .setDaemon(false)
            .setNameFormat("engine-executor")
            .build()
        ).asCoroutineDispatcher().let { CoroutineScope(it) }
    }

    single(named("world")) { EngineCoroutineScope() }
}