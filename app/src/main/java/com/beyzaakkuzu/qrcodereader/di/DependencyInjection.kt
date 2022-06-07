package com.beyzaakkuzu.qrcodereader.di

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.beyzaakkuzu.qrcodereader.App
import com.beyzaakkuzu.qrcodereader.usecase.*


val App.settings
    get() = Settings.getInstance(applicationContext)

val barcodeParser
    get() = BarcodeParser

val barcodeImageScanner
    get() = BarcodeImageScanner

val barcodeImageGenerator
    get() = BarcodeImageGenerator

val barcodeSaver
    get() = BarcodeSaver

val barcodeImageSaver
    get() = BarcodeImageSaver

val wifiConnector
    get() = WifiConnector

val AppCompatActivity.barcodeDatabase
    get() = BarcodeDatabase.getInstance(this)

val AppCompatActivity.settings
    get() = Settings.getInstance(this)

val contactHelper
    get() = ContactHelper

val permissionsHelper
    get() = PermissionsHelper

val rotationHelper
    get() = RotationHelper

val scannerCameraHelper
    get() = ScannerCameraHelper

val Fragment.barcodeParser
    get() = BarcodeParser

val Fragment.barcodeDatabase
    get() = BarcodeDatabase.getInstance(requireContext())

val Fragment.settings
    get() = Settings.getInstance(requireContext())

val Fragment.permissionsHelper
    get() = PermissionsHelper