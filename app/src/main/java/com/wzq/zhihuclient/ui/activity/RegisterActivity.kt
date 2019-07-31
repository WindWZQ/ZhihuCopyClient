package com.wzq.zhihuclient.ui.activity

import android.os.Bundle
import com.wzq.zhihuclient.R
import com.wzq.zhihuclient.api.ApiClient
import com.wzq.zhihuclient.api.response.BaseResp
import com.wzq.zhihuclient.common.BaseActivity
import com.wzq.zhihuclient.util.TextUtil
import com.wzq.zhihuclient.util.ToastUtil
import kotlinx.android.synthetic.main.activity_register.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

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
        val account = etAccount.text
        val password = etPassword.text
        val secondPassword = etSecondPassword.text

        // 判断账号密码
        if (!TextUtil.isAccount(account) || !TextUtil.isPassword(password) || !TextUtil.isPassword(secondPassword)) {
            ToastUtil.s(this, "账号或密码必须都是4-10位字母数字下划线")
            return
        }

        // 两次密码相同
        if (password.toString() != secondPassword.toString()) {
            ToastUtil.s(this, "二次输入密码不一样")
            return
        }

        // 调用注册
        ApiClient.get().register(account.toString(), password.toString()).enqueue(object:Callback<BaseResp<String>>{
            override fun onFailure(call: Call<BaseResp<String>>, t: Throwable) {

            }

            override fun onResponse(call: Call<BaseResp<String>>, response: Response<BaseResp<String>>) {

            }
        })
    }

}
