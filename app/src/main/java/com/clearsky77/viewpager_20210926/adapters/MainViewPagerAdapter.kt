package com.clearsky77.viewpager_20210926.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.clearsky77.viewpager_20210926.fragments.AgeFragment
import com.clearsky77.viewpager_20210926.fragments.GreetingFragment
import com.clearsky77.viewpager_20210926.fragments.NameFragment

class MainViewPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm){
    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        if(position == 0){
            return GreetingFragment()
        }else if(position == 1){
            return NameFragment()
        }else{
            return AgeFragment()
        }
    }

}