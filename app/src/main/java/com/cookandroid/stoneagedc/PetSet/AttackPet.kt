package com.cookandroid.stoneagedc.PetSet

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.cookandroid.stoneagedc.R
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import kotlinx.android.synthetic.main.attack_pet.*

class AttackPet : AppCompatActivity() {
    private var mAdView: AdView? = null
    private lateinit var name: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.attack_pet)

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
           "얀기로" -> {
               txtAttack.text = "얀기로(1.5티어)"
               imgAttack.setImageResource(R.drawable.angiro)
               txtGrowth.text = "얀기로  추천\n공격, 순발 위주 기준:A+"
               txtPersonal.text = "용감한"
               txtTrain.text = "1. 올 공격 \n2. 공격4 : 순발1"
               txtSkill.text = "궁극기 -> 액티브, 패시브"
               txtResearch.text = "효율 : 공격, 공격%, 치명타확률, 치명타효과, 명중\n 풀: 체력, 공격, 공격%, 순발, 순발%, 명중, 치명타확률, 치명타효과, 회피,상태이상무시"
               txtCharm.text = "추천 : 공격(명), 순발(상무)\n서브: 방어(회피)"
               txtTotem.text = "순발(공격), 공격(명중)"
           }
           "문울프" -> {
               txtAttack.text = "문울프(1.5티어)"
               imgAttack.setImageResource(R.drawable.moonwolf)
               txtGrowth.text = "비울프, 문울프 추천\n공격, 순발 위주 기준:A+"
               txtPersonal.text = "딜용 : 용감한\nCC용 : 속이검은"
               txtTrain.text = "1. 올 공격 \n2. 공격3~4 : 순발1"
               txtSkill.text = "딜용 : 궁극기위주\nCC용 : 액티브위주"
               txtResearch.text = "효율 : 공격, 공격%, 명중, 상태이상\n풀 :체력, 공격, 공격%, 순발, 순발%, 명중, 치명타확률, 치명타효과, 상태이상, 회피or상태이상무시"
               txtCharm.text = "추천 : 공격(명), 순발(상이)\n서브: 방어(회피), 체력(치명타무시)"
               txtTotem.text = "딜용 : 공격(명),순발(공격) "
           }
           "기로" -> {
               txtAttack.text = "기로(1.5티어)"
               imgAttack.setImageResource(R.drawable.giro)
               txtGrowth.text = "테이노스, 기노, 기로, 비노 추천\n공격S이상 체방순 B이상"
               txtPersonal.text = "딜용 : 용감한"
               txtTrain.text = "1. 올 공격 \n2. 공격3~4 : 순발1"
               txtSkill.text = "궁극기덱 : 궁극기위주\n액티브덱 : 액티브위주"
               txtResearch.text = "효율 : 공격, 공격%, 치명타확률, 치명타효과,명중 \n풀 :체력, 공격, 공격%, 순발, 순발%, 명중, 치명타확률, 치명타효과, 회피, 상태이상무시"
               txtCharm.text = "추천 : 공격(명 or 치), 순발(상이)\n서브: 방어(회피or반격), 체력(치명타무시)"
               txtTotem.text = "딜용 : 공격(명 or 치),순발(공격) "
           }
           "크랩" -> {
               txtAttack.text = "크랩(1.5티어)"
               imgAttack.setImageResource(R.drawable.crab)
               txtGrowth.text = "킹크랩, 크랩 추천\n공격S이상 체방순 B이상"
               txtPersonal.text = "딜용 : 용감한, 붙같은\n다단히트라 불같은 추천"
               txtTrain.text = "올 공격 \n"
               txtSkill.text = "궁극기->액티브,패시브\n궁극기 7레벨 필수"
               txtResearch.text = "효율 : 공격, 공격%, 치명타확률, 치명타효과, 명중 \n풀 :체력, 공격, 공격%, 순발, 순발%, 명중, 치명타확률, 치명타효과, 회피, 상태이상무시\n풀 :체력, 체력%, 공격, 공격%, 순발, 명중, 치명타확률, 치명타효과, 회피, 상태이상무시"
               txtCharm.text = "추천 : 공격(치), 순발(상무)\n서브: 방어(회피), 체력(치명타무시)"
               txtTotem.text = "딜용 : 공격(치),치명(치명효과) "
           }
           "큐이" -> {
               txtAttack.text = "큐이(2티어)"
               imgAttack.setImageResource(R.drawable.cue)
               txtGrowth.text = "킹큐이,엔젤큐이 추천\n체력,공격 A+이상"
               txtPersonal.text = "용감한"
               txtTrain.text = "올 공격 \n"
               txtSkill.text = "궁극기,액티브,패시브\n고르게 투자"
               txtResearch.text = "효율 : 체력, 체력%, 공격, 공격%, 치료효과 \n풀 :체력, 체력%, 공격, 공격%, 명중, 치명타확률, 치명타효과, 치료효과, 회피, 상태이상무시"
               txtCharm.text = "추천 : 공격(치 or 명), 체력(치효)\n서브: 방어(회피)"
               txtTotem.text = "딜용 : 공격(치 or 명) "
           }
           "트라로포" -> {
               txtAttack.text = "트라로포(2티어)"
               imgAttack.setImageResource(R.drawable.trarofo)
               txtGrowth.text = "케루로포, 베루로포 추천\n공격S, 체력,순발A이상"
               txtPersonal.text = "용감한"
               txtTrain.text = "올 공격 \n"
               txtSkill.text = "궁극기->액티브,패시브\n고르게 투자"
               txtResearch.text = "효율 : 체력, 체력%, 공격, 공격%,치명타확률, 치명타효과, 명중 \n풀 :체력, 체력%, 공격, 공격%, 순발, 명중, 치명타확률, 치명타효과, 회피, 상태이상무시"
               txtCharm.text = "추천 : 공격(치 or 명), 체력(치효)\n서브: 방어(회피),순발(상무)"
               txtTotem.text = "딜용 : 공격(치 or 명) "
           }
           "베르가" -> {
               txtAttack.text = "베르가(2티어)"
               imgAttack.setImageResource(R.drawable.berga)
               txtGrowth.text = "고르,베라라,도르,설표 추천\n공격S, 체력,순발A이상"
               txtPersonal.text = "수면용 : 속이검은\n딜용 : 용감한"
               txtTrain.text = "수면용 : 올 순발\n딜용 : 올 공격 \n덱에 따라 차이가 있습니다.\n수면을 깨우지 않게끔 조정해야 합니다."
               txtSkill.text = "수면용: 액티브 우선\n딜용 : 궁극기 우선"
               txtResearch.text = "딜용 : 체력, 체력%, 공격, 공격%, 순발, 명중, 치명타확률, 치명타효과, 회피, 상태이상무시 \n수면용 : 체력, 순발, 순발%, 공격, 공격%, 명중, 상태이상, 회피~\n베르가는 덱에 상황에 맞게 조절해서 사용하므로 정답이 없습니다."
               txtCharm.text = "추천 : 공격(치 or 명), 순발(상이)\n 방어(회피),순발(상무)\n부적도 용도에 맞게 사용합니다."
               txtTotem.text = "딜용 : 공격(치 or 명)\n수면용 : 순발(상태이상) "
           }
           "피노" -> {
               txtAttack.text = "피노(2티어)"
               imgAttack.setImageResource(R.drawable.fino)
               txtGrowth.text = "가론, 포른 추천\n공격A+ 순발A이상"
               txtPersonal.text = "딜용 : 용감한"
               txtTrain.text = "1.올 공격\n2.공격3~4:순발1 "
               txtSkill.text = "딜용 : 궁극기 우선"
               txtResearch.text = "딜용 : 체력, 공격, 공격%, 순발, 순발%, 명중, 치명타확률, 치명타효과, 회피, 상태이상무시 "
               txtCharm.text = "추천 : 공격(치 or 명), 순발(상무)\n 방어(회피),체력(치명타무시)"
               txtTotem.text = "딜용 : 공격(치 or 명) "
           }
           "쟈그" -> {
               txtAttack.text = "쟈그(2티어)"
               imgAttack.setImageResource(R.drawable.jag)
               txtGrowth.text = "공격A+ 순발A이상"
               txtPersonal.text = "딜용 : 용감한"
               txtTrain.text = "1.올 공격"
               txtSkill.text = "궁극기->패시브, 액티브"
               txtResearch.text = "딜용 : 체력, 공격, 공격%, 순발 명중, 치명타확률, 치명타효과, 회피, 상태이상무시or상태이상 "
               txtCharm.text = "추천 : 공격(치 or 명), 순발(상무)\n 방어(회피),체력(치명타무시)"
               txtTotem.text = "딜용 : 공격(치 or 명) "
           }
           "꼬미" -> {
               txtAttack.text = "꼬미(2티어)"
               imgAttack.setImageResource(R.drawable.ggomi)
               txtGrowth.text = "킹꼬미 추천\n공격A+ 순발A이상"
               txtPersonal.text = "딜용 : 용감한or불같은"
               txtTrain.text = "올 공격"
               txtSkill.text = "딜용 : 궁극기 우선"
               txtResearch.text = "딜용 : 체력, 공격, 공격%, 순발, 순발%, 명중, 치명타확률, 치명타효과, 회피, 상태이상무시 "
               txtCharm.text = "추천 : 공격(치 or 명), 순발(상무)\n 방어(회피)"
               txtTotem.text = "딜용 : 공격(치 or 명) "
           }
           "쿠쿠르" -> {
               txtAttack.text = "쿠쿠르(3티어)"
               imgAttack.setImageResource(R.drawable.cucuro)
               txtGrowth.text = "화이트링, 하트링\n공격A+ 순발A이상"
               txtPersonal.text = "딜용 : 용감한"
               txtTrain.text = "1.올 공격"
               txtSkill.text = "딜용 : 액티브 우선"
               txtResearch.text = "딜용 : 체력, 공격, 공격%, 순발, 순발%, 명중, 치명타확률, 치명타효과, 회피, 상태이상무시 "
               txtCharm.text = "추천 : 공격(치 or 명), 순발(상무)\n 방어(회피),체력(치명타무시)"
               txtTotem.text = "딜용 : 공격(치 or 명) "
           }
           "베이보" -> {
               txtAttack.text = "베이보(3티어)"
               imgAttack.setImageResource(R.drawable.baebo)
               txtGrowth.text = "가론, 포른 추천\n공격,순발->체력"
               txtPersonal.text = "용감한 or 무자비한"
               txtTrain.text = "공격4 : 순발1 "
               txtSkill.text = "액티브-궁극기-패시브"
               txtResearch.text = "체력-체력%-방어-방어%-공격-공격%-반격-반격효과-치명타확률,치명타효과,치명타무시 "
               txtCharm.text = "필수 : 공격(치명타), 방어(반격)         서브 :체력(치명무시)"
               txtTotem.text = "딜용 : 공격(치 or 명), 반격 "
           }
           "팔케온" -> {
               txtAttack.text = "팔케온(3티어)"
               imgAttack.setImageResource(R.drawable.falteon)
               txtGrowth.text = "공격A+ 순발A이상"
               txtPersonal.text = "딜용 : 속이검은"
               txtTrain.text = "올 순발 "
               txtSkill.text = "패시브, 액티브"
               txtResearch.text = "딜용 : 체력, 공격, 공격%, 순발, 순발%, 명중, 치명타확률, 치명타효과, 회피, 상태이상 "
               txtCharm.text = "추천 : 공격(치 or 명), 순발(상이)\n 방어(회피)"
               txtTotem.text = "순발(상태이상) "
           }
           "고르돈" -> {
               txtAttack.text = "고르돈(3티어)"
               imgAttack.setImageResource(R.drawable.gordon)
               txtGrowth.text = "공격->체력,순발"
               txtPersonal.text = "딜용 : 용감한"
               txtTrain.text = "1.올 공격"
               txtSkill.text = "딜용 : 궁극기 우선"
               txtResearch.text = "딜용 : 체력, 공격, 공격%, 순발, 순발%, 명중, 치명타확률, 치명타효과, 회피, 상태이상무시 "
               txtCharm.text = "추천 : 공격(치 or 명), 순발(상무)\n 방어(회피),체력(치명타무시)"
               txtTotem.text = "딜용 : 공격(치 or 명) "
           }
           "구루마루" -> {
               txtAttack.text = "구루마루(4티어)"
               imgAttack.setImageResource(R.drawable.gurumaru)
               txtGrowth.text = "공격A+ 순발A이상"
               txtPersonal.text = "딜용 : 용감한"
               txtTrain.text = "1.올 공격\n2.공격3~4:순발1 "
               txtSkill.text = "딜용 : 궁극기 우선"
               txtResearch.text = "딜용 : 체력, 공격, 공격%, 순발, 순발%, 명중, 치명타확률, 치명타효과, 회피, 상태이상무시 "
               txtCharm.text = "추천 : 공격(치 or 명), 순발(상무)\n 방어(회피),체력(치명타무시)"
               txtTotem.text = "딜용 : 공격(치 or 명) "
           }
           "모가" -> {
               txtAttack.text = "모가(4티어)"
               imgAttack.setImageResource(R.drawable.moga)
               txtGrowth.text = "공격A+ 순발A이상"
               txtPersonal.text = "딜용 : 용감한"
               txtTrain.text = "1.올 공격 "
               txtSkill.text = "궁극기, 패시브"
               txtResearch.text = "딜용 : 체력, 공격, 공격%, 순발, 순발%, 명중, 치명타확률, 치명타효과, 회피, 상태이상무시 "
               txtCharm.text = "추천 : 공격(치 or 명), 순발(상무)\n 방어(회피),체력(치명타무시)"
               txtTotem.text = "딜용 : 공격(치 or 명) "
           }
           "베르푸스" -> {
               txtAttack.text = "베르푸스(2티어) 기계침입용"
               imgAttack.setImageResource(R.drawable.berfuce)
               txtGrowth.text = "공격A+ 순발A이상"
               txtPersonal.text = "딜용 : 용감한"
               txtTrain.text = "1.올 공격"
               txtSkill.text = "딜용 : 궁극기 우선"
               txtResearch.text = "딜용 : 체력, 공격, 공격%, 순발, 순발%, 명중, 치명타확률, 치명타효과, 회피, 상태이상무시 "
               txtCharm.text = "추천 : 공격(치 or 명), 순발(상무)\n 방어(회피),체력(치명타무시)"
               txtTotem.text = "딜용 : 공격(치 or 명) "
           }
           "고테쿠스" -> {
               txtAttack.text = "고테쿠스(4티어)"
               imgAttack.setImageResource(R.drawable.ftecus)
               txtGrowth.text = "공격A+ 순발A이상"
               txtPersonal.text = "딜용 : 용감한"
               txtTrain.text = "1.올 공격 "
               txtSkill.text = "딜용 : 궁극기 우선"
               txtResearch.text = "딜용 : 체력, 공격, 공격%, 순발, 순발%, 명중, 치명타확률, 치명타효과, 회피, 상태이상무시 "
               txtCharm.text = "추천 : 공격(치 or 명), 순발(상무)\n 방어(회피),체력(치명타무시)"
               txtTotem.text = "딜용 : 공격(치 or 명) "
           }
           "베론" -> {
               txtAttack.text = "베론(4티어)"
               imgAttack.setImageResource(R.drawable.beron)
               txtGrowth.text = "공격A+ 순발A이상"
               txtPersonal.text = "딜용 : 용감한"
               txtTrain.text = "1.올 공격 "
               txtSkill.text = "딜용 : 궁극기 우선"
               txtResearch.text = "딜용 : 체력, 공격, 공격%, 순발, 순발%, 명중, 치명타확률, 치명타효과, 회피, 상태이상무시 "
               txtCharm.text = "추천 : 공격(치 or 명), 순발(상무)\n 방어(회피),체력(치명타무시)"
               txtTotem.text = "딜용 : 공격(치 or 명) "
           }
       }
    }

}