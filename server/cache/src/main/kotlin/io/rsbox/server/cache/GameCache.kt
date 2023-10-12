package io.rsbox.server.cache

import io.netty.buffer.ByteBufAllocator
import io.netty.buffer.Unpooled
import io.netty.buffer.UnpooledByteBufAllocator
import io.rsbox.server.cache.model.Archive
import io.rsbox.server.common.get
import io.rsbox.server.config.XteaConfig
import org.openrs2.cache.Cache
import org.openrs2.cache.Js5MasterIndex
import org.openrs2.cache.Store
import java.io.File

class GameCache {

    private val archives = mutableMapOf<Int, Archive>()

    lateinit var store: Store private set
    lateinit var cache: Cache private set
    lateinit var masterIndex: Js5MasterIndex private set

    lateinit var configArchive: ConfigArchive private set
    lateinit var mapArchive: MapArchive private set

    fun load() {
        store = Store.open(CACHE_DIR.toPath(), UnpooledByteBufAllocator.DEFAULT)
        cache = Cache.open(store, UnpooledByteBufAllocator.DEFAULT)
        masterIndex = Js5MasterIndex.create(store)

        /*
         * Load all game model archives.
         */

        configArchive = ConfigArchive.load(readArchive(ConfigArchive.id))
        mapArchive = MapArchive()
    }

    fun readArchive(archiveId: Int): Archive {
        return if(archives.containsKey(archiveId)) archives[archiveId]!!
        else {
            val archive = Archive(archiveId)
            archives[archiveId] = archive
            archive
        }
    }

    companion object {

        private val CACHE_DIR = File("data/cache/")

        val cache by lazy { get<GameCache>().cache }
        val store by lazy { get<GameCache>().store }
    }
}