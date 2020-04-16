package com.nexon.lifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValus()
        Log.d("MainActivity", "onCreate실행")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivity", "onResume실행")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity", "onPause실행")
    }

    override fun setupEvents() {
        nextBtn.setOnClickListener {
            val myIntent = Intent(mContext, NextActivity::class.java)
            startActivity(myIntent)
        }
    }

    override fun setValus() {

    }

}
