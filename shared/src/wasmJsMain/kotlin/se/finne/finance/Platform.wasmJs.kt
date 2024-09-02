package se.finne.finance

import io.ktor.client.*
import io.ktor.client.plugins.contentnegotiation.*

class WasmPlatform: Platform {
    val client = HttpClient()
    override val name: String = "Web with Kotlin/Wasm"
}

actual fun getPlatform(): Platform = WasmPlatform()

actual fun getClient(): HttpClient = HttpClient(){
    install(ContentNegotiation){

    }
}