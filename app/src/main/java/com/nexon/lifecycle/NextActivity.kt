package com.nexon.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class NextActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)
        setupEvents()
        setValus()
        Log.d("NextActivity", "onCreate실행")

    }

    override fun onResume() {
        super.onResume()
        Log.d("NextActivity", "onResume실행")
    }

    override fun setupEvents() {
    }

    override fun setValus() {
    }

}
