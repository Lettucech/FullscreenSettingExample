package com.github.brianbridge.fullscreensettingtemplate

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_full_screen_activity?.setOnClickListener {
            startActivity(Intent(this, FullscreenFlagActivity::class.java))
        }

        btn_transparent_status_bar?.setOnClickListener {
            startActivity(Intent(this, TransparentStatusBarActivity::class.java))
        }
    }
}
