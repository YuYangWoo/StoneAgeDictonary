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
import control.ControlPet
import java.util.*

class Control : Fragment() {
    var petDataList: ArrayList<ListItem>? = null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_control, container, false)
        InitializeMovieData()
        val listview = view.findViewById<ListView>(R.id.listView3)
        val listAdapter = ListAdapter(activity, petDataList)
        listview.adapter = listAdapter

        //리스트뷰 선택시 펫 액티비티로 넘어감.
        listview.onItemClickListener = OnItemClickListener { parent, view, position, id ->
            if (petDataList!![position].petName === "아고아") {
                val intent = Intent(activity, ControlPet::class.java)
                intent.putExtra("Name", "아고아")
                startActivity(intent)
            } else if (petDataList!![position].petName === "아고아(탑승)") {
                val intent = Intent(activity, ControlPet::class.java)
                intent.putExtra("Name", "아고아(탑승)")
                startActivity(intent)
            } else if (petDataList!![position].petName === "백설토끼") {
                val intent = Intent(activity, ControlPet::class.java)
                intent.putExtra("Name", "백설토끼")
                startActivity(intent)
            } else if (petDataList!![position].petName === "바로로크스") {
                val intent = Intent(activity, ControlPet::class.java)
                intent.putExtra("Name", "바로로크스")
                startActivity(intent)
            } else if (petDataList!![position].petName === "펜타스") {
                val intent = Intent(activity, ControlPet::class.java)
                intent.putExtra("Name", "펜타스")
                startActivity(intent)
            } else if (petDataList!![position].petName === "핑키") {
                val intent = Intent(activity, ControlPet::class.java)
                intent.putExtra("Name", "핑키")
                startActivity(intent)
            } else if (petDataList!![position].petName === "핑코") {
                val intent = Intent(activity, ControlPet::class.java)
                intent.putExtra("Name", "핑코")
                startActivity(intent)
            } else if (petDataList!![position].petName === "파이어노스돈") {
                val intent = Intent(activity, ControlPet::class.java)
                intent.putExtra("Name", "파이어노스돈")
                startActivity(intent)
            } else if (petDataList!![position].petName === "카미르") {
                val intent = Intent(activity, ControlPet::class.java)
                intent.putExtra("Name", "카미르")
                startActivity(intent)
            } else if (petDataList!![position].petName === "무이") {
                val intent = Intent(activity, ControlPet::class.java)
                intent.putExtra("Name", "무이")
                startActivity(intent)
            } else if (petDataList!![position].petName === "오투투") {
                val intent = Intent(activity, ControlPet::class.java)
                intent.putExtra("Name", "오투투")
                startActivity(intent)
            } else if (petDataList!![position].petName === "라고고") {
                val intent = Intent(activity, ControlPet::class.java)
                intent.putExtra("Name", "라고고")
                startActivity(intent)
            }
        }
        return view
    }

    private fun InitializeMovieData() {
        petDataList = ArrayList()
        petDataList!!.add(ListItem(R.drawable.fingko, "핑코", "1티어"))
        petDataList!!.add(ListItem(R.drawable.ragogo, "라고고", "1티어"))
        petDataList!!.add(ListItem(R.drawable.firenosdon, "파이어노스돈", "1티어"))
        petDataList!!.add(ListItem(R.drawable.agoa, "아고아(탑승)", "탑승1티어"))
        petDataList!!.add(ListItem(R.drawable.otutu, "오투투", "1.5티어"))
        petDataList!!.add(ListItem(R.drawable.bakseulrabbit, "백설토끼", "1.5티어"))
        petDataList!!.add(ListItem(R.drawable.fingki, "핑키", "2티어"))
        petDataList!!.add(ListItem(R.drawable.agoa, "아고아", "2티어"))
        petDataList!!.add(ListItem(R.drawable.mui, "무이", "2티어"))
        petDataList!!.add(ListItem(R.drawable.kamare, "카미르", "2티어"))
        petDataList!!.add(ListItem(R.drawable.fentas, "펜타스", "4티어"))
        petDataList!!.add(ListItem(R.drawable.baroroks, "바로로크스", "4티어"))
    }

}