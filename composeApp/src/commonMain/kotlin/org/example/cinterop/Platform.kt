package org.example.cinterop

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform