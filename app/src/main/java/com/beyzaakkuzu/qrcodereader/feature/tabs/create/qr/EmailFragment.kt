package com.beyzaakkuzu.qrcodereader.feature.tabs.create.qr

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.addTextChangedListener
import com.beyzaakkuzu.qrcodereader.R
import com.beyzaakkuzu.qrcodereader.extension.isNotBlank
import com.beyzaakkuzu.qrcodereader.extension.textString
import com.beyzaakkuzu.qrcodereader.feature.tabs.create.BaseCreateBarcodeFragment
import com.beyzaakkuzu.qrcodereader.model.schema.Email
import com.beyzaakkuzu.qrcodereader.model.schema.Schema
import kotlinx.android.synthetic.main.fragment_create_qr_code_email.*

class EmailFragment : BaseCreateBarcodeFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_create_qr_code_email, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initTitleEditText()
        handleTextChanged()
    }

    override fun getBarcodeSchema(): Schema {
        return Email(
            email = edit_text_email.textString,
            subject = edit_text_subject.textString,
            body = edit_text_message.textString
        )
    }

    private fun initTitleEditText() {
        edit_text_email.requestFocus()
    }

    private fun handleTextChanged() {
        edit_text_email.addTextChangedListener { toggleCreateBarcodeButton() }
        edit_text_subject.addTextChangedListener { toggleCreateBarcodeButton() }
        edit_text_message.addTextChangedListener { toggleCreateBarcodeButton() }
    }

    private fun toggleCreateBarcodeButton() {
        parentActivity.isCreateBarcodeButtonEnabled = edit_text_email.isNotBlank() || edit_text_subject.isNotBlank() || edit_text_message.isNotBlank()
    }
}