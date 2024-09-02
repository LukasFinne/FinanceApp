package se.finne.finance

import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import se.finne.finance.plugins.configureRouting
import se.finne.finance.plugins.configureSerialization

fun main() {
    embeddedServer(Netty, port =8082, host = "0.0.0.0", module = Application::module)
        .start(wait = true)
}

fun Application.module() {
    configureRouting()
    configureSerialization()
}