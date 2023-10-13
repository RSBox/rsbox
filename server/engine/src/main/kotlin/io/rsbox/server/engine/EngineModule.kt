package io.rsbox.server.engine

import io.rsbox.server.engine.model.World
import io.rsbox.server.engine.model.map.ZoneMap
import io.rsbox.server.engine.net.NetworkServer
import io.rsbox.server.engine.net.http.HttpServer
import io.rsbox.server.engine.sync.SyncTaskList
import org.koin.dsl.module

val EngineModule = module {
    single { Engine() }
    single { NetworkServer() }
    single { HttpServer() }
    single { World() }
    single { SyncTaskList() }
}