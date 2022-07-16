package com.example.ohou_clone

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter (fragment: FindcomFragment) : FragmentStateAdapter(fragment){

    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> ShopHomeFragment()
            1 -> StoreFragment()
            2 -> FindcomFragment()
            else -> MypageFragment()
        }
    }
}