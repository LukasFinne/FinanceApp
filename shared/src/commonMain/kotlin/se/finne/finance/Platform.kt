package se.finne.finance

import io.ktor.client.*

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
expect fun getClient(): HttpClient