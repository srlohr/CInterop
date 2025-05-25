@file:OptIn(ExperimentalForeignApi::class)

package org.example.cinterop

import kotlinx.cinterop.ExperimentalForeignApi
import org.example.cinterop.BuildConfigurationProvider

actual fun buildBuildConfiguration(): BuildConfiguration = IOSBuildConfiguration()

class IOSBuildConfiguration(
    private val provider: BuildConfigurationProvider = BuildConfigurationProvider.shared(),

    override val apiBaseUrl: String = provider.getApiBaseUrl(),
    override val isDebug: Boolean = provider.isDebug
) : BuildConfiguration
