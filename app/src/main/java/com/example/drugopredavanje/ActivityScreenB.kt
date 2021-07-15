package com.example.drugopredavanje

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ActivityScreenB: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen_b)

        val screenBTextView = findViewById<TextView>(R.id.screenBTextView)
        val screenBButton = findViewById<Button>(R.id.screenBButton)

        val randomNumber = (0..100).random()

        screenBTextView.text = "Random number B is: $randomNumber"

        screenBButton.setOnClickListener{
            goToScreenA()
        }

    }

    fun goToScreenA() {
        val intent = Intent(this, ActivityScreenA::class.java)

        startActivity(intent)
    }
}