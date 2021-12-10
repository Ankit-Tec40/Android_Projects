package com.example.android_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView

class Annimation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_annimation)


        var fade_in: Button = findViewById<Button>(R.id.fade_in)
        var fade_out: Button = findViewById<Button>(R.id.fade_out)
        var zoom_in: Button = findViewById<Button>(R.id.zoom_in)
        var zoom_out: Button = findViewById<Button>(R.id.zoom_out)
        var slide_down: Button = findViewById<Button>(R.id.slide_down)
        var slide_up: Button = findViewById<Button>(R.id.slide_up)
        var bounce: Button = findViewById<Button>(R.id.bounce)
        var rotate: Button = findViewById<Button>(R.id.rotate)
        var textView: TextView = findViewById<TextView>(R.id.textView)

        fade_in.setOnClickListener {
            textView.visibility = View.VISIBLE
            val animationFadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in)
            textView.startAnimation(animationFadeIn)
        }
        fade_out.setOnClickListener {
            val animationFadeOut = AnimationUtils.loadAnimation(this, R.anim.fade_out)
            textView.startAnimation(animationFadeOut)

        }
        zoom_in.setOnClickListener {
            val animationZoomIn = AnimationUtils.loadAnimation(this, R.anim.zoom_in)
            textView.startAnimation(animationZoomIn)
        }
        zoom_out.setOnClickListener {
            val animationZoomOut = AnimationUtils.loadAnimation(this, R.anim.zoom_out)
            textView.startAnimation(animationZoomOut)
        }
        slide_down.setOnClickListener {
            val animationSlideDown = AnimationUtils.loadAnimation(this, R.anim.slide_in)
            textView.startAnimation(animationSlideDown)
        }
        slide_up.setOnClickListener {
            val animationSlideUp = AnimationUtils.loadAnimation(this, R.anim.slide_out)
            textView.startAnimation(animationSlideUp)
        }
        bounce.setOnClickListener {
            val animationBounce = AnimationUtils.loadAnimation(this, R.anim.bounce)
            textView.startAnimation(animationBounce)
        }
        rotate.setOnClickListener {
            val animationRotate = AnimationUtils.loadAnimation(this, R.anim.rotate)
            textView.startAnimation(animationRotate)
        }

    }
}