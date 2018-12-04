package com.github.brianbridge.fullscreensettingtemplate

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.WindowManager
import kotlinx.android.synthetic.main.activity_demo.*


class TransparentStatusBarActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.statusBarColor = ContextCompat.getColor(this, android.R.color.transparent)
            val decorView = window.decorView
            decorView.systemUiVisibility = decorView.systemUiVisibility or View.SYSTEM_UI_FLAG_LAYOUT_STABLE or
                    View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
        }
        setContentView(R.layout.activity_demo)

        text_view.text = "This activity is in fullscreen mode by changing DecorView's system ui visibility\n" +
                "API < 23 will still have status bar according to the official design guide\n" +
                "API >= 23 will made status bar transparent and draw layouts under status bar\n" +
                "Adding fitSystemWindow tag to root layout container also make input adjust resize possible"
    }
}