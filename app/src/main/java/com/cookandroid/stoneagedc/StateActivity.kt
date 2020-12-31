package com.cookandroid.stoneagedc

import android.os.Bundle
import com.cookandroid.stoneagedc.databinding.ActivityStateIdealBinding

class StateActivity :BaseActivity<ActivityStateIdealBinding>(R.layout.activity_state_ideal) {
    var item:ArrayList<StateItem> = arrayListOf(
            StateItem("도발","대상에게 강제 공격"),
            StateItem("유혹","시전자 공격불가, 공격30% 감소"),
            StateItem("침묵","스킬 사용 불가"),
            StateItem("혼란","적, 아군포함 1마리 기본 공격"),
            StateItem("빙결","행동불가\n공격을 받으면 빙결 상태를 해제하고 150% 추가 피해"),
            StateItem("중독","턴 종료시 240 피해\n방어력15% 감소"),
            StateItem("상처","턴 종료시 대상의 최대 체력15% 피해"),
            StateItem("석화","행동불가\n피해량 25% 감소"),
            StateItem("수면","행동불가\n수면 상태에서 피해를 입으면 <수면>에서 깨어나고 3턴간 명중 15%감소")
            )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.state = this

    }
    data class StateItem(
            var name:String,
            var content:String,
            )
}