package com.tecwec.exam_prep

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class intent2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent2)
        var data:TextView=findViewById(R.id.getData)
        var text: String? = intent.getStringExtra("data").toString()
        data.text = text

    }
}