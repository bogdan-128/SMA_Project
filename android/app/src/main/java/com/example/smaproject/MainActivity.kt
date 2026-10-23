package com.example.smaproject

import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.widget.FrameLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val helloText = TextView(this).apply {
            text = "Hello World"
            textSize = 32f
            setOnClickListener { setTextColor(randomRgbColor()) }
        }

        val root = FrameLayout(this).apply {
            addView(
                helloText,
                FrameLayout.LayoutParams(
                    FrameLayout.LayoutParams.WRAP_CONTENT,
                    FrameLayout.LayoutParams.WRAP_CONTENT
                ).apply {
                    gravity = Gravity.CENTER
                }
            )
        }

        setContentView(root)
    }

    private fun randomRgbColor(): Int =
        Color.rgb(Random.nextInt(256), Random.nextInt(256), Random.nextInt(256))
}
