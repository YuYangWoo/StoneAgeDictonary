package com.cookandroid.stoneagedc.kindOfPet

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cookandroid.stoneagedc.R


class PetListFragment(val tabTitle: Int) : Fragment() {
    private lateinit var layoutManager: RecyclerView.LayoutManager
    private var recyclerViewAdapter = PetAdapter()
    private var list = ArrayList<PetItem>()
    var search = ""
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_pet_list, container, false)
        var recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)
        var searchView = view.findViewById<EditText>(R.id.search_bar)
        setHasOptionsMenu(true);
        // LinearLayoutManager 객체 생성 후 layoutManager에 대입 및 recyclerView 고정크기 On
        recyclerView.setHasFixedSize(true)
        layoutManager = LinearLayoutManager(context)
        recyclerView.layoutManager = layoutManager
        list.clear()
        recyclerViewAdapter = when (tabTitle) {
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
        recyclerView.adapter = recyclerViewAdapter

        searchView.addTextChangedListener(object : TextWatcher {
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                recyclerViewAdapter.filter.filter(s)
                search = s.toString()
            }

            override fun afterTextChanged(arg0: Editable) {
                // 입력이 끝났을 때 조치
            }

            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {
                // 입력하기 전에 조치
            }
        })
        return view
    }
}