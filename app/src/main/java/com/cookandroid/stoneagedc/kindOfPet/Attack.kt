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
import com.cookandroid.stoneagedc.attackPetSet.AttackPet
import java.util.*

class Attack : Fragment() {
    private var petDataList = ArrayList<ListItem>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_attack, container, false)
        InitializePetData()
        val listview = view.findViewById<ListView>(R.id.listView)
        val listAdapter = ListAdapter(activity, petDataList)
        listview.adapter = listAdapter

        //리스트뷰 선택시 펫 액티비티로 넘어감.
        listview.onItemClickListener = OnItemClickListener { parent, view, position, id ->
            if (petDataList[position].petName === "얀기로") {
                val intent = Intent(activity, AttackPet::class.java)
                intent.putExtra("Name", "얀기로")
                startActivity(intent)
            } else if (petDataList[position].petName === "크랩(탑승)") {
                val intent = Intent(activity, AttackPet::class.java)
                intent.putExtra("Name", "크랩(탑승)")
                startActivity(intent)
            } else if (petDataList[position].petName === "꼬미") {
                val intent = Intent(activity, AttackPet::class.java)
                intent.putExtra("Name", "꼬미")
                startActivity(intent)
            } else if (petDataList[position].petName === "크랩") {
                val intent = Intent(activity, AttackPet::class.java)
                intent.putExtra("Name", "크랩")
                startActivity(intent)
            } else if (petDataList[position].petName === "큐이") {
                val intent = Intent(activity, AttackPet::class.java)
                intent.putExtra("Name", "큐이")
                startActivity(intent)
            } else if (petDataList[position].petName === "베르가") {
                val intent = Intent(activity, AttackPet::class.java)
                intent.putExtra("Name", "베르가")
                startActivity(intent)
            } else if (petDataList[position].petName === "쿠쿠르") {
                val intent = Intent(activity, AttackPet::class.java)
                intent.putExtra("Name", "쿠쿠르")
                startActivity(intent)
            } else if (petDataList[position].petName === "트라로포") {
                val intent = Intent(activity, AttackPet::class.java)
                intent.putExtra("Name", "트라로포")
                startActivity(intent)
            } else if (petDataList[position].petName === "팔케온") {
                val intent = Intent(activity, AttackPet::class.java)
                intent.putExtra("Name", "팔케온")
                startActivity(intent)
            } else if (petDataList[position].petName === "쟈그") {
                val intent = Intent(activity, AttackPet::class.java)
                intent.putExtra("Name", "쟈그")
                startActivity(intent)
            } else if (petDataList[position].petName === "고르돈") {
                val intent = Intent(activity, AttackPet::class.java)
                intent.putExtra("Name", "고르돈")
                startActivity(intent)
            } else if (petDataList[position].petName === "구루마루") {
                val intent = Intent(activity, AttackPet::class.java)
                intent.putExtra("Name", "구루마루")
                startActivity(intent)
            } else if (petDataList[position].petName === "모가") {
                val intent = Intent(activity, AttackPet::class.java)
                intent.putExtra("Name", "모가")
                startActivity(intent)
            } else if (petDataList[position].petName === "피노") {
                val intent = Intent(activity, AttackPet::class.java)
                intent.putExtra("Name", "피노")
                startActivity(intent)
            } else if (petDataList[position].petName === "베르푸스") {
                val intent = Intent(activity, AttackPet::class.java)
                intent.putExtra("Name", "베르푸스")
                startActivity(intent)
            } else if (petDataList[position].petName === "고테쿠스") {
                val intent = Intent(activity, AttackPet::class.java)
                intent.putExtra("Name", "고테쿠스")
                startActivity(intent)
            } else if (petDataList[position].petName === "베론") {
                val intent = Intent(activity, AttackPet::class.java)
                intent.putExtra("Name", "베론")
                startActivity(intent)
            } else if (petDataList[position].petName === "베이보") {
                val intent = Intent(activity, AttackPet::class.java)
                intent.putExtra("Name", "베이보")
                startActivity(intent)
            } else if (petDataList[position].petName === "기로") {
                val intent = Intent(activity, AttackPet::class.java)
                intent.putExtra("Name", "기로")
                startActivity(intent)
            } else if (petDataList[position].petName === "문울프") {
                val intent = Intent(activity, AttackPet::class.java)
                intent.putExtra("Name", "문울프")
                startActivity(intent)
            }
        }
        return view
    }

    private fun InitializePetData() {
        petDataList = ArrayList<ListItem>()
        petDataList.add(ListItem(R.drawable.angiro, "얀기로", "1티어"))
        petDataList.add(ListItem(R.drawable.giro, "기로", "1.5티어"))
        petDataList.add(ListItem(R.drawable.moonwolf, "문울프", "1.5티어"))
        petDataList.add(ListItem(R.drawable.crab, "크랩", "1.5티어"))
        petDataList.add(ListItem(R.drawable.cue, "큐이", "2티어"))
        petDataList.add(ListItem(R.drawable.trarofo, "트라로포", "2티어"))
        petDataList.add(ListItem(R.drawable.berga, "베르가", "2티어"))
        petDataList.add(ListItem(R.drawable.jag, "쟈그", "2티어"))
        petDataList.add(ListItem(R.drawable.ggomi, "꼬미", "2티어"))
        petDataList.add(ListItem(R.drawable.fino, "피노", "2티어"))
        petDataList.add(ListItem(R.drawable.cucuro, "쿠쿠르", "3티어"))
        petDataList.add(ListItem(R.drawable.baebo, "베이보", "3티어"))
        petDataList.add(ListItem(R.drawable.falteon, "팔케온", "3티어"))
        petDataList.add(ListItem(R.drawable.gordon, "고르돈", "3티어"))
        petDataList.add(ListItem(R.drawable.gurumaru, "구루마루", "3티어"))
        petDataList.add(ListItem(R.drawable.moga1, "모가", "4티어"))
        petDataList.add(ListItem(R.drawable.berfuce, "베르푸스", "4티어"))
        petDataList.add(ListItem(R.drawable.ftecus, "고테쿠스", "4티어"))
        petDataList.add(ListItem(R.drawable.beron, "베론", "4티어"))
    }

}