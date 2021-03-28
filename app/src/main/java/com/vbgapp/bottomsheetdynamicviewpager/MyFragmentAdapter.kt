package com.vbgapp.bottomsheetdynamicviewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class MyFragmentAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {

    companion object{
        const val NUM_ITEMS = 3
    }

    override fun getItem(position: Int): Fragment {
        when(position){
            0 -> return OneFragment()
            1 -> return TwoFragment()
        }
        return OneFragment()
    }

    override fun getCount(): Int {
        return  NUM_ITEMS
    }
}