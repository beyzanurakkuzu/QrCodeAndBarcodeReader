package com.beyzaakkuzu.qrcodereader.feature.tabs.create.barcode

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.addTextChangedListener
import com.beyzaakkuzu.qrcodereader.R
import com.beyzaakkuzu.qrcodereader.extension.isNotBlank
import com.beyzaakkuzu.qrcodereader.extension.textString
import com.beyzaakkuzu.qrcodereader.feature.tabs.create.BaseCreateBarcodeFragment
import com.beyzaakkuzu.qrcodereader.model.schema.Other
import com.beyzaakkuzu.qrcodereader.model.schema.Schema
import kotlinx.android.synthetic.main.fragment_create_code_93.*

class CreateCode93Fragment : BaseCreateBarcodeFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_create_code_93, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        edit_text.requestFocus()
        edit_text.addTextChangedListener {
            parentActivity.isCreateBarcodeButtonEnabled = edit_text.isNotBlank()
        }
    }

    override fun getBarcodeSchema(): Schema {
        return Other(edit_text.textString)
    }
}