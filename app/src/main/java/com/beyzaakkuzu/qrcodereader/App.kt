package com.beyzaakkuzu.qrcodereader

import androidx.multidex.MultiDexApplication
import com.beyzaakkuzu.qrcodereader.di.settings
import com.beyzaakkuzu.qrcodereader.usecase.Logger
import io.reactivex.plugins.RxJavaPlugins

class App : MultiDexApplication() {

    override fun onCreate() {
        handleUnhandledRxJavaErrors()
        applyTheme()
        super.onCreate()
    }

    private fun applyTheme() {
        settings.reapplyTheme()
    }

    private fun handleUnhandledRxJavaErrors() {
        RxJavaPlugins.setErrorHandler { error ->
            Logger.log(error)
        }
    }
}