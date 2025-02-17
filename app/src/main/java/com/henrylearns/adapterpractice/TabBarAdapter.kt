package com.henrylearns.adapterpractice

import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.fragment.app.FragmentStatePagerAdapter

class TabBarAdapter (fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {


        override fun getItem(position: Int): Fragment {
            return when (position) {
                0 ->{ Log.d("getItemCheck","Went to 0")
                    return EventFragment()}
                else -> {
                    Log.d("getItemCheck","Went to 1")
                    SponsorFragment()}

                }

        }

        override fun getCount(): Int {
            return 2
        }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position){
            1-> "Sponsors"
            2->"Events"
            else->{return "Events"}
        }
    }
    }
