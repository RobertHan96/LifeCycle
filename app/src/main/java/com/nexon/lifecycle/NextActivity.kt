package com.nexon.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class NextActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)
        setupEvents()
        setValus()
    }

    override fun setupEvents() {
    }

    override fun setValus() {
    }

}
