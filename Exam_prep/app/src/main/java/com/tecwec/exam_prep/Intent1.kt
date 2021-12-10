package com.tecwec.exam_prep

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Intent1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent1)
        val simpleIntent:Button=findViewById(R.id.simpleIntent)
        val getText:EditText=findViewById(R.id.getText)
        val passData:Button=findViewById(R.id.passDataIntent)
        val openApp:Button=findViewById(R.id.openAppIntent)
        val openurl:Button=findViewById(R.id.openUrlIntent)
        val call:Button=findViewById(R.id.callIntent)
        val messsage:Button=findViewById(R.id.messageIntent)



        simpleIntent.setOnClickListener {
            val intent=Intent(this,intent2::class.java)
            startActivity(intent)
        }
        passData.setOnClickListener {
            var data=getText.text.toString()
            val nextAct=Intent(this,intent2::class.java)
            nextAct.putExtra("data",data)
            startActivity(nextAct)
        }

        openApp.setOnClickListener {
            var intent=Intent()
        }

    }
}