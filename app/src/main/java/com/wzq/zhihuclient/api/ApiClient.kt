package com.wzq.zhihuclient.api

import retrofit2.Retrofit

class ApiClient {

    private fun create(): ApiService {
        val retrofit = Retrofit.Builder()
                .baseUrl("http://127.0.0.1:10001/")
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
