package com.example.android_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView

class AnnimaionImage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_annimaion_image)

        val image:ImageView=findViewById(R.id.imageView)
        val animationbounce = AnimationUtils.loadAnimation(this, R.anim.bounce)
        image.startAnimation(animationbounce)
    }
}