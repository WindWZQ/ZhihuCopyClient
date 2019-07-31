package com.wzq.zhihuclient.util;

import android.content.Context;
import android.widget.Toast;

import com.wzq.zhihuclient.api.ApiClient;

public class ToastUtil {

    public static void s(Context context, String content) {
        Toast.makeText(context, content, Toast.LENGTH_SHORT).show();
    }

    public static void l(Context context, String content) {
        Toast.makeText(context, content, Toast.LENGTH_LONG).show();
    }

}
