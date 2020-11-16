package com.cookandroid.stoneagedc.kindOfPet

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView.OnItemClickListener
import android.widget.ListView
import androidx.fragment.app.Fragment
import com.cookandroid.stoneagedc.PetSet.WidePet
import com.cookandroid.stoneagedc.R
import java.util.*

class Wide : Fragment() {
    var petDataList: ArrayList<ListItem>? = null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_wide, container, false)
        initializePetData()
        val listView = view.findViewById<ListView>(R.id.listView4)
        val listAdapter = ListAdapter(activity, petDataList)
        listView.adapter = listAdapter

        // 리스트뷰 선택시 펫 액티비티로 넘어감.
        listView.onItemClickListener = OnItemClickListener { parent, view, position, id ->
            when {
                petDataList!![position].petName === "기가로스" -> {
                    val intent = Intent(activity, WidePet::class.java)
                    intent.putExtra("Name", "기가로스")
                    startActivity(intent)
                }
                petDataList!![position].petName === "휴보" -> {
                    val intent = Intent(activity, WidePet::class.java)
                    intent.putExtra("Name", "휴보")
                    startActivity(intent)
                }
                petDataList!![position].petName === "카키" -> {
                    val intent = Intent(activity, WidePet::class.java)
                    intent.putExtra("Name", "카키")
                    startActivity(intent)
                }
                petDataList!![position].petName === "모가로스" -> {
                    val intent = Intent(activity, WidePet::class.java)
                    intent.putExtra("Name", "모가로스")
                    startActivity(intent)
                }
                petDataList!![position].petName === "모가로스(탑승)" -> {
                    val intent = Intent(activity, WidePet::class.java)
                    intent.putExtra("Name", "모가로스(탑승)")
                    startActivity(intent)
                }
                petDataList!![position].petName === "샌디쟈드" -> {
                    val intent = Intent(activity, WidePet::class.java)
                    intent.putExtra("Name", "샌디쟈드")
                    startActivity(intent)
                }
                petDataList!![position].petName === "크로톤" -> {
                    val intent = Intent(activity, WidePet::class.java)
                    intent.putExtra("Name", "크로톤")
                    startActivity(intent)
                }
                petDataList!![position].petName === "티라고스" -> {
                    val intent = Intent(activity, WidePet::class.java)
                    intent.putExtra("Name", "티라고스")
                    startActivity(intent)
                }
            }
        }
        return view
    }

    private fun initializePetData() {
        petDataList = ArrayList()
        petDataList!!.add(ListItem(R.drawable.mogaros, "모가로스", "1티어"))
        petDataList!!.add(ListItem(R.drawable.mogaros, "모가로스(탑승)", "1티어"))
        petDataList!!.add(ListItem(R.drawable.sandizard, "샌디쟈드", "1티어"))
        petDataList!!.add(ListItem(R.drawable.tiragos, "티라고스", "1티어"))
        petDataList!!.add(ListItem(R.drawable.kroton, "크로톤", "2티어"))
        petDataList!!.add(ListItem(R.drawable.kaki, "카키", "2티어"))
        petDataList!!.add(ListItem(R.drawable.gigaros, "기가로스", "3티어"))
        petDataList!!.add(ListItem(R.drawable.hubo, "휴보", "4티어"))
    }
}