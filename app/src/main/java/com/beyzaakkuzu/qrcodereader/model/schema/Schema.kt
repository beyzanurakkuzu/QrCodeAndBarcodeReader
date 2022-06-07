package com.beyzaakkuzu.qrcodereader.model.schema

enum class BarcodeSchema {
    APP,
    BOOKMARK,
    EMAIL,
    GEO,
    GOOGLE_MAPS,
    MECARD,
    PHONE,
    SMS,
    URL,
    VEVENT,
    VCARD,
    WIFI,
    YOUTUBE,
    NZCOVIDTRACER,
    BOARDINGPASS,
    OTHER;
}

interface Schema {
    val schema: BarcodeSchema
    fun toFormattedText(): String
    fun toBarcodeText(): String
}