package com.beyzaakkuzu.qrcodereader.extension

import com.beyzaakkuzu.qrcodereader.model.Barcode
import com.google.zxing.Result

fun Result.equalTo(barcode: Barcode?): Boolean {
    return barcodeFormat == barcode?.format && text == barcode?.text
}