package com.cookandroid.stoneagedc.kindOfPet

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.cookandroid.stoneagedc.R

class ViewPagerAdapter(fragmentManager: FragmentManager?, lifecycle: Lifecycle) : FragmentStateAdapter(fragmentManager!!, lifecycle) {

    val fragmentList = arrayOf(
            PetListFragment(R.string.pet_all), PetListFragment(R.string.pet_attack), PetListFragment(R.string.pet_defensive),
            PetListFragment(R.string.pet_control), PetListFragment(R.string.pet_wide), PetListFragment(R.string.pet_cure)
    )

    override fun getItemCount(): Int {
        return fragmentList.size
    }

    override fun createFragment(position: Int): Fragment {
       return fragmentList[position]
    }
}