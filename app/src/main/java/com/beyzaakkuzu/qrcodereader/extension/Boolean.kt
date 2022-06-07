package com.beyzaakkuzu.qrcodereader.extension

fun Boolean?.orFalse(): Boolean {
    return this ?: false
}