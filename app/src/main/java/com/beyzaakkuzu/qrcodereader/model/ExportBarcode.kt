package com.beyzaakkuzu.qrcodereader.model

import androidx.room.TypeConverters
import com.beyzaakkuzu.qrcodereader.usecase.BarcodeDatabaseTypeConverter
import com.google.zxing.BarcodeFormat

@TypeConverters(BarcodeDatabaseTypeConverter::class)
data class ExportBarcode(
    val date: Long,
    val format: BarcodeFormat,
    val text: String
)