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
import com.cookandroid.stoneagedc.attackPetSet.Giro;
import com.cookandroid.stoneagedc.attackPetSet.Gordon;
import com.cookandroid.stoneagedc.attackPetSet.Gotecus;
import com.cookandroid.stoneagedc.attackPetSet.Gurumaru;
import com.cookandroid.stoneagedc.attackPetSet.Jag;
import com.cookandroid.stoneagedc.attackPetSet.Moga;
import com.cookandroid.stoneagedc.attackPetSet.Trarofo;
import com.cookandroid.stoneagedc.attackPetSet.angiroRide;
import com.cookandroid.stoneagedc.attackPetSet.crabRide;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class attackFragment1 extends Fragment  {
    ArrayList<ListItem> petDataList;

    public attackFragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //return inflater.inflate(R.layout.fragment_attack_fragment1, container, false);
        View view = inflater.inflate(R.layout.fragment_attack_fragment1,container,false);
        this.InitializePetData();
        final ListView listview = view.findViewById(R.id.listView);
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
                if(petDataList.get(position).getPetName()=="얀기로")
                {
                    Intent intent = new Intent(getActivity(), Angiro.class);
                    startActivity(intent);
                }
                else if(petDataList.get(position).getPetName()=="얀기로(탑승)")
                {
                    Intent intent = new Intent(getActivity(), angiroRide.class);
                    startActivity(intent);
                }
                else if(petDataList.get(position).getPetName()=="크랩(탑승)")
                {
                    Intent intent = new Intent(getActivity(), crabRide.class);
                    startActivity(intent);
                }
              else if(petDataList.get(position).getPetName()=="꼬미")
                {
                    Intent intent = new Intent(getActivity(), GgoMi.class);
                    startActivity(intent);
                }
                else if(petDataList.get(position).getPetName()=="크랩")
                {
                    Intent intent = new Intent(getActivity(), Crab.class);
                    startActivity(intent);
                }
                else if(petDataList.get(position).getPetName()=="큐이")
                {
                    Intent intent = new Intent(getActivity(), Cue.class);
                    startActivity(intent);
                }
                else if(petDataList.get(position).getPetName()=="베르가")
                {
                    Intent intent = new Intent(getActivity(), Berga.class);
                    startActivity(intent);
                }
                else if(petDataList.get(position).getPetName()=="쿠쿠르")
                {
                    Intent intent = new Intent(getActivity(), Cucuro.class);
                    startActivity(intent);
                }
                else if(petDataList.get(position).getPetName()=="트라로포")
                {
                    Intent intent = new Intent(getActivity(), Trarofo.class);
                    startActivity(intent);
                }
                else if(petDataList.get(position).getPetName()=="팔케온")
                {
                    Intent intent = new Intent(getActivity(), Falcaon.class);
                    startActivity(intent);
                }
                else if(petDataList.get(position).getPetName()=="쟈그")
                {
                    Intent intent = new Intent(getActivity(), Jag.class);
                    startActivity(intent);
                }
                else if(petDataList.get(position).getPetName()=="고르돈")
                {
                    Intent intent = new Intent(getActivity(), Gordon.class);
                    startActivity(intent);
                }
                else if(petDataList.get(position).getPetName()=="구루마루")
                {
                    Intent intent = new Intent(getActivity(), Gurumaru.class);
                    startActivity(intent);
                }
                else if(petDataList.get(position).getPetName()=="모가")
                {
                    Intent intent = new Intent(getActivity(), Moga.class);
                    startActivity(intent);
                }
                else if(petDataList.get(position).getPetName()=="피노")
                {
                    Intent intent = new Intent(getActivity(), Fino.class);
                    startActivity(intent);
                }
                else if(petDataList.get(position).getPetName()=="베르푸스")
                {
                    Intent intent = new Intent(getActivity(), Berfus.class);
                    startActivity(intent);
                }
                else if(petDataList.get(position).getPetName()=="고테쿠스")
                {
                    Intent intent = new Intent(getActivity(), Gotecus.class);
                    startActivity(intent);
                }
                else if(petDataList.get(position).getPetName()=="베론")
                {
                    Intent intent = new Intent(getActivity(), Beron.class);
                    startActivity(intent);
                }
                else if(petDataList.get(position).getPetName()=="베이보")
                {
                    Intent intent = new Intent(getActivity(), Babo.class);
                    startActivity(intent);
                }
                else if(petDataList.get(position).getPetName()=="기로")
                {
                    Intent intent = new Intent(getActivity(), Giro.class);
                    startActivity(intent);
                }


            }
        });
        return view;

    }

    private void InitializePetData() {
        petDataList = new ArrayList<ListItem>();

        petDataList.add(new ListItem(R.drawable.angiro, "얀기로","1티어"));
        petDataList.add(new ListItem(R.drawable.angiro, "얀기로(탑승)","탑승2티어"));
        petDataList.add(new ListItem(R.drawable.giro, "기로","1.5티어"));
        petDataList.add(new ListItem(R.drawable.cue,"큐이","2티어"));
        petDataList.add(new ListItem(R.drawable.trarofo,"트라로포","2티어"));
        petDataList.add(new ListItem(R.drawable.ggomi,"꼬미","2티어"));
        petDataList.add(new ListItem(R.drawable.berga,"베르가","2티어"));
        petDataList.add(new ListItem(R.drawable.cucuro,"쿠쿠르","2티어"));
        petDataList.add(new ListItem(R.drawable.crab,"크랩","2티어"));
        petDataList.add(new ListItem(R.drawable.crab,"크랩(탑승)","탑승1티어"));
        petDataList.add(new ListItem(R.drawable.baebo,"베이보","3티어"));
        petDataList.add(new ListItem(R.drawable.falteon,"팔케온","3티어"));
        petDataList.add(new ListItem(R.drawable.jag,"쟈그","3티어"));
        petDataList.add(new ListItem(R.drawable.gordon,"고르돈","3티어"));
        petDataList.add(new ListItem(R.drawable.gurumaru,"구루마루","3티어"));
        petDataList.add(new ListItem(R.drawable.moga1,"모가","4티어"));
        petDataList.add(new ListItem(R.drawable.fino,"피노","4티어"));
        petDataList.add(new ListItem(R.drawable.berfuce,"베르푸스","4티어"));
        petDataList.add(new ListItem(R.drawable.ftecus,"고테쿠스","4티어"));
        petDataList.add(new ListItem(R.drawable.beron,"베론","4티어"));

    }


}
