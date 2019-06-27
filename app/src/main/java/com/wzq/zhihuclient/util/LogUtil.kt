package com.wzq.zhihuclient.util

import android.util.Log
import com.wzq.zhihuclient.BuildConfig

object LogUtil {

    fun i(tag: String, content: String) {
        if (BuildConfig.DEBUG) {
            Log.i(tag, content)
        }
    }

    fun e(tag: String, content: String) {
        if (BuildConfig.DEBUG) {
            Log.e(tag, content)
        }
    }

}
