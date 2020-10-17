package com.cookandroid.stoneagedc.kindOfPet

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView.OnItemClickListener
import android.widget.ListView
import androidx.fragment.app.Fragment
import com.cookandroid.stoneagedc.R
import com.cookandroid.stoneagedc.PetSet.DefensivePet
import java.util.*

class Defensive : Fragment() {
    private var petDataList = ArrayList<ListItem>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_defensive, container, false)
        InitializePetData()
        val listview = view.findViewById<ListView>(R.id.listView2)
        val listAdapter = ListAdapter(activity, petDataList)
        listview.adapter = listAdapter
        //리스트뷰 선택시 펫 액티비티로 넘어감.
        listview.onItemClickListener = OnItemClickListener { parent, view, position, id ->
            if (petDataList[position].petName === "부비") {
                val intent = Intent(activity, DefensivePet::class.java)
                intent.putExtra("Name", "부비")
                startActivity(intent)
            } else if (petDataList[position].petName === "북이(딜북이)") {
                val intent = Intent(activity, DefensivePet::class.java)
                intent.putExtra("Name", "북이(딜북이)")
                startActivity(intent)
            } else if (petDataList[position].petName === "두리") {
                val intent = Intent(activity, DefensivePet::class.java)
                intent.putExtra("Name", "두리")
                startActivity(intent)
            } else if (petDataList[position].petName === "프라키토스") {
                val intent = Intent(activity, DefensivePet::class.java)
                intent.putExtra("Name", "프라키토스")
                startActivity(intent)
            } else if (petDataList[position].petName === "카타르카스") {
                val intent = Intent(activity, DefensivePet::class.java)
                intent.putExtra("Name", "카타르카스")
                startActivity(intent)
            } else if (petDataList[position].petName === "만모") {
                val intent = Intent(activity, DefensivePet::class.java)
                intent.putExtra("Name", "만모")
                startActivity(intent)
            } else if (petDataList[position].petName === "만모(탑승)") {
                val intent = Intent(activity, DefensivePet::class.java)
                intent.putExtra("Name", "만모(탑승)")
                startActivity(intent)
            } else if (petDataList[position].petName === "살링카") {
                val intent = Intent(activity, DefensivePet::class.java)
                intent.putExtra("Name", "살링카")
                startActivity(intent)
            } else if (petDataList[position].petName === "스토라지") {
                val intent = Intent(activity, DefensivePet::class.java)
                intent.putExtra("Name", "스토라지")
                startActivity(intent)
            }
        }
        return view
    }

    private fun InitializePetData() {
        petDataList = ArrayList<ListItem>()

        petDataList.add(ListItem(R.drawable.manmo, "만모", "1티어"))
        petDataList.add(ListItem(R.drawable.buke, "북이(딜북이)", "1티어"))
        petDataList.add(ListItem(R.drawable.manmo, "만모(탑승)", "1.5티어"))
        petDataList.add(ListItem(R.drawable.frakitos, "프라키토스", "1.5티어"))
        petDataList.add(ListItem(R.drawable.bubi, "부비", "2티어"))
        petDataList.add(ListItem(R.drawable.duri, "두리", "2티어"))
        petDataList.add(ListItem(R.drawable.katarkas, "카타르카스", "3티어"))
        petDataList.add(ListItem(R.drawable.stolarge, "스토라지", "3티어"))
        petDataList.add(ListItem(R.drawable.sillingka, "살링카", "4티어"))
    }

}