package com.beyzaakkuzu.qrcodereader.extension

fun Int?.orZero(): Int {
    return this ?: 0
}