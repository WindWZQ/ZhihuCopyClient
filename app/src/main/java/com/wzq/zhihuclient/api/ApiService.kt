package com.wzq.zhihuclient.api

import com.wzq.zhihuclient.api.response.LoginResp
import kotlinx.coroutines.Deferred
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface ApiService {

    // 注册
    @FormUrlEncoded
    @POST("api/v1/pricetask/download")
    fun register(@Field("cityCode") cityCode: String, @Field("orgCode") orgCode: String): Deferred<LoginResp>


    // 登录

}
