package com.wzq.zhihuclient.api

import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiClient {

    private fun create(): ApiService {
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY

        val builder = OkHttpClient.Builder()
        builder.addInterceptor(interceptor)

        val retrofit = Retrofit.Builder()
                .baseUrl("http://192.168.11.86:10001/")
                .addConverterFactory(GsonConverterFactory.create(GsonBuilder().setLenient().create()))
                .client(builder.build())
                .build()

        return retrofit.create(ApiService::class.java)
    }

    companion object {
        private var api: ApiService? = null

        @Synchronized
        fun get(): ApiService {
            if (null == api) {
                api = ApiClient().create()
            }

            return api!!
        }
    }

}
