package com.github.brianbridge.fullscreensettingtemplate

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.WindowManager
import kotlinx.android.synthetic.main.activity_demo.*

class FullscreenFlagActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)
        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE)
        setContentView(R.layout.activity_demo)

        text_view.text = "This activity is in fullscreen mode by added fullscreen flag into window\n" +
                "For API 23+, if the device has cutouts area on status bar, it will cause to show a black status bar\n" +
                "In window fullscreen mode, input mode always in adjust pan"
    }
}