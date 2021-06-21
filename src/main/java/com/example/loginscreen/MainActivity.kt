package com.example.loginscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.loginscreen.R.color.red
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonResult.setOnClickListener {
            if (editTextNumber1.text.isNotEmpty() && editTextNumber2.text.isNotEmpty()) {
                var exam1 = editTextNumber1.text.toString().toInt()
                var exam2 = editTextNumber2.text.toString().toInt()
                var avarage:Double = ((exam1 + exam2)/2).toDouble()
                if (avarage>=50) {
                    resultText.text = avarage.toString() + " " + "Geçtiniz."
                    resultText.setTextColor(getColor(R.color.green))
                }else {
                    resultText.text = avarage.toString() + " " + "Kaldınız."
                    resultText.setTextColor(getColor(R.color.red))

                }
            }else {
                resultText.text = "Sınav notunuzu giriniz."
                resultText.setTextColor(getColor(R.color.red))
            }
        }
    }
}