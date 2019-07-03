package com.wzq.zhihuclient.ui.fragment

import android.graphics.BitmapFactory
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.wzq.zhihuclient.R
import com.wzq.zhihuclient.common.BaseFragment
import com.wzq.zhihuclient.ui.activity.LoginActivity
import com.wzq.zhihuclient.util.BlurUtil
import kotlinx.android.synthetic.main.fragment_mine.*

class MineFragment : BaseFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_mine, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        init()
    }

    private fun init() {
        tv_mine_other_login.setOnClickListener {
            intentTo(LoginActivity::class.java)
        }

        val bmp = BitmapFactory.decodeResource(resources, R.mipmap.ic_head_1)
        BlurUtil.fromBitmap(activity!!, bmp, 25.0F)
        iv_mine_personal_blur.setImageBitmap(bmp)
    }

}