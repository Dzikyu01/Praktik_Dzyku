package com.dzikyu01.praktikapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val LoginButton = findViewById<Button>(R.id.btn)
        LoginButton.setOnClickListener{
            val Intent = Intent (this,Login::class.java)
            startActivity(Intent)
        }
    }
}