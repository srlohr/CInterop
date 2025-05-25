package org.example.cinterop

actual fun buildBuildConfiguration(): BuildConfiguration = JVMBuildConfiguration()

class JVMBuildConfiguration(  //TODO implement a JVM interop example here?
    override val apiBaseUrl: String = "<https://jvm-api.application.org>",
    override val isDebug: Boolean = true
) : BuildConfiguration
