package com.wzq.zhihuclient.common

import android.content.Intent
import android.os.Bundle
import android.support.v4.view.ViewCompat
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.view.WindowManager

import com.wzq.zhihuclient.R
import com.wzq.zhihuclient.util.LogUtil

abstract class BaseActivity : AppCompatActivity() {
    private val TAG = javaClass.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initBase()
    }

    private fun initBase() {
        val window = window
        //取消状态栏透明
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        //添加Flag把状态栏设为可绘制模式
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        //设置状态栏颜色
        window.statusBarColor = resources.getColor(R.color.light_blue_700)
        //设置系统状态栏处于可见状态
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_VISIBLE
        //让view不根据系统窗口来调整自己的布局
        val mContentView = window.findViewById<ViewGroup>(Window.ID_ANDROID_CONTENT)
        val mChildView = mContentView.getChildAt(0)
        if (mChildView != null) {
            mChildView.fitsSystemWindows = false
            ViewCompat.requestApplyInsets(mChildView)
        }
    }

    protected fun intentTo(clazz: Class<*>) {
        val intent = Intent(this, clazz)
        startActivity(intent)
    }

    protected fun intentTo(clazz: Class<*>, bundle: Bundle?) {
        val intent = Intent(this, clazz)
        startActivity(intent, bundle)
    }

    protected fun intentToForResult(clazz: Class<*>, code: Int) {
        val intent = Intent(this, clazz)
        startActivityForResult(intent, code)
    }

    protected fun intentToForResult(clazz: Class<*>, code: Int, bundle: Bundle?) {
        val intent = Intent(this, clazz)
        startActivityForResult(intent, code, bundle)
    }

    private fun logger(content: String) {
        LogUtil.i(TAG, content)
    }

}
