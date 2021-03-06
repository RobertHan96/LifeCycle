package com.nexon.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

abstract class BaseActivity : AppCompatActivity() {
    val mContext = this

    abstract fun setupEvents()
    abstract fun setValus()
}
