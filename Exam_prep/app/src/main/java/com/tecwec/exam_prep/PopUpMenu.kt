package com.tecwec.exam_prep

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.PopupMenu

class PopUpMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pop_up_menu)
        val popupB:Button=findViewById(R.id.PopUpMenuID)
        popupB.setOnClickListener {
            val popup=PopupMenu(this,popupB)
            popup.inflate(R.menu.nav_menu)
            popup.show()
        }

    }
}