package com.example.drugopredavanje

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class ActivityScreenATwo: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen_a_two)

        val emailEditText = findViewById<EditText>(R.id.emailEditText)
        val passwordEditText = findViewById<EditText>(R.id.passwordEditText)

        val button = findViewById<Button>(R.id.screenAButtonTwo)

        button.setOnClickListener {
            val emailValue = emailEditText.text.toString()
            val passwordValue = passwordEditText.text.toString()
            goToScreenBWithData(emailValue, passwordValue)
            emailEditText.setText("")
            passwordEditText.setText("")
        }

    }

    fun goToScreenBWithData(emailValue: String, passwordValue: String) {
        val intent = Intent (this, ActivityScreenBTwo::class.java)

        intent.putExtra("EMAIL_KEY", emailValue)
        intent.putExtra("PASSWORD_KEY", passwordValue)

        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
        startActivity(intent)
    }

}