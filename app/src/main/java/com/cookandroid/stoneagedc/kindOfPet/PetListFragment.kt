package com.cookandroid.stoneagedc.kindOfPet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cookandroid.stoneagedc.R

class PetListFragment(val tabTitle: Int) : Fragment() {
    private lateinit var layoutManager: RecyclerView.LayoutManager
    private lateinit var petAdapter: RecyclerView.Adapter<*>
    private var list = ArrayList<PetItem>()
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_pet_list, container, false)
        var recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)

        // LinearLayoutManager 객체 생성 후 layoutManager에 대입 및 recyclerView 고정크기 On
        recyclerView.setHasFixedSize(true)
        layoutManager = LinearLayoutManager(context)
        recyclerView.layoutManager = layoutManager
        list.clear()
        petAdapter = when (tabTitle) {
            R.string.pet_all -> PetAdapter(PetList.petDataList)
            else -> {
                for (item in PetList.petDataList) {
                    if (item.position == getString(tabTitle)) {
                        list.add(item)
                    }
                }
                PetAdapter(list)
            }
        }
        recyclerView.adapter = petAdapter
        petAdapter.notifyDataSetChanged()
        return view
    }
}