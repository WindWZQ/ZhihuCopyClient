package com.wzq.zhihuclient

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import com.wzq.zhihuclient.common.BaseActivity
import com.wzq.zhihuclient.ui.fragment.HomeFragment
import com.wzq.zhihuclient.ui.fragment.IdeaFragment
import com.wzq.zhihuclient.ui.fragment.MessageFragment
import com.wzq.zhihuclient.ui.fragment.MineFragment

class MainActivity : BaseActivity() {

    // 主页fragment类型
    private val FRAGMENT_HOME = 0
    private val FRAGMENT_IDEA = 1
    private val FRAGMENT_MESSAGE = 2
    private val FRAGMENT_MINE = 3

    // 主页fragment
    private var homeFragment: HomeFragment? = null
    private var ideaFragment: IdeaFragment? = null
    private var messageFragment: MessageFragment? = null
    private var mineFragment: MineFragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    private fun init() {
        val navigation = findViewById<BottomNavigationView>(R.id.navigation)
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

        switchFragment(FRAGMENT_HOME)
    }

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                switchFragment(FRAGMENT_HOME)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_idea -> {
                switchFragment(FRAGMENT_IDEA)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_message -> {
                switchFragment(FRAGMENT_MESSAGE)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_mine -> {
                switchFragment(FRAGMENT_MINE)
                return@OnNavigationItemSelectedListener true
            }
        }

        return@OnNavigationItemSelectedListener false
    }

    // 切换fragment
    private fun switchFragment(which: Int) {
        val transaction = supportFragmentManager.beginTransaction()

        when (which) {
            FRAGMENT_HOME -> {
                ideaFragment?.let { transaction.hide(ideaFragment!!) }
                messageFragment?.let { transaction.hide(messageFragment!!) }
                mineFragment?.let { transaction.hide(mineFragment!!) }

                if (null == homeFragment) {
                    homeFragment = HomeFragment()
                    transaction.add(R.id.rl_container, homeFragment!!)
                } else {
                    if (homeFragment!!.isHidden) {
                        transaction.show(homeFragment!!)
                    }
                }
            }
            FRAGMENT_IDEA -> {
                homeFragment?.let { transaction.hide(homeFragment!!) }
                messageFragment?.let { transaction.hide(messageFragment!!) }
                mineFragment?.let { transaction.hide(mineFragment!!) }

                if (null == ideaFragment) {
                    ideaFragment = IdeaFragment()
                    transaction.add(R.id.rl_container, ideaFragment!!)
                } else {
                    if (ideaFragment!!.isHidden) {
                        transaction.show(ideaFragment!!)
                    }
                }
            }
            FRAGMENT_MESSAGE -> {
                homeFragment?.let { transaction.hide(homeFragment!!) }
                ideaFragment?.let { transaction.hide(ideaFragment!!) }
                mineFragment?.let { transaction.hide(mineFragment!!) }

                if (null == messageFragment) {
                    messageFragment = MessageFragment()
                    transaction.add(R.id.rl_container, messageFragment!!)
                } else {
                    if (messageFragment!!.isHidden) {
                        transaction.show(messageFragment!!)
                    }
                }
            }
            FRAGMENT_MINE -> {
                homeFragment?.let { transaction.hide(homeFragment!!) }
                ideaFragment?.let { transaction.hide(ideaFragment!!) }
                messageFragment?.let { transaction.hide(messageFragment!!) }

                if (null == mineFragment) {
                    mineFragment = MineFragment()
                    transaction.add(R.id.rl_container, mineFragment!!)
                } else {
                    if (mineFragment!!.isHidden) {
                        transaction.show(mineFragment!!)
                    }
                }
            }
        }

        transaction.commit()
    }

}
