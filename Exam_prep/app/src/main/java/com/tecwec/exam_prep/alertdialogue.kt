package com.tecwec.exam_prep

import android.content.DialogInterface
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class alertdialogue : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alertdialogue)
/////Simple Alert
        val alertB:Button=findViewById(R.id.alertDId)
        alertB.setOnClickListener {
            val alert=AlertDialog.Builder(this)
            alert.setTitle("Are you sure")
            alert.setMessage("Ae you want to exit")
            alert.setPositiveButton("yes",{ dialogInterface: DialogInterface, i: Int ->finish() })
            alert.show()
        }


////Custom Alert
        val customalertB:Button=findViewById(R.id.customalertBID)
        customalertB.setOnClickListener {
            val alert=AlertDialog.Builder(this)
            val alertview=layoutInflater.inflate(R.layout.custon_dialog,null)
            alert.setView(alertview)
            alert.setTitle("CAll")
            alert.setMessage("Enter Mobile No")
            alert.setCancelable(false)
            alert.setPositiveButton("CALL") { dialogInterface: DialogInterface, i: Int ->
                val mobno: EditText = findViewById(R.id.getmobnoID)
                val no = mobno.text.toString()
//                val intent = Intent(Intent.ACTION_DIAL)
//                intent.data = Uri.parse("tel:$no")
//                startActivity(intent)
//                finish()
            }
            alert.show()
        }

    }
}