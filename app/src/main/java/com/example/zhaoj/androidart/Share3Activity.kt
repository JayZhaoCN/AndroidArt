package com.example.zhaoj.androidart

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

/**
 * @author : zhaojiabao@huami.com
 */

class Share3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.test_tv).text = "Share3"
    }

}