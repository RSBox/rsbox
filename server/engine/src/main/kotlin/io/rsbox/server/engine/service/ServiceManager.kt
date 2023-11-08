package io.rsbox.server.engine.service

import io.rsbox.server.engine.service.auth.LoginService
import io.rsbox.server.engine.service.serializer.JsonPlayerSerializer
import org.tinylog.kotlin.Logger
import kotlin.reflect.KClass
import kotlin.reflect.full.createInstance

class ServiceManager {

    val services = mutableMapOf<KClass<out Service>, Service>()

    // Register All services
    init {
        register<LoginService>()
        register<JsonPlayerSerializer>()
    }

    fun startAll() {
        services.forEach { (klass, service) ->
            Logger.info("Starting service: ${klass.simpleName}.")
            service.start()
        }
        Logger.info("Started ${services.size} services.")
    }

    fun stopAll() {
        services.forEach { (klass, service) ->
            Logger.info("Stopping service: ${klass.simpleName}.")
            service.stop()
        }
    }

    @Suppress("UNCHECKED_CAST")
    operator fun <T : Service> get(type: KClass<T>): T {
        return services[type] as? T ?: error("Could not find service: ${type.simpleName}.")
    }

    private inline fun <reified T : Service> register() {
        services[T::class] = T::class.createInstance()
    }
}