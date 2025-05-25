package org.example.cinterop

expect fun buildBuildConfiguration(): BuildConfiguration

interface BuildConfiguration {
    val apiBaseUrl: String
    val isDebug: Boolean
}
