package com.cookandroid.stoneagedc.kindOfPet

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.cookandroid.stoneagedc.R

class PetSearchAdapter : RecyclerView.Adapter<PetSearchAdapter.CustomViewHolder>(){
    var petList = ArrayList<PetItem>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PetSearchAdapter.CustomViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.pet_listview, parent, false)
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: PetSearchAdapter.CustomViewHolder, position: Int) {
        Glide.with(holder.itemView)
                .load(petList[position].image)
                .into(holder.image)
        holder.petName.text = petList[position].petName
        holder.tier.text = petList[position].tier
        holder.position.text = petList[position].position
    }

    override fun getItemCount(): Int {
   return petList.size
    }
    inner class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var image = itemView.findViewById<ImageView>(R.id.imgPet)
        var petName = itemView.findViewById<TextView>(R.id.petName)
        var tier = itemView.findViewById<TextView>(R.id.tier)
        var position = itemView.findViewById<TextView>(R.id.position)
    }
         fun updateList(newList: ArrayList<PetItem>) {
//         for(a in newList) {
//             Log.d("test", a.petName)
//         }
         petList.addAll(newList)
         for(a in petList) {
             Log.d("test", a.petName + a.image + a.position + a.tier)
         }
        notifyDataSetChanged()
     }

    }