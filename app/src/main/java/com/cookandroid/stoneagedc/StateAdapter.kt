package com.cookandroid.stoneagedc

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.cookandroid.stoneagedc.databinding.HolderStateItemBinding

class StateAdapter(var context: Context) : RecyclerView.Adapter<StateAdapter.Holder>() {
    var item:ArrayList<StateActivity.StateItem> = arrayListOf(
            StateActivity.StateItem("도발", "대상에게 강제 공격"),
            StateActivity.StateItem("유혹", "시전자 공격불가, 공격30% 감소"),
            StateActivity.StateItem("침묵", "스킬 사용 불가"),
            StateActivity.StateItem("혼란", "적, 아군포함 1마리 기본 공격"),
            StateActivity.StateItem("빙결", "행동불가\n공격을 받으면 빙결 상태를 해제하고 150% 추가 피해"),
            StateActivity.StateItem("중독", "턴 종료시 240 피해\n방어력15% 감소"),
            StateActivity.StateItem("상처", "턴 종료시 대상의 최대 체력15% 피해"),
            StateActivity.StateItem("석화", "행동불가\n피해량 25% 감소"),
            StateActivity.StateItem("수면", "행동불가\n수면 상태에서 피해를 입으면 <수면>에서 깨어나고 3턴간 명중 15%감소")
    )
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StateAdapter.Holder {
    val binding = HolderStateItemBinding.inflate(LayoutInflater.from(context), parent, false)
        return Holder(binding)
    }

    override fun onBindViewHolder(holder: StateAdapter.Holder, position: Int) {
   holder.onBind(item[position])
    }

    override fun getItemCount(): Int {
        return item.size
    }
    class Holder(private val binding:HolderStateItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(data : StateActivity.StateItem) {
            binding.list = data
        }
    }
}