package com.example.practice

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.practice.Login
import com.example.practice.R
import com.example.practice.Register

class MainActivity : AppCompatActivity() {
    val LoginBtn = findViewById<Button>(R.id.LoginBtn)
    val RegisterBtn = findViewById<Button>(R.id.RegisterBtn)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        LoginBtn.setOnClickListener {
            startActivity(Intent(this, Login::class.java))
        }

        RegisterBtn.setOnClickListener {
            startActivity(Intent(this, Register::class.java))
        }
    }
}
