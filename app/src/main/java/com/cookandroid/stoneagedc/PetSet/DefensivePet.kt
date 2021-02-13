package com.cookandroid.stoneagedc.PetSet

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.cookandroid.stoneagedc.R
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import kotlinx.android.synthetic.main.attack_pet.*

class DefensivePet : AppCompatActivity() {
    private var mAdView: AdView? = null
    private lateinit var name: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.defensive_pet)

        // ActionBar Home 버튼 Enable
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        // 광고 붙이기
        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView!!.loadAd(adRequest)

        name = intent.getStringExtra("Name")
        title = name
        init(name)
        var skill = intent.getIntExtra("Skill",0)
        btnSkill.setOnClickListener {
            SkillDialog(this, skill).show()
        }
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
            "만모" -> {
                txtAttack.text = "만모(1티어)"
                imgAttack.setImageResource(R.drawable.manmo)
                txtGrowth.text = "아이스만모, 아모로스 추천\n체력 S+이상"
                txtPersonal.text = "올체형 : 불같은\nCC형 :속이검은, 날렵한(순발 만모는 망했습니다.) "
                txtTrain.text = "올체형 : 체력\nCC형 : 올순 or 체력,순발"
                txtSkill.text = "액티브,패시브 ->궁5~6렙정도"
                txtResearch.text = "효율 : 체력, 체력%, 순발, 순발%, 명중, 치명타확률, 치명타효과\n 풀: 체력, 체력%, 순발, 순발%, 치명타확률, 치명타효과, 명중, 상태이상, 치명타무시, 회피"
                txtCharm.text = "추천 : 체력(치무), 순발(상이)\n서브: 방어(회피)or공격(치)\n체만모는 보조옵이 치명위주로 가주세요"
                txtTotem.text = "순발(상이), 치명타(치명타효과)"
            }
            "북이(딜북이)" -> {
                txtAttack.text = "북이(딜북이)(1티어)"
                imgAttack.setImageResource(R.drawable.buke)
                txtGrowth.text = "킹북이 추천\n체력,공격,방어,순발 다좋아야함 A이상"
                txtPersonal.text = "용감한, 불같은 "
                txtTrain.text = "공격3~4 : 순발1"
                txtSkill.text = "액티브,패시브 ->궁5~6렙정도"
                txtResearch.text = "효율 : 체력, 공격, 공격%, 순발, 순발%, 명중, 치명타확률, 치명타효과\n 풀: 체력, 공격, 공격%, 순발, 순발%, 명중, 반격, 치명타확률, 치명타효과, 상태이상"
                txtCharm.text = "추천 : 방어(반격), 순발(상이)\n서브: 공격(명or치)"
                txtTotem.text = "순발(상이), 공격(명or치),치명타(치명타효과), 순발(공격)\n공격토템 추천"
            }
            "듀포드" -> {
                txtAttack.text = "듀포드(1티어)"
                imgAttack.setImageResource(R.drawable.duford)
                txtGrowth.text = "모리포드 추천\n 체력,순발,공격 순"
                txtPersonal.text = "우울한, 여유로운(추천)"
                txtTrain.text = "올 체력 -> 순발(2천셋팅)"
                txtSkill.text = "액티브,패시브,궁극기"
                txtResearch.text = "효율 : 체력, 체력%, 순발, 순발%, 반사, 반사효과 \n 풀: 체력, 체력%, 순발, 순발%, 반사, 반사효과, 치명타무시, 방어, 방어%, 상태이상무시"
                txtCharm.text = "추천 : 체력(치무), 순발(상무)\n서브: 방어(회피)"
                txtTotem.text = "반사,체력 추천"
            }
            "만모(탑승)" -> {
                txtAttack.text = "만모(탑승)(1.5티어)"
                imgAttack.setImageResource(R.drawable.manmo)
                txtGrowth.text = "마모페퍼, 아이스만모, 아모로스 추천\n고르게 좋아야함"
                txtPersonal.text = "딜용 : 용감한\n체력용 : 여유로운 "
                txtTrain.text = "딜용: 공격\n탱용 : 체력"
                txtSkill.text = "패시브올인"
                txtResearch.text = "효율 : 체력, 공격, 공격%, 순발, 순발%, 방어, 방어%"
                txtCharm.text = "추천 : 체력,공격,순발\n보조옵 : 공격or체력"
                txtTotem.text = "X"
            }
            "프라키토스" -> {
                txtAttack.text = "프라키토스(1.5티어)"
                imgAttack.setImageResource(R.drawable.frakitos)
                txtGrowth.text = "다이노 추천\n 체력, 방어A이상"
                txtPersonal.text = "믿을만한"
                txtTrain.text = "방어"
                txtSkill.text = "궁극기 -> 패시브,액티브"
                txtResearch.text = "효율 : 방어-방어%-체력-체력%-치명타확률-치명타효과-명중-상태이상-상태이상무시-치명타무시"
                txtCharm.text = "추천 : 공격(명or치),방어(회피),체력(치무)"
                txtTotem.text = "방어(체력)"
            }
            "부비" -> {
                txtAttack.text = "부비(2티어)"
                imgAttack.setImageResource(R.drawable.bubi)
                txtGrowth.text = "체력, 방어, 공격 A이상"
                txtPersonal.text = "무자비한,여유로운"
                txtTrain.text = "공격>체력>순발 2:1:1"
                txtSkill.text = "궁극기 -> 패시브,액티브"
                txtResearch.text = "효율 : 체력-체력%-공격-공격%-순발-반격-반격효과-상태이상-회피"
                txtCharm.text = "필수 : 공격(치명타),방어(반격)\n서브 : 순발(상태이상),체력(치명타무시)"
                txtTotem.text = "반격or공격(치명타)or체력"
            }
            "두리" -> {
                txtAttack.text = "두리(2티어)"
                imgAttack.setImageResource(R.drawable.duri)
                txtGrowth.text = "킹우리 추천\n공격A+,체력A+,방어A"
                txtPersonal.text = "무자비한,용감한"
                txtTrain.text = "공격"
                txtSkill.text = "액티브-패시브, 궁극기"
                txtResearch.text = "체력-공격-공격%-방어-방어%-치명타-반격-반격효과-상태이상무시"
                txtCharm.text = "필수 : 공격(치명타),방어(반격)\n서브 : 체력(치명무시)or순발(상무)"
                txtTotem.text = "반격or공격(치명타)or체력"
            }
            "카타르카스" -> {
                txtAttack.text = "카타르카스(3티어)"
                imgAttack.setImageResource(R.drawable.katarkas)
                txtGrowth.text = "체력->방어"
                txtPersonal.text = "우울한or무자비한"
                txtTrain.text = "방어1:체력1"
                txtSkill.text = "궁극기=액티브=패시브"
                txtResearch.text = "체력-체력%-방어-방어%-반사-반사효과-반격-반격효과-상태이상무시"
                txtCharm.text = "필수 : 방어(반격),체력(치무or치료)\n서브 : 순발(상태이상무시),공격(치명타)"
                txtTotem.text = "반격or반사or방어"
            }
            "스토라지" -> {
                txtAttack.text = "스토라지(3티어)"
                imgAttack.setImageResource(R.drawable.stolarge)
                txtGrowth.text = "자료없음"
                txtPersonal.text = "자료없음"
                txtTrain.text = "자료없음"
                txtSkill.text = "자료없음"
                txtResearch.text = "자료없음"
                txtCharm.text = "자료없음"
                txtTotem.text = "자료없음"
            }
            "살링카" -> {
                txtAttack.text = "살링카(4티어)"
                imgAttack.setImageResource(R.drawable.sillingka)
                txtGrowth.text = "체력->방어"
                txtPersonal.text = "여유로운or믿을만한"
                txtTrain.text = "체력1:방어1"
                txtSkill.text = "액티브-패시브-궁극기"
                txtResearch.text = "체력-체력%-방어-방어%-상태이상-상태이상무시"
                txtCharm.text = "필수 : 방어(회피),순발(상태 무시)\n서브 : 체력(치명무시)"
                txtTotem.text = "체력,방어"
            }
        }
    }
}