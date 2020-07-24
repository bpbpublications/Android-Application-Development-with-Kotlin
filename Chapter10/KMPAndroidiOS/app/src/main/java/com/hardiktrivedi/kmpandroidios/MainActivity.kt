package com.hardiktrivedi.kmpandroidios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fromCurrencyEditText.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                performCurrencyConversion()
            }
        })
    }

    private fun performCurrencyConversion() {
        toCurrencyTextView.text = getString(
            R.string.conversion_result,
            convertToGBP(fromCurrencyEditText.text.toString().toFloat()).toString()
        )

        conversionFeeTextView.text =
            getString(R.string.conversion_fee, conversionRate, getPlatformName(), getServiceFee())
    }
}
