package com.wzq.zhihuclient.common

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import com.wzq.zhihuclient.util.LogUtil

abstract class BaseFragment : Fragment() {
    private val TAG = javaClass.simpleName

    protected fun intentTo(clazz: Class<*>) {
        val intent = Intent(activity!!, clazz)
        startActivity(intent)
    }

    protected fun intentTo(clazz: Class<*>, bundle: Bundle?) {
        val intent = Intent(activity!!, clazz)
        startActivity(intent, bundle)
    }

    protected fun intentToForResult(clazz: Class<*>, code: Int) {
        val intent = Intent(activity!!, clazz)
        startActivityForResult(intent, code)
    }

    protected fun intentToForResult(clazz: Class<*>, code: Int, bundle: Bundle?) {
        val intent = Intent(activity!!, clazz)
        startActivityForResult(intent, code, bundle)
    }

    private fun logger(content: String) {
        LogUtil.i(TAG, content)
    }

}
