package com.beyzaakkuzu.qrcodereader.usecase

import com.beyzaakkuzu.qrcodereader.extension.BuildConfig
import io.sentry.Sentry

object Logger {
    var isEnabled = BuildConfig.ERROR_REPORTS_ENABLED_BY_DEFAULT

    fun log(error: Throwable) {
        if (isEnabled) {
            Sentry.captureException(error)
        }
    }
}