package com.example.loginapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameInput = findViewById<EditText>(R.id.nameInput)
        val passwordInput = findViewById<EditText>(R.id.passwordInput)
        val resultText = findViewById<TextView>(R.id.resultText)
        val loginButton = findViewById<Button>(R.id.loginButton)

        loginButton.setOnClickListener {
            val name = nameInput.text.toString()
            val password = passwordInput.text.toString()

            if (name == "BHANU" && password == "12345") {
                resultText.text = "✅ Welcome, $name!"
            } else {
                resultText.text = "❌ Error! Try again."
            }
        }
    }
}
