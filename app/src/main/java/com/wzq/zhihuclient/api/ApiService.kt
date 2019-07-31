package com.wzq.zhihuclient.api

import com.wzq.zhihuclient.api.response.BaseResp
import com.wzq.zhihuclient.api.response.LoginResp
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface ApiService {

    // 注册
    @FormUrlEncoded
    @POST("v1/user/register")
    fun register(@Field("account") account: String, @Field("password") password: String): Call<BaseResp<String>>

    // 登录
    @FormUrlEncoded
    @POST("v1/user/login")
    fun login(@Field("account") account: String, @Field("password") password: String): Call<BaseResp<String>>

}
