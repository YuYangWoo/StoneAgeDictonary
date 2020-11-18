package com.cookandroid.stoneagedc.kindOfPet

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.cookandroid.stoneagedc.PetSet.*
import com.cookandroid.stoneagedc.R

 class PetAdapter(var petList: ArrayList<PetItem>) : RecyclerView.Adapter<PetAdapter.CustomViewHolder>() {
    // 데이터
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PetAdapter.CustomViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.pet_listview, parent, false)
        return CustomViewHolder(view)
    }
    // 데이터 대입
    override fun onBindViewHolder(holder: PetAdapter.CustomViewHolder, position: Int) {
        Glide.with(holder.itemView)
                .load(petList[position].image)
                .into(holder.image)
        holder.petName.text = petList[position].petName
        holder.tier.text = petList[position].tier
        holder.position.text = petList[position].position
    }
    // 데이터 개수
    override fun getItemCount(): Int {
        return petList.size
    }

    // ViewHolder를 만들어 list_champion.xml의 아이템들을 정의한다.
    inner class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
       var image = itemView.findViewById<ImageView>(R.id.imgPet)
       var petName = itemView.findViewById<TextView>(R.id.petName)
       var tier = itemView.findViewById<TextView>(R.id.tier)
       var position = itemView.findViewById<TextView>(R.id.position)

        init {
            itemView.setOnClickListener {
                var pos = adapterPosition
                if (pos != RecyclerView.NO_POSITION) {
                    var item = petList[pos]
                    when(item.position){
                        "공격" ->{
                            var intent = Intent(itemView.context, AttackPet::class.java)
                            intent.putExtra("Name", item.petName)
                            ContextCompat.startActivity(itemView.context, intent, null)
                        }
                        "방어" ->{
                            var intent = Intent(itemView.context, DefensivePet::class.java)
                            intent.putExtra("Name", item.petName)
                            ContextCompat.startActivity(itemView.context, intent, null)
                        }
                        "광역" ->{
                            var intent = Intent(itemView.context, WidePet::class.java)
                            intent.putExtra("Name", item.petName)
                            ContextCompat.startActivity(itemView.context, intent, null)
                        }
                        "치료" ->{
                            var intent = Intent(itemView.context, CurePet::class.java)
                            intent.putExtra("Name", item.petName)
                            ContextCompat.startActivity(itemView.context, intent, null)
                        }
                       "제어" ->{
                            var intent = Intent(itemView.context, ControlPet::class.java)
                            intent.putExtra("Name", item.petName)
                            ContextCompat.startActivity(itemView.context, intent, null)
                        }
                    }
                }
            }
        }
    }
}