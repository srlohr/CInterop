package org.example.cinterop

actual fun buildBuildConfiguration(): BuildConfiguration = AndroidBuildConfiguration()

class AndroidBuildConfiguration(  //TODO implement a C++ interop example here?
    override val isDebug: Boolean = BuildConfig.DEBUG,
    override val apiBaseUrl: String =
        if (isDebug) "<https://android-api-dev.example.org>"
        else "<https://android-api-${BuildConfig.VERSION_CODE}.example.org>",
) : BuildConfiguration
