package com.cookandroid.stoneagedc.PetSet

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.cookandroid.stoneagedc.R
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds
import kotlinx.android.synthetic.main.attack_pet.*

class ControlPet : AppCompatActivity() {
    private var mAdView: AdView? = null
    private lateinit var name: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.control_pet)

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
        if(name == "핑코") {
            txtAttack.text = "핑코(1티어)"
            imgAttack.setImageResource(R.drawable.fingko)
            txtGrowth.text = "백여우, 블루문 추천\n순발->체력->방어 A+이상"
            txtPersonal.text = "속이검은"
            txtTrain.text = "1. 올 순발 \n2. 체력1 : 순발3~4"
            txtSkill.text = "궁극기 -> 패시브"
            txtResearch.text = "효율 : 체력, 체력%, 순발, 순발%, 회피, 상태이상\n 풀: 체력, 체력%, 순발, 순발%, 회피, 상태이상, 상태이상무시, 치명타무시, 방어"
            txtCharm.text = "추천 : 체력(치무), 방어(회피), 순발(상태이상)"
            txtTotem.text = "순발(상태이상)"
        } else if(name == "라고고") {
            txtAttack.text = "라고고(1티어)"
            imgAttack.setImageResource(R.drawable.ragogo)
            txtGrowth.text = "라비루, 토루루 추천\n순발->체력 A+이상\n5성기준 순발 8.5~10"
            txtPersonal.text = "날렵한"
            txtTrain.text = "1. 올 순발 \n2. 체력1 : 순발4"
            txtSkill.text = "궁극기(최소4렙 or 7렙) -> 패시브"
            txtResearch.text = "효율 : 체력, 체력%, 순발, 순발%, 회피, 상태이상무시\n 풀: 체력, 체력%, 순발, 순발%, 회피, 치료효과, 상태이상무시, 치명타무시, 방어, 방어%"
            txtCharm.text = "추천 : 공격(명), 순발(상무)\n서브: 방어(회피)"
            txtTotem.text = "저항(순발), 순발토템"
        } else if(name == "아고아(탑승)") {
            txtAttack.text = "아고아(탑승)"
            imgAttack.setImageResource(R.drawable.agoa)
            txtGrowth.text = "호크곤  추천\n고른 스텟 추천"
            txtPersonal.text = "용감한"
            txtTrain.text = "올 공격"
            txtSkill.text = "패시브"
            txtResearch.text = "효율 : 체력, 체력%, 공격, 공격%, 방어, 방어%, 순발, 순발%"
            txtCharm.text = "추천 : 공격, 순발, 체력\n보조옵 공격%"
            txtTotem.text = "토템없음"
        } else if(name == "오투투") {
            txtAttack.text = "오투투(1.5티어)"
            imgAttack.setImageResource(R.drawable.otutu)
            txtGrowth.text = "파아란, 노아란 추천\n공격, 순발 위주 기준:A+"
            txtPersonal.text = "용감한"
            txtTrain.text = "1. 올 공격 \n2. 공격3~4 : 순발1"
            txtSkill.text = "궁극기, 액티브, 패시브"
            txtResearch.text = "효율 : 체력, 공격, 공격%, 치명타확률, 치명타효과, 명중\n 풀: 체력, 공격, 공격%, 순발, 순발%, 명중, 치명타확률, 치명타효과, 회피, 상태이상무시"
            txtCharm.text = "추천 : 공격(치or명), 순발(상무)\n서브: 방어(회피)"
            txtTotem.text = "공격(명or치)"
        } else if(name == "백설토끼") {
            txtAttack.text = "백설토끼(1.5티어)"
            imgAttack.setImageResource(R.drawable.bakseulrabbit)
            txtGrowth.text = "빙하토끼, 백설토끼 추천\n체력, 순발 위주 기준:A+"
            txtPersonal.text = "날렵한"
            txtTrain.text = "순발"
            txtSkill.text = "패시브-액티브-궁극기"
            txtResearch.text = "체력-체력%-순발-순발%-명중-치료효과-상태이상무시-회피-방어-방어%"
            txtCharm.text = "추천 : 체력(치효or치무),순발(상무)\n서브: 방어(회피)"
            txtTotem.text = "순발, 저항토템"
        } else if(name == "핑키") {
            txtAttack.text = "핑키(2티어)"
            imgAttack.setImageResource(R.drawable.fingki)
            txtGrowth.text = "블루스타 추천\n체력,방어 위주 기준:S"
            txtPersonal.text = "CC용 : 속이검은\n체력 : 여유로운or믿을만한"
            txtTrain.text = "체력이나방어"
            txtSkill.text = "패시브->궁극기,액티브"
            txtResearch.text = "체력-체력%-치료효과-상태이상-상태이상무시-회피-방어or순발(취향)"
            txtCharm.text = "추천 : 체력(치효), 순발(상이)\n서브: 방어(회피)"
            txtTotem.text = "체력, 상태이상 토템"
        } else if(name == "아고아") {
            txtAttack.text = "아고아(2티어)"
            imgAttack.setImageResource(R.drawable.agoa)
            txtGrowth.text = "호크곤 추천\n공격, 순발 위주 기준:A+"
            txtPersonal.text = "용감한"
            txtTrain.text = "1. 올 공격 \n2. 공격3~4 : 순발1"
            txtSkill.text = "궁극기, 액티브, 패시브"
            txtResearch.text = "효율 : 공격, 공격%, 치명타확률, 치명타효과, 명중\n 풀: 체력, 공격, 공격%, 순발, 순발%, 명중, 치명타확률, 치명타효과, 회피,상태이상무시"
            txtCharm.text = "추천 : 공격(명or치), 순발(상무)\n서브: 방어(회피)"
            txtTotem.text = "순발(공격), 공격(명or치)"
        } else if(name == "무이") {
            txtAttack.text = "무이(2티어)"
            imgAttack.setImageResource(R.drawable.mui)
            txtGrowth.text = "무이 추천\n공격, 순발 위주 기준:A+"
            txtPersonal.text = "용감한, 속이검은"
            txtTrain.text = "1. 올 공격 \n2. 공격3~4 : 순발1"
            txtSkill.text = "궁극기 -> 액티브, 패시브"
            txtResearch.text = "효율 : 공격, 공격%, 치명타확률, 치명타효과, 명중\n 풀: 체력, 공격, 공격%, 순발, 순발%, 명중, 치명타확률, 치명타효과, 회피,상태이상무시"
            txtCharm.text = "추천 : 공격(명), 순발(상이)\n서브: 방어(회피)"
            txtTotem.text = "공격(명or치), 순발(상이)"
        } else if(name == "카미르") {
            txtAttack.text = "카미르(2티어)"
            imgAttack.setImageResource(R.drawable.kamare)
            txtGrowth.text = "체력->방어"
            txtPersonal.text = "여유로운, 우울한"
            txtTrain.text = "체력"
            txtSkill.text = "궁극기 -> 액티브, 패시브"
            txtResearch.text = "체력, 체력%, 방어, 방어%, 명중, 반사, 반사효과,상태이상무시,회피, 치명타무시"
            txtCharm.text = "추천 : 공격(명), 순발(상무)\n서브: 방어(회피)"
            txtTotem.text = "체력토템"
        } else if(name == "펜타스") {
            txtAttack.text = "펜타스(4티어)"
            imgAttack.setImageResource(R.drawable.fentas)
            txtGrowth.text = "체력, 순발 위주 기준:A+"
            txtPersonal.text = "인자한, 여유로운"
            txtTrain.text = "체력"
            txtSkill.text = "궁극기 -> 액티브, 패시브"
            txtResearch.text = "체력, 체력%, 순발, 순발%, 치료효과, 상태이상무시, 회피"
            txtCharm.text = "추천 : 체력(치료), 순발(상무)\n서브: 방어(회피)"
            txtTotem.text = "치료효과, 체력"
        } else if(name == "파이어노스돈") {
            txtAttack.text = "파이어노스돈(1티어)"
            imgAttack.setImageResource(R.drawable.firenosdon)
            txtGrowth.text = "순발"
            txtPersonal.text = "날렵한"
            txtTrain.text = "올 순발"
            txtSkill.text = "액티브 -> 궁극기, 패시브"
            txtResearch.text = "체력-체력%-순발-순발%-치료효과-상태이상무시-회피"
            txtCharm.text = "추천 : 체력(치효), 순발(상무)\n서브: 방어(회피)"
            txtTotem.text = "순발토템"
        } else if(name == "바로로크스") {
            txtAttack.text = "바로로크스(4티어)"
            imgAttack.setImageResource(R.drawable.baroroks)
            txtGrowth.text = "공격->순발->체력"
            txtPersonal.text = "용감한, 속이검은"
            txtTrain.text = "1. 올 공격 \n2. 공격3~4 : 순발1"
            txtSkill.text = "궁극기 -> 액티브, 패시브"
            txtResearch.text = "체력-공격-공격%-순발-순발%-상태이상-명중-회피-치명타확률-치명타효과"
            txtCharm.text = "추천 : 공격(명), 순발(상이)\n서브: 방어(회피)"
            txtTotem.text = "순발(공격), 공격(명or치)"
        }
    }
}