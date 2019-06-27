package com.wzq.zhihuclient.util;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

import com.wzq.zhihuclient.ui.activity.LoginActivity;

public class SpUtil {

    private final static String SP_NAME = "zhihu";

    public final static String SP_KEY_TOKEN = "sp_key_token";

    public static void put(Context context, String key, Object data) {
        SharedPreferences sp = context.getSharedPreferences(SP_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();

        if (data instanceof Integer) {
            editor.putInt(key, (Integer) data);
        } else if (data instanceof Long) {
            editor.putLong(key, (Long) data);
        } else if (data instanceof Float) {
            editor.putFloat(key, (Float) data);
        } else if (data instanceof String) {
            editor.putString(key, (String) data);
        } else if (data instanceof Boolean) {
            editor.putBoolean(key, (Boolean) data);
        }

        editor.apply();
    }

    public static Object get(Context context, String key, Object def) {
        SharedPreferences sp = context.getSharedPreferences(SP_NAME, Context.MODE_PRIVATE);

        if (def instanceof Integer) {
            return sp.getInt(key, (Integer) def);
        } else if (def instanceof Long) {
            return sp.getLong(key, (Long) def);
        } else if (def instanceof Float) {
            return sp.getFloat(key, (Float) def);
        } else if (def instanceof String) {
            return sp.getString(key, (String) def);
        } else if (def instanceof Boolean) {
            return sp.getBoolean(key, (Boolean) def);
        }

        return null;
    }

    public static void remove(Context context, String key) {
        SharedPreferences sp = context.getSharedPreferences(SP_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();

        editor.remove(key);
        editor.apply();
    }

    public static void clear(Context context) {
        SharedPreferences sp = context.getSharedPreferences(SP_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();

        editor.clear();
        editor.apply();
    }

}
