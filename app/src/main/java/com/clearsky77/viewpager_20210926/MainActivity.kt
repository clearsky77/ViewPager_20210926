package com.clearsky77.viewpager_20210926

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.clearsky77.viewpager_20210926.adapters.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mvpa : MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mvpa = MainViewPagerAdapter( supportFragmentManager ) //어댑터를 만들어 주시오.
        mainViewPager.adapter = mvpa // 메인 페이지에 어댑터를 올려준다.

//      탭레이아웃을 뷰 페이저와 연계
        mainTabLayout.setupWithViewPager(mainViewPager)
    }
}