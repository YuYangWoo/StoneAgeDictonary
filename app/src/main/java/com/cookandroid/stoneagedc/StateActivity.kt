package com.cookandroid.stoneagedc

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.cookandroid.stoneagedc.databinding.ActivityStateIdealBinding
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView

class StateActivity :BaseActivity<ActivityStateIdealBinding>(R.layout.activity_state_ideal) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.state = this

        setRcvState()
        initActionBar()
        ad()
    }

   private fun setRcvState() {
        val stateAdapter = StateAdapter(this)
        binding.recState.layoutManager = LinearLayoutManager(this)
        binding.recState.adapter = stateAdapter
        stateAdapter.notifyDataSetChanged()
    }

    private fun initActionBar() {
        setSupportActionBar(binding.toolbar)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        title = "상태이상정보"
    }

    fun ad(){
        val mAdView = findViewById<AdView>(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)
    }
    data class StateItem(
            var name: String,
            var content: String,
    )
}