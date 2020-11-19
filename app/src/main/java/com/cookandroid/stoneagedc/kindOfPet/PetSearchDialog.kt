package com.cookandroid.stoneagedc.kindOfPet

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.cookandroid.stoneagedc.R
import kotlinx.android.synthetic.main.dialog_search.*

class PetSearchDialog : AppCompatActivity(){
    private lateinit var adapter: PetSearchAdapter
    private lateinit var layoutManager: LinearLayoutManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dialog_search)
        var input = input
        recyclerView.setHasFixedSize(true)
        layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager


        adapter = PetSearchAdapter(this, PetList.petDataList)
        recyclerView.adapter = adapter

        input.addTextChangedListener(object: TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                Log.d("test","beforeTextChanged")
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                Log.d("test","onTextChanged")
            }

            override fun afterTextChanged(s: Editable?) {
                Log.d("test","afterTextChanged")
           var text = input.text.toString().toLowerCase()
                adapter.filter(text)
            }

        })
    }

}
//    override fun onQueryTextChange(newText: String?): Boolean {
//        var userInput = newText!!.toLowerCase()
//        var newList = ArrayList<PetItem>()
//        for(name in PetList.petDataList) {
//            if(name.petName!!.toLowerCase().contains(userInput)) {
//
//                newList.add(name)
//            }
//        }
//        var adapter = PetSearchAdapter()
//        adapter.updateList(newList)
//        return true