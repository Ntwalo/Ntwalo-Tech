package com.example.practice

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Login : AppCompatActivity() {

    val LoginBtn = findViewById<Button>(R.id.LoginBtn1)
    val SignUpTv: TextView = findViewById(R.id.SignUpTv1)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        LoginBtn.setOnClickListener {
            startActivity(Intent(this, Dashboard::class.java))
        }

        SignUpTv.setOnClickListener {
            val intent = Intent(this, Register::class.java)
            startActivity(intent)
        }

    }
}