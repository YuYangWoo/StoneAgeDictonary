package com.cookandroid.stoneagedc

import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds
import kotlinx.android.synthetic.main.activity_growth.*
import kotlin.math.roundToInt

class GrowthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_growth)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        title = "성장률 계산기"


        btnHealth.setOnClickListener {
            resultMethod(edtHealthBefore.text.toString().toDouble(), edtHealthAfter.text.toString().toDouble(), txtHealthResult, txtHealthGrowth)
        }

        btnAttack.setOnClickListener {
            resultMethod(edtAttackBefore.text.toString().toDouble(), edtAttackAfter.text.toString().toDouble(), txtAttackResult, txtAttackGrowth)
        }

        btnDefense.setOnClickListener {
            resultMethod(edtDefenseBefore.text.toString().toDouble(), edtDefenseAfter.text.toString().toDouble(), txtDefenseResult, txtDefenseGrowth)
        }

        btnSpeed.setOnClickListener {
            resultMethod(edtSpeedBefore.text.toString().toDouble(), edtSpeedAfter.text.toString().toDouble(), txtSpeedResult, txtSpeedGrowth)
        }

        // 배너광고
        MobileAds.initialize(this) { }
        var mAdView = findViewById<AdView>(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)
    }

    private fun resultMethod(editBefore: Double, editAfter: Double, txtResult: TextView, txtGrowth: TextView) {
        var a = editBefore
        var b = editAfter
        var c = (a / b)
        var result = (c*1000).roundToInt() / 1000f
        txtResult.text = result.toString()
        when (result) {
            in 0.00..0.60 -> {
                txtGrowth.text = "D"
            }
            in 0.60..0.70 -> {
                txtGrowth.text = "C"
            }
            in 0.700..0.729 -> {
                txtGrowth.text = "B등급이며 보통입니다."
            }
            in 0.730..0.749 -> {
                txtGrowth.text = "B등급이지만 B+에 가깝습니다."
            }
            in 0.750..0.779 -> {
                txtGrowth.text = "B+등급이며 보통입니다."
            }
            in 0.780..0.799 -> {
                txtGrowth.text = "B+등급이지만 A에 가깝습니다."
            }
            in 0.800..0.829 -> {
                txtGrowth.text = "A등급이며 보통입니다."
            }
            in 0.829..0.849 -> {
                txtGrowth.text = "A등급이지만 A+에 가깝습니다."
            }
            in 0.850..0.879 -> {
                txtGrowth.text = "A+등급이며 보통입니다."
            }
            in 0.880..0.899 -> {
                txtGrowth.text = "A+등급이지만 S에 가깝습니다."
            }
            in 0.900..0.929 -> {
                txtGrowth.text = "S등급이며 보통입니다."
            }
            in 0.930..0.949 -> {
                txtGrowth.text = "S등급이지만 S+에 가깝습니다 축하합니다 !"
            }
            in 0.950..0.999 -> {
                txtGrowth.text = "와우 S+축하드려요 !"
            }
            in 1.000..1.000 -> {
                txtGrowth.text = "와우 완벽한 맥스S+축하드려요 !"
            }
        }
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