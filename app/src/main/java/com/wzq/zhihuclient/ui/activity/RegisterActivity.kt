package com.wzq.zhihuclient.ui.activity

import android.os.Bundle
import com.wzq.zhihuclient.R
import com.wzq.zhihuclient.api.ApiClient
import com.wzq.zhihuclient.common.BaseActivity
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        init()
    }

    private fun init() {
        tvRegister.setOnClickListener {
            register()
        }
    }

    private fun register() {
        ApiClient.get()
    }

}
