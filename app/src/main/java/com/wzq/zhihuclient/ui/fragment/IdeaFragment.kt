package com.wzq.zhihuclient.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.wzq.zhihuclient.R
import com.wzq.zhihuclient.common.BaseFragment

class IdeaFragment : BaseFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_idea, container, false)
    }

}

