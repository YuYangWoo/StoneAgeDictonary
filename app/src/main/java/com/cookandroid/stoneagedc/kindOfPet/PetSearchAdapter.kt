package com.cookandroid.stoneagedc.kindOfPet

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.cookandroid.stoneagedc.R
import java.util.*

class PetSearchAdapter(context: Context, items: ArrayList<PetItem>) : RecyclerView.Adapter<PetSearchAdapter.CustomViewHolder>(){
 private var mCtx : Context = context
    private var items: ArrayList<PetItem> = items
    private var arrayList: ArrayList<PetItem> = ArrayList<PetItem>()

    init{
        arrayList.addAll(items)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PetSearchAdapter.CustomViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.pet_listview, parent, false)
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: PetSearchAdapter.CustomViewHolder, position: Int) {
        Glide.with(holder.itemView)
                .load(items[position].image)
                .into(holder.image)
        holder.petName.text = items[position].petName
        holder.tier.text = items[position].tier
        holder.position.text = items[position].position
    }

    fun filter(charText: String) {
        var charText = charText
        charText = charText.toLowerCase(Locale.getDefault())
        items.clear()
        if (charText.isEmpty()) {
            items.addAll(arrayList)
        } else {
            for (recent in arrayList) {
                val name: String = recent.petName!!
                if (name.toLowerCase().contains(charText)) {
                    items.add(recent)
                }
            }
        }
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
   return items.size
    }

    inner class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var image = itemView.findViewById<ImageView>(R.id.imgPet)
        var petName = itemView.findViewById<TextView>(R.id.petName)
        var tier = itemView.findViewById<TextView>(R.id.tier)
        var position = itemView.findViewById<TextView>(R.id.position)
    }
//         fun updateList(newList: ArrayList<PetItem>) {
////         for(a in newList) {
////             Log.d("test", a.petName)
////         }
////         petList.addAll(newList)
////         for(a in petList) {
////             Log.d("test", a.petName + a.image + a.position + a.tier)
////         }
//        notifyDataSetChanged()
//     }

    }