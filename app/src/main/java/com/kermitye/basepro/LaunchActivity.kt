package com.kermitye.basepro

import android.os.Bundle
import com.kermitye.baselib.ui.BaseActivity
import kotlinx.android.synthetic.main.activity_launch.*
import org.jetbrains.anko.startActivity

/**
 * Created by kermitye
 * Date: 2018/9/6 17:00
 * Desc:
 */
class LaunchActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch)
        mTvTitle.setOnClickListener { startActivity<MainActivity>() }
    }
}