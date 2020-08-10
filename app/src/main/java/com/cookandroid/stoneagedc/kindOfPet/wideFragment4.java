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
public class wideFragment4 extends Fragment {
    ArrayList<ListItem> petDataList;

    public wideFragment4() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_wide_fragment4,container,false);
        this.InitializeMovieData();
        ListView listview = view.findViewById(R.id.listView4);
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
                if(petDataList.get(position).getPetName()=="기가로스")
                {
                    Intent intent = new Intent(getActivity(), wide.gigaros.class);
                    startActivity(intent);
                }
                else if(petDataList.get(position).getPetName()=="휴보")
                {
                    Intent intent = new Intent(getActivity(), wide.hubo.class);
                    startActivity(intent);
                }
                else if(petDataList.get(position).getPetName()=="카키")
                {
                    Intent intent = new Intent(getActivity(), wide.kaki.class);
                    startActivity(intent);
                }
                else if(petDataList.get(position).getPetName()=="모가로스")
                {
                    Intent intent = new Intent(getActivity(), wide.magaros.class);
                    startActivity(intent);
                }
                else if(petDataList.get(position).getPetName()=="모가로스(탑승)")
                {
                    Intent intent = new Intent(getActivity(), wide.mogarosRide.class);
                    startActivity(intent);
                }
                else if(petDataList.get(position).getPetName()=="샌디자드")
                {
                    Intent intent = new Intent(getActivity(), wide.sandizard.class);
                    startActivity(intent);
                }
            }
        });
        return view;

    }

    private void InitializeMovieData() {
        petDataList = new ArrayList<ListItem>();

        petDataList.add(new ListItem(R.drawable.mogaros, "모가로스","1티어"));
        petDataList.add(new ListItem(R.drawable.mogaros, "모가로스(탑승)","1티어"));
        petDataList.add(new ListItem(R.drawable.kaki,"카키","2티어"));
        petDataList.add(new ListItem(R.drawable.gigaros,"기가로스","3티어"));
        petDataList.add(new ListItem(R.drawable.sandizard,"샌디쟈드","3티어"));
        petDataList.add(new ListItem(R.drawable.hubo,"휴보","4티어"));

    }


}
