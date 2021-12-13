package com.tecwec.exam_prep

import android.content.Intent
import android.net.Uri
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
        val message:Button=findViewById(R.id.messageIntent)
        val map:Button=findViewById(R.id.mapId)




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

////Implict Intent
        openurl.setOnClickListener {
            var intent=Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.youtube.com/watch?v=n9opDf7CL4g")
            startActivity(intent)
        }

        message.setOnClickListener {
            val intent=Intent(Intent.ACTION_SENDTO)
            intent.data = Uri.parse("sms:123456789")
            startActivity(intent)
        }

        call.setOnClickListener {
            val intent=Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:123456789")
            startActivity(intent)
        }

        map.setOnClickListener {
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("geo:0,0?q=patna")
            startActivity(intent)
        }

    }
}