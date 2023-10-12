package io.rsbox.server.game

import org.koin.dsl.module

val GameModule = module {
    single { GameScriptManager() }
}