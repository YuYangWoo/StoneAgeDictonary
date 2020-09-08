package com.cookandroid.stoneagedc.kindOfPet;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.cookandroid.stoneagedc.R;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class cureFragment5 extends Fragment {
    ArrayList<ListItem> petDataList;

    public cureFragment5() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cure_fragment5,container,false);
        this.InitializeMovieData();
        ListView listview = view.findViewById(R.id.listView5);
        final ListAdapter listAdapter = new ListAdapter(getActivity(), petDataList);
        listview.setAdapter(listAdapter);
        //리스트뷰 선택시 펫 액티비티로 넘어감.
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                /*
              if(parent.getItemAtPosition(position)!=null) {
                  Intent intent = new Intent(getActivity(), PetInfo.class);
                   startActivity(intent);
              }*/
                //Toast.makeText(getActivity(),petDataList.get(position).getPetName(),Toast.LENGTH_LONG).show();
                //  Toast.makeText(getActivity(), (Integer) parent.getItemAtPosition(position),Toast.LENGTH_LONG).show();
                if(petDataList.get(position).getPetName()=="도라비스")
                {
                    Intent intent = new Intent(getActivity(), cure.dorabis.class);
                    startActivity(intent);
                }
                else if(petDataList.get(position).getPetName()=="카쿠")
                {
                    Intent intent = new Intent(getActivity(), cure.kaku.class);
                    startActivity(intent);
                }
                else if(petDataList.get(position).getPetName()=="모나시프")
                {
                    Intent intent = new Intent(getActivity(), cure.monasif.class);
                    startActivity(intent);
                }
                else if(petDataList.get(position).getPetName()=="골드로비")
                {
                    Intent intent = new Intent(getActivity(), cure.GoldLobi.class);
                    startActivity(intent);
                }
            }
        });
        return view;

    }

    private void InitializeMovieData() {
        petDataList = new ArrayList<ListItem>();

        petDataList.add(new ListItem(R.drawable.dorabis, "도라비스","1티어"));
        petDataList.add(new ListItem(R.drawable.golfwolf,"골드로비","1티어"));
        petDataList.add(new ListItem(R.drawable.monasif,"모나시프","2티어"));
        petDataList.add(new ListItem(R.drawable.kaku,"카쿠","3티어"));

    }


}
