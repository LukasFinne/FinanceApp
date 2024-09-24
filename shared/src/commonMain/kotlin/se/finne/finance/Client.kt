package se.finne.finance

import io.ktor.client.call.*
import io.ktor.client.request.*

private val client = getClient()

const val BASE_URL = "http://localhost:8082"
class ClientServer(){
    // TODO("Native Corotuoins")
    suspend fun greet(): String {
        return client.get(BASE_URL).body<String>()
    }
}