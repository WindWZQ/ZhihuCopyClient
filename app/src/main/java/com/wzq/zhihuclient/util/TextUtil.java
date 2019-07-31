package com.wzq.zhihuclient.util;

import android.text.TextUtils;

import com.alibaba.fastjson.JSON;

import java.util.UUID;

public class TextUtil {

    public static String uuid() {
        return UUID.randomUUID().toString();
    }

    public static void printJsonString(Object obj) {
        System.out.println(JSON.toJSONString(obj));
    }

    public static boolean isPhone(String content) {
        boolean isPhone = false;

        if (!TextUtils.isEmpty(content)) {
            isPhone = content.matches("^(1)[0-9]{10}$");
        }

        return isPhone;
    }

    public static boolean isEmail(String content) {
        boolean isEmail = false;

        if (!TextUtils.isEmpty(content)) {
            isEmail = content.matches("^.+(@).+(\\.).+$");
        }

        return isEmail;
    }

    // 4->10位账号
    public static boolean isAccount(CharSequence account) {
        if (TextUtils.isEmpty(account)) {
            return false;
        }

        // 字母数字下划线
        if (!account.toString().matches("^[a-zA-Z0-9_]+")) {
            return false;
        }

        return account.length() >= 4 && account.length() <= 10;
    }

    // 4->10位密码
    public static boolean isPassword(CharSequence password) {
        if (TextUtils.isEmpty(password)) {
            return false;
        }

        // 字母数字下划线
        if (!password.toString().matches("^[a-zA-Z0-9_]+")) {
            return false;
        }

        return password.length() >= 4 && password.length() <= 10;
    }

    // 随机数
    public static String randomCode(int length) {
        StringBuilder builder = new StringBuilder();
        String number = String.valueOf((int) (Math.random() * 1000000));

        for (int i = 0; i < length - number.length(); i++) {
            builder.append(0);
        }

        builder.append(number);

        return builder.toString();
    }

}
