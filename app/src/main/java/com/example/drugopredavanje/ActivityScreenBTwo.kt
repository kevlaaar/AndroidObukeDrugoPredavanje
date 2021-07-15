package com.example.drugopredavanje

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ActivityScreenBTwo: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen_b_two)

        val emailTextView = findViewById<TextView>(R.id.emailTextView)
        val passwordTextView = findViewById<TextView>(R.id.passwordTextView)

        val email: String = intent.getStringExtra("EMAIL_KEY") as String
        val password: String = intent.getStringExtra("PASSWORD_KEY") as String

        emailTextView.text = email
        passwordTextView.text = password


    }
}