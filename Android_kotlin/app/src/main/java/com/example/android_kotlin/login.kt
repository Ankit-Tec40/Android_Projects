package com.example.android_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class login : AppCompatActivity() {
    lateinit var signup:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        signup=findViewById(R.id.signupB)
        signup.setOnClickListener {
            val intent=Intent(this,signup::class.java)
            startActivity(intent)
        }


    }
}