package com.dzikyu01.praktikapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btn_login = findViewById<Button>(R.id.btn_login)

        btn_login.setOnClickListener{
            callActivity()
        }
    }
    private fun callActivity(){
        val editText = findViewById<EditText>(R.id.edt_text)
        val message = editText.text.toString()

        val intent = Intent(this,ProfileActivity::class.java).also {
            it.putExtra("EXTRA_MESSAGE",message)
            startActivity(it)
        }
    }

}