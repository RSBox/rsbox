package io.rsbox.server.cache

import org.koin.dsl.module

val CacheModule = module {
    single { GameCache() }
}