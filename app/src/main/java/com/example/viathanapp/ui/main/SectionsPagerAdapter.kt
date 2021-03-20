package com.example.viathanapp.ui.main

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.viathanapp.MonthFragment
import com.example.viathanapp.R
import com.example.viathanapp.TodayFragment
import com.example.viathanapp.WeekFragment

//private val TAB_TITLES = arrayOf(
//    R.string.tab_text_1,
//    R.string.tab_text_2,
//    R.string.tab_text_3
//)
//
///**
// * A [FragmentPagerAdapter] that returns a fragment corresponding to
// * one of the sections/tabs/pages.
// */
//class SectionsPagerAdapter(private val context: Context, fm: FragmentManager) :
//    FragmentPagerAdapter(fm) {
//
//    override fun getItem(position: Int): Fragment {
//        // getItem is called to instantiate the fragment for the given page.
//        // Return a PlaceholderFragment (defined as a static inner class below).
//        return PlaceholderFragment.newInstance(position + 1)
//    }
//
//    override fun getPageTitle(position: Int): CharSequence? {
//        return context.resources.getString(TAB_TITLES[position])
//    }
//
//    override fun getCount(): Int {
//        // Show 2 total pages.
//        return 3
//    }
//}


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
        return 4
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when (position) {
            0 -> return "ABOUT"
            1 -> return "WORKS"
            2 -> return "SKILLS"
            3 -> return "CONTACT"
        }

        return null

    }

}
