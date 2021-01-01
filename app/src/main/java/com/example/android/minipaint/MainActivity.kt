package com.example.android.minipaint

import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.View.SYSTEM_UI_FLAG_FULLSCREEN
import android.view.WindowInsets
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val myCanvasView = MyCanvasView(this)
        myCanvasView.contentDescription = getString(R.string.canvasContentDescription)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            val controller = window.insetsController
            controller?.hide(WindowInsets.Type.statusBars())
        } else {
            myCanvasView.systemUiVisibility = SYSTEM_UI_FLAG_FULLSCREEN
        }
        setContentView(myCanvasView)
    }
}