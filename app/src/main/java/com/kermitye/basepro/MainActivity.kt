 package com.kermitye.basepro

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.kermitye.baselib.ui.BaseActivity


 class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
