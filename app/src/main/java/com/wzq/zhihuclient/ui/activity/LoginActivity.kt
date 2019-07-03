package com.wzq.zhihuclient.ui.activity

import android.os.Bundle
import com.wzq.zhihuclient.R
import com.wzq.zhihuclient.common.BaseActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        init()
    }

    private fun init() {
        tvToRegister.setOnClickListener {
            intentTo(RegisterActivity::class.java)
            finish()
        }
    }

}
