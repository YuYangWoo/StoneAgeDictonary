package com.cookandroid.stoneagedc.kindOfPet

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.cookandroid.stoneagedc.R
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_pet.*

class PetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pet)
        title = "펫 육성법"

        // ActionBar Home 버튼 Enable
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        var viewPager = ViewPagerAdapter(supportFragmentManager, lifecycle)
        viewpager.adapter = viewPager

        // TabLayout에 ViewPager를 연동
        TabLayoutMediator(tabLayout, viewpager, TabLayoutMediator.TabConfigurationStrategy { tab, position ->
            // 탭의 이름
            tab.text = getString(viewPager.fragmentList[position].tabTitle)
        }).attach()

        // 배너광고
        var mAdView = findViewById<AdView>(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)
    }

    //뒤로가기
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                //toolbar의 back키 눌렀을 때 동작
                finish()
                return true
            }

        }
        return super.onOptionsItemSelected(item)
    }

}