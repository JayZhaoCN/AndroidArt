package com.example.zhaoj.androidart

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

/**
 * @author : zhaojiabao@huami.com
 */

class Share2Activity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.test_tv).text = "SHARE_2"

        val intent = intent
        val uri = intent.data
    }
}