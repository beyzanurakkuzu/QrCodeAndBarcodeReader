package com.beyzaakkuzu.qrcodereader.extension

fun Long?.orZero(): Long {
    return this ?: 0L
}