package com.example.tipcalc

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        infoTextView.visibility = View.INVISIBLE

        calculateButton.setOnClickListener{
            // Bill
            val bill = billEditText.text.toString().toDouble()
            // Tip Percentage
            val tipPercentage = tipPercentageEditText.text.toString().toDouble() / 100
            // Tip
            val tip = bill * tipPercentage
            // Total
            var total = bill + tip
            // Make the infoText Visible

            infoTextView.visibility = View.VISIBLE

            // Set info text
            infoTextView.text = "Tip: \$${tip} Total: \$${total}"
        }

    }

}