package com.cookandroid.stoneagedc.kindOfPet

import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.cookandroid.stoneagedc.PetSet.*
import com.cookandroid.stoneagedc.R

class PetAdapter constructor() : RecyclerView.Adapter<PetAdapter.CustomViewHolder>(), Filterable {
     var petList = ArrayList<PetItem>()
     var filteredPetList = ArrayList<PetItem>()

     constructor(petList: ArrayList<PetItem>) :this() {
         this.petList = petList
         this.filteredPetList = petList
     }
     // 데이터
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PetAdapter.CustomViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.pet_listview, parent, false)
        return CustomViewHolder(view)
    }
    // 데이터 대입
    override fun onBindViewHolder(holder: PetAdapter.CustomViewHolder, position: Int) {
        Glide.with(holder.itemView)
                .load(filteredPetList[position].image)
                .into(holder.image)
        Log.d("Confirm", filteredPetList[position].image.toString())
        holder.petName.text = filteredPetList[position].petName
        holder.tier.text = filteredPetList[position].tier
        holder.position.text = filteredPetList[position].position
    }
    // 데이터 개수
    override fun getItemCount(): Int {
        return filteredPetList.size
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
                    var item = filteredPetList[pos]
                    when(item.position){
                        "공격" ->{
                            var intent = Intent(itemView.context, AttackPet::class.java)
                            intent.putExtra("Name", item.petName)
                            intent.putExtra("Skill", item.skill)
                            ContextCompat.startActivity(itemView.context, intent, null)
                        }
                        "방어" ->{
                            var intent = Intent(itemView.context, DefensivePet::class.java)
                            intent.putExtra("Name", item.petName)
                            intent.putExtra("Skill", item.skill)
                            ContextCompat.startActivity(itemView.context, intent, null)
                        }
                        "광역" ->{
                            var intent = Intent(itemView.context, WidePet::class.java)
                            intent.putExtra("Name", item.petName)
                            intent.putExtra("Skill", item.skill)
                            ContextCompat.startActivity(itemView.context, intent, null)
                        }
                        "치료" ->{
                            var intent = Intent(itemView.context, CurePet::class.java)
                            intent.putExtra("Name", item.petName)
                            intent.putExtra("Skill", item.skill)
                            ContextCompat.startActivity(itemView.context, intent, null)
                        }
                       "제어" ->{
                            var intent = Intent(itemView.context, ControlPet::class.java)
                            intent.putExtra("Name", item.petName)
                           intent.putExtra("Skill", item.skill)
                            ContextCompat.startActivity(itemView.context, intent, null)
                        }
                    }
                }
            }
        }
    }

    override fun getFilter(): Filter {
        return object : Filter() {
            override fun performFiltering(constraint: CharSequence?): FilterResults {
                var key = constraint.toString()
                filteredPetList = if (key.isEmpty()) {
                    petList
                } else {
                    var lsFiltered = ArrayList<PetItem>()
                    for (row in petList) {
                        if (row.petName!!.toLowerCase().contains(key.toLowerCase())) {
                            lsFiltered.add(row)
                        }
                    }
                    lsFiltered
                }

                var filterResults = FilterResults()
                filterResults.values = filteredPetList

                return filterResults
            }

            override fun publishResults(constraint: CharSequence?, results: FilterResults?) {
                filteredPetList = results!!.values as ArrayList<PetItem>
                notifyDataSetChanged()
            }

        }
    }


}