package com.tecwec.exam_prep

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.BaseTransientBottomBar.LENGTH_LONG
import com.google.android.material.snackbar.Snackbar

class Snackbar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snackbar)

        var clickme:Button=findViewById(R.id.button)
        var screen:ConstraintLayout=findViewById(R.id.MainLayout)
        clickme.setOnClickListener {
        Snackbar.make(screen,"This is snackbar",Snackbar.LENGTH_LONG).setAction("click me"){
            Toast.makeText(this, "This is snackbar operation", Toast.LENGTH_SHORT).show()
        }.show()

        }
    }
}