package com.example.drugopredavanje

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ActivityScreenA : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen_a)

        val screenATextView = findViewById<TextView>(R.id.screenATextView)
        val screenAButton = findViewById<Button>(R.id.screenAButton)

        val randomNumber = (0..100).random()

        screenATextView.text = "Random number A is: $randomNumber"

        screenAButton.setOnClickListener {
            goToScreenB()
        }

    }

    fun goToScreenB(){
        val intent = Intent(this, ActivityScreenB::class.java)
        startActivity(intent)
    }
}