package com.example.viathanapp.ui.main

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.viathanapp.MonthFragment
import com.example.viathanapp.R
import com.example.viathanapp.TodayFragment
import com.example.viathanapp.WeekFragment



class SectionsPagerAdapter(fragmentManager: FragmentManager): FragmentPagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    override fun getItem(position: Int): Fragment {
        val fragmentList: MutableList<Fragment> = ArrayList()
        when (position) {
            0 -> return TodayFragment()
            1 -> return WeekFragment()
            2 -> return MonthFragment()

        }
        return fragmentList[position]

    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when (position) {
            0 -> return "TODAY"
            1 -> return "WEEK"
            2 -> return "MONTH"

        }

        return null

    }

}
