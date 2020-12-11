package com.cookandroid.stoneagedc.PetSet

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.cookandroid.stoneagedc.R
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds
import kotlinx.android.synthetic.main.attack_pet.*

class CurePet : AppCompatActivity() {
    private var mAdView: AdView? = null
    private lateinit var name: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.cure_pet)

        // ActionBar Home 버튼 Enable
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        // 광고 붙이기
        MobileAds.initialize(this) { }
        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView!!.loadAd(adRequest)

        name = intent.getStringExtra("Name")
        title = name
        init(name)
    }

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

    private fun init(name:String) {

        when (name) {
            "도라비스" -> {
                txtAttack.text = "도라비스(1티어)"
                imgAttack.setImageResource(R.drawable.dorabis)
                txtGrowth.text = "체력, 순발 A+이상"
                txtPersonal.text = "인자한(추천),고귀한"
                txtTrain.text = "순발300후 체력"
                txtSkill.text = "궁극기, 패시브"
                txtResearch.text = "효율 : 체력, 체력%, 순발, 순발%, 치료효과\n 풀 : 체력, 체력%, 순발, 순발%, 치명타확률, 치명타효과, 치료효과, 회피, 상태이상무시, 치명타무시"
                txtCharm.text = "추천 : 체력(치효), 방어(회피), 순발(상무)\n치료효과,체력보조옵 사용"
                txtTotem.text = "치료효과토템"
            }
            "골드로비" -> {
                txtAttack.text = "골드로비(OP)"
                imgAttack.setImageResource(R.drawable.golfwolf)
                txtGrowth.text = "자신의덱 속성에 맞게 속성이 가장 중요\n체력,순발A+이상"
                txtPersonal.text = "여유로운"
                txtTrain.text = "순발300 후 체력"
                txtSkill.text = "궁극기, 패시브, 액티브"
                txtResearch.text = "효율 : 체력, 체력%, 순발, 순발%, 상태이상무시\n풀 : 체력, 체력%, 순발, 순발%, 치료효과, 상태이상무시, 회피, 명중(기깎회피방지용), 방어or상태이상or치명타무시시"
                txtCharm.text = "추천 : 방어(회피), 순발(상무), 체력(치효)"
                txtTotem.text = "체력토템"
            }
            "밤미" -> {
                txtAttack.text = "밤미(1티어)"
                imgAttack.setImageResource(R.drawable.bammi)
                txtGrowth.text = "체력,순발A+이상"
                txtPersonal.text = "인자한, 여유로운"
                txtTrain.text = "순발300 후 체력"
                txtSkill.text = "궁극기, 패시브, 액티브"
                txtResearch.text = "효율 : 체력, 체력%, 순발, 순발%, 치료효과, 상태이상무시\n풀 : 체력, 체력%, 순발, 순발%, 치료효과, 상태이상무시, 회피, 액티브용 명중 -방어or치명타무시시"
                txtCharm.text = "추천 : 체력(치효), 방어(회피), 순발(상무)\n치료효과,체력보조옵 사용"
                txtTotem.text = "치료효과, 토템"
            }
            "모나시프" -> {
                txtAttack.text = "모나시프(2티어)"
                imgAttack.setImageResource(R.drawable.monasif)
                txtGrowth.text = "체력,순발A+이상"
                txtPersonal.text = "인자한, 여유로운"
                txtTrain.text = "순발300 후 체력"
                txtSkill.text = "궁극기, 패시브, 액티브"
                txtResearch.text = "효율 : 체력, 체력%, 순발, 순발%, 치료효과, 상태이상무시\n풀 : 체력, 체력%, 순발, 순발%, 치료효과, 상태이상무시, 회피, 방어or상태이상or치명타무시시"
                txtCharm.text = "추천 : 체력(치효), 방어(회피), 순발(상무)\n치료효과,체력보조옵 사용"
                txtTotem.text = "치료효과토템"
            }
            "카쿠" -> {
                txtAttack.text = "카쿠(3티어)"
                imgAttack.setImageResource(R.drawable.kaku)
                txtGrowth.text = "체력,순발A+이상"
                txtPersonal.text = "인자한, 여유로운"
                txtTrain.text = "순발300 후 체력"
                txtSkill.text = "궁극기, 패시브, 액티브"
                txtResearch.text = "효율 : 체력, 체력%, 순발, 순발%, 치료효과, 상태이상무시\n풀 : 체력, 체력%, 순발, 순발%, 치료효과, 상태이상무시, 회피, 방어or상태이상or치명타무시시"
                txtCharm.text = "추천 : 체력(치효), 방어(회피), 순발(상무)\n치료효과,체력보조옵 사용"
                txtTotem.text = "치료효과토템"
            }
        }

    }
}