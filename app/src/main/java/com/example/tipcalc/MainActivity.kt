package com.example.tipcalc

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        infoTextView.visibility = View.INVISIBLE

        calculateButton.setOnClickListener{
            // Bill
            val bill = billEditText.text.toString().toDouble()
            // Tip Percentage
            var tipPercentage = tipPercentageEditText.text.toString().toDouble()
            // Tip
            var tip = bill * tipPercentage
            // Total
            var total = bill + tip
            // Make the infoText Visible
            infoTextView.visibility = View.VISIBLE

            // Set info text
        }

    }

}