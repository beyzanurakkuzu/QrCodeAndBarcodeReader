package com.beyzaakkuzu.qrcodereader.extension

import java.lang.Boolean

class BuildConfig {
    companion object {
    val DEBUG = Boolean.parseBoolean("true")
    const val APPLICATION_ID = "com.example.barcodescanner"
    const val BUILD_TYPE = "debug"
    const val FLAVOR = "appGallery"
    const val VERSION_CODE = 12
    const val VERSION_NAME = "1.10"

    // Field from default config.
    const val ERROR_REPORTS_ENABLED_BY_DEFAULT = true}
}