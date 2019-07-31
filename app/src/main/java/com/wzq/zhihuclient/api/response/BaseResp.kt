package com.wzq.zhihuclient.api.response

data class BaseResp<T>(
        var code: Int = 0,
        var msg: String? = null,
        var data: T? = null,
        var dataList: List<T>? = null
)
