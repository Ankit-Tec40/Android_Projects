package com.tecwec.exam_prep

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.View
import android.widget.Button

class ContextMenu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_context_menu)

        val C_menu:Button=findViewById(R.id.contextmenuID)
        registerForContextMenu(C_menu)

    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        menuInflater.inflate(R.menu.nav_menu,menu)
        super.onCreateContextMenu(menu, v, menuInfo)
    }
}