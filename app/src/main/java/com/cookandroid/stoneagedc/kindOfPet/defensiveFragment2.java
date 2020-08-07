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
import com.cookandroid.stoneagedc.attackPetSet.Angiro;
import com.cookandroid.stoneagedc.attackPetSet.Babo;
import com.cookandroid.stoneagedc.attackPetSet.Berfus;
import com.cookandroid.stoneagedc.attackPetSet.Berga;
import com.cookandroid.stoneagedc.attackPetSet.Beron;
import com.cookandroid.stoneagedc.attackPetSet.Crab;
import com.cookandroid.stoneagedc.attackPetSet.Cucuro;
import com.cookandroid.stoneagedc.attackPetSet.Cue;
import com.cookandroid.stoneagedc.attackPetSet.Falcaon;
import com.cookandroid.stoneagedc.attackPetSet.Fino;
import com.cookandroid.stoneagedc.attackPetSet.GgoMi;
import com.cookandroid.stoneagedc.attackPetSet.Gordon;
import com.cookandroid.stoneagedc.attackPetSet.Gotecus;
import com.cookandroid.stoneagedc.attackPetSet.Gurumaru;
import com.cookandroid.stoneagedc.attackPetSet.Jag;
import com.cookandroid.stoneagedc.attackPetSet.Moga;
import com.cookandroid.stoneagedc.attackPetSet.Trarofo;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class defensiveFragment2 extends Fragment {
    ArrayList<ListItem> petDataList;

    public defensiveFragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_defensive_fragment2, container, false);
        this.InitializePetData();
        final ListView listview = view.findViewById(R.id.listView2);
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
                if(petDataList.get(position).getPetName()=="부비")
                {
                    Intent intent = new Intent(getActivity(), defensive.bubi.class);
                    startActivity(intent);
                }
                else if(petDataList.get(position).getPetName()=="북이")
                {
                    Intent intent = new Intent(getActivity(), defensive.buke.class);
                    startActivity(intent);
                }
                else if(petDataList.get(position).getPetName()=="두리")
                {
                    Intent intent = new Intent(getActivity(), defensive.duri.class);
                    startActivity(intent);
                }
                else if(petDataList.get(position).getPetName()=="프라키토스")
                {
                    Intent intent = new Intent(getActivity(), defensive.frakitos.class);
                    startActivity(intent);
                }
                else if(petDataList.get(position).getPetName()=="만모")
                {
                    Intent intent = new Intent(getActivity(), defensive.manmo.class);
                    startActivity(intent);
                }
                else if(petDataList.get(position).getPetName()=="살랑카")
                {
                    Intent intent = new Intent(getActivity(), defensive.sillingka.class);
                    startActivity(intent);
                }
                else if(petDataList.get(position).getPetName()=="스토라지")
                {
                    Intent intent = new Intent(getActivity(), defensive.stolarge.class);
                    startActivity(intent);
                }
            }
        });
        return view;

    }




    private void InitializePetData() {
        petDataList = new ArrayList<ListItem>();

        petDataList.add(new ListItem(R.drawable.manmo, "만모","1티어"));
        petDataList.add(new ListItem(R.drawable.manmo, "만모(탑승)"," "));
        petDataList.add(new ListItem(R.drawable.frakitos,"프라키토스","1티어"));
        petDataList.add(new ListItem(R.drawable.frakitos,"프라키토스(탑승)"," "));
        petDataList.add(new ListItem(R.drawable.buke,"북이","1.5티어"));
        petDataList.add(new ListItem(R.drawable.bubi,"부비","2티어"));
        petDataList.add(new ListItem(R.drawable.duri,"두리","2티어"));
        petDataList.add(new ListItem(R.drawable.katarkas,"카타르카스","3티어"));
        petDataList.add(new ListItem(R.drawable.stolarge,"스토라지","3티어"));
        petDataList.add(new ListItem(R.drawable.sillingka,"살랑카","4티어"));
    }


}
