package com.cookandroid.stoneagedc.kindOfPet

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ListView
import androidx.fragment.app.Fragment
import com.cookandroid.stoneagedc.R
import com.cookandroid.stoneagedc.PetSet.CurePet
import java.util.*

class Cure : Fragment() {
    var petDataList: ArrayList<ListItem>? = null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_wide, container, false)
        initialize()
        val listView = view.findViewById<ListView>(R.id.listView4)
        val listAdapter = ListAdapter(activity, petDataList)
        listView.adapter = listAdapter

        // 리스트뷰 선택시 펫 액티비티로 넘어감.
        listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->

            when {
                petDataList!![position].petName === "도라비스" -> {
                    val intent = Intent(activity, CurePet::class.java)
                    intent.putExtra("Name","도라비스")
                    startActivity(intent)
                }
                petDataList!![position].petName === "카쿠" -> {
                    val intent = Intent(activity, CurePet::class.java)
                    intent.putExtra("Name","도라비스")
                    startActivity(intent)
                }
                petDataList!![position].petName === "모나시프" -> {
                    val intent = Intent(activity, CurePet::class.java)
                    intent.putExtra("Name","도라비스")
                    startActivity(intent)
                }
                petDataList!![position].petName === "골드로비" -> {
                    val intent = Intent(activity, CurePet::class.java)
                    intent.putExtra("Name","도라비스")
                    startActivity(intent)
                }
            }
        }
        return view
    }

    private fun initialize() {
        petDataList = ArrayList()
        petDataList!!.add(ListItem(R.drawable.dorabis, "도라비스", "1티어"))
        petDataList!!.add(ListItem(R.drawable.golfwolf, "골드로비", "1티어"))
        petDataList!!.add(ListItem(R.drawable.monasif, "모나시프", "2티어"))
        petDataList!!.add(ListItem(R.drawable.kaku, "카쿠", "3티어"))
    }
}