package com.beyzaakkuzu.qrcodereader.extension

import androidx.appcompat.app.AppCompatActivity
import com.beyzaakkuzu.qrcodereader.feature.common.dialog.ErrorDialogFragment

fun AppCompatActivity.showError(error: Throwable?) {
    val errorDialog =
        ErrorDialogFragment.newInstance(
            this,
            error
        )
    errorDialog.show(supportFragmentManager, "")
}