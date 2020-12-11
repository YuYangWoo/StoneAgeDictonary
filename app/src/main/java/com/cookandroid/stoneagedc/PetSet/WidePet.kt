package com.cookandroid.stoneagedc.PetSet

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.cookandroid.stoneagedc.R
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds
import kotlinx.android.synthetic.main.attack_pet.*

class WidePet : AppCompatActivity() {
    private var mAdView: AdView? = null
    private lateinit var name: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.wide_pet)

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
            "모가로스" -> {
                txtAttack.text = "모가로스(1티어)"
                imgAttack.setImageResource(R.drawable.mogaros)
                txtGrowth.text = "오르곤, 모가로스 추천\n공격, 순발 S이상"
                txtPersonal.text = "용감한"
                txtTrain.text = "올공격"
                txtSkill.text = "액티브->패시브->궁극기"
                txtResearch.text = "효율 : 체력, 공격, 공격%, 순발, 순발%, 치명타확률, 치명타효과, 명중 , 상태이상무시, 회피"
                txtCharm.text = "추천 : 공격(치or명), 방어(회피), 순발(상무)"
                txtTotem.text = "공격(치명)"
            }
            "모가로스(탑승)" -> {
                txtAttack.text = "모가로스(탑승)"
                imgAttack.setImageResource(R.drawable.mogaros)
                txtGrowth.text = "모가로스 추천\n전반적으로 A+이상 추천"
                txtPersonal.text = "용감한"
                txtTrain.text = "올공격"
                txtSkill.text = "패시브"
                txtResearch.text = "효율 : 체력, 체력%, 공격, 공격%, 방어, 방어%, 순발, 순발%"
                txtCharm.text = "추천 : 공격, 순발, 체력\n공격 보조옵 사용"
                txtTotem.text = "토템 없음"
            }
            "샌디쟈드" -> {
                txtAttack.text = "샌디쟈드(1티어)"
                imgAttack.setImageResource(R.drawable.sandizard)
                txtGrowth.text = "캄쟈드,플로쟈드,루쟈드추천\n공S+, 순발A, 체력A이상"
                txtPersonal.text = "용감한, 불같은(추천)"
                txtTrain.text = "올공격\n 공격3~4 : 순발1"
                txtSkill.text = "궁극기9렙,패시브,액티브"
                txtResearch.text = "체력, 공격, 공격%, 순발, 순발%, 명중, 치명타확률, 치명타효과, 회피, 상태이상무시"
                txtCharm.text = "추천 : 공격(명or치), 순발(상무), 방어(회피)\n공격, 회피, 치명 보조옵사용"
                txtTotem.text = "회피(공격), 공격토템"
            }
            "크로톤" -> {
                txtAttack.text = "크로톤(2티어)"
                imgAttack.setImageResource(R.drawable.kroton)
                txtGrowth.text = "투르톤, 콰드루스, 볼카노스 추천\n공S이상 전반적A"
                txtPersonal.text = "용감한, 속이검은"
                txtTrain.text = "올공격"
                txtSkill.text = "궁극기, 패시브, 액티브"
                txtResearch.text = "효율 : 체력, 체력%, 공격, 공격%, 명중, 치명타확률, 치명타효과, 회피, 상태이상, 상태이상무시\n" +
                        "순발형 : 공격, 공격%, 순발, 순발%, 명중, 치명타확률, 치명타효과, 회피, 상태이상, 회피,"
                txtCharm.text = "추천 : 공격(명or치), 순발(상이), 방어(회피)\n공격, 회피, 치명 보조옵사용"
                txtTotem.text = "공격(명or치)"
            }
            "카키" -> {
                txtAttack.text = "카키(2티어)"
                imgAttack.setImageResource(R.drawable.kaki)
                txtGrowth.text ="카키 추천\n공A+,순발A+ 추천"
                txtPersonal.text = "용감한, 속이검은, 날렵한"
                txtTrain.text = "공격형 : 공격3:순발1\n 순발형 : 공격1 : 순발3\n하이브리드 : 공격1 : 순발1"
                txtSkill.text = "궁극기, 패시브, 액티브"
                txtResearch.text = "추천 : 체력, 공격, 공격%, 순발, 순발%, 명중, 치명타확률, 치명타효과, 회피, 상태이상"
                txtCharm.text = "추천 : 공격(명or치), 순발(상이), 방어(회피)\n공격, 회피, 치명 보조옵사용"
                txtTotem.text = "공격(명or치), 회피(공격)"
            }
            "기가로스" -> {
                txtAttack.text = "기가로스(2티어)"
                imgAttack.setImageResource(R.drawable.gigaros)
                txtGrowth.text ="공격->체력->순발"
                txtPersonal.text = "용감한, 불같은"
                txtTrain.text = "공격"
                txtSkill.text = "궁극기-패시브-액티브"
                txtResearch.text = "체력-공격-공격%-순발-치명타확률-치명타효과-상태이상-명중or치명타무시"
                txtCharm.text = "필수 : 공격(치명타), 체력(치명타무시)\n서브 : 방어(회피), 순발(상태이상)"
                txtTotem.text = "공격(치명타),치명타(공격)"
            }
            "휴보" -> {
                txtAttack.text = "휴보(4티어)"
                imgAttack.setImageResource(R.drawable.hubo)
                txtGrowth.text ="공격->순발->체력"
                txtPersonal.text = "용감한, 속이 검은"
                txtTrain.text = "공격"
                txtSkill.text = "궁극기-패시브-액티브"
                txtResearch.text = "체력-체력%-공격-공격%-순발-순발%-상태이상-회피or치치"
                txtCharm.text = "필수 : 공격(치명타), 순발(상태이상)\n서브 : 방어(회피), 체력(치명타무시)"
                txtTotem.text = "공격(치명타),치명타(공격)"
            }
            "티라고스" -> {
                txtAttack.text = "티라고스(1티어)"
                imgAttack.setImageResource(R.drawable.tiragos)
                txtGrowth.text ="탱용 : 체공 or 체방\n공격용 : 체공순"
                txtPersonal.text = "여유로운(탱) or 용감한(공) or 불같은(공)"
                txtTrain.text = "탱용 : 체력 5 : 공격 5\n공격용 : 올 공격"
                txtSkill.text = "패시브,궁극기,액티브 다중요"
                txtResearch.text = "탱용 : 체력-체력%-공격-공격%-치확-치효-명중-반격(취향) or 방어-회피\n공격용 : 체력-체력%-공격-공격%-치확-치효-명중-회피"
                txtCharm.text = "필수 : 공격(치명타or명중), 순발(상태이상)\n서브 : 방어(회피), 체력(치명타무시)"
                txtTotem.text = "공격,체력토템"
            }
        }
    }
}