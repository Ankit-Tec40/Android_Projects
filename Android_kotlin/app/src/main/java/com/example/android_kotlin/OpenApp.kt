package com.example.android_kotlin

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class OpenApp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_open_app)

        var btn = findViewById<Button>(R.id.button4)
        btn.setOnClickListener {
            var url = "http://www.google.com"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.setDataAndType(Uri.parse(url), "text/plain")
            val choose = Intent.createChooser(intent, "Share URL")
            startActivity(choose)
        }
    }
}