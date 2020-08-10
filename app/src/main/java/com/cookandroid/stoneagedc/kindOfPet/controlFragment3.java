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
public class controlFragment3 extends Fragment {
    ArrayList<ListItem> petDataList;

    public controlFragment3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_control_fragment3,container,false);
        this.InitializeMovieData();
        ListView listview = view.findViewById(R.id.listView3);
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
                if(petDataList.get(position).getPetName()=="아고아")
                {
                    Intent intent = new Intent(getActivity(), control.agoa.class);
                    startActivity(intent);
                }
                else if(petDataList.get(position).getPetName()=="아고아(탑승)")
                {
                    Intent intent = new Intent(getActivity(), control.agoaride.class);
                    startActivity(intent);
                }
                else if(petDataList.get(position).getPetName()=="백설토끼")
                {
                    Intent intent = new Intent(getActivity(), control.bakseulrabbit.class);
                    startActivity(intent);
                }
                else if(petDataList.get(position).getPetName()=="바로로크스")
                {
                    Intent intent = new Intent(getActivity(), control.baroroks.class);
                    startActivity(intent);
                }
                else if(petDataList.get(position).getPetName()=="펜타스")
                {
                    Intent intent = new Intent(getActivity(), control.fentas.class);
                    startActivity(intent);
                }
                else if(petDataList.get(position).getPetName()=="핑키")
                {
                    Intent intent = new Intent(getActivity(), control.fingki.class);
                    startActivity(intent);
                }
                else if(petDataList.get(position).getPetName()=="핑코")
                {
                    Intent intent = new Intent(getActivity(), control.fingko.class);
                    startActivity(intent);
                }
                else if(petDataList.get(position).getPetName()=="파이어노스돈")
                {
                    Intent intent = new Intent(getActivity(), control.firenosdon.class);
                    startActivity(intent);
                }
                else if(petDataList.get(position).getPetName()=="카마르")
                {
                    Intent intent = new Intent(getActivity(), control.kamare.class);
                    startActivity(intent);
                }
                else if(petDataList.get(position).getPetName()=="무이")
                {
                    Intent intent = new Intent(getActivity(), control.mui.class);
                    startActivity(intent);
                }
                else if(petDataList.get(position).getPetName()=="오투투")
                {
                    Intent intent = new Intent(getActivity(), control.otutu.class);
                    startActivity(intent);
                }
                else if(petDataList.get(position).getPetName()=="라고고")
                {
                    Intent intent = new Intent(getActivity(), control.ragogo.class);
                    startActivity(intent);
                }

            }
        });
        return view;

    }

    private void InitializeMovieData() {
        petDataList = new ArrayList<ListItem>();

        petDataList.add(new ListItem(R.drawable.fingko, "핑코","1티어"));
        petDataList.add(new ListItem(R.drawable.ragogo,"라고고","1티어"));
        petDataList.add(new ListItem(R.drawable.agoa,"아고아(탑승)","탑승1티어"));
        petDataList.add(new ListItem(R.drawable.otutu,"오투투","1.5티어"));
        petDataList.add(new ListItem(R.drawable.bakseulrabbit,"백설토끼","1.5티어"));
        petDataList.add(new ListItem(R.drawable.fingki,"핑키","2티어"));
        petDataList.add(new ListItem(R.drawable.agoa,"아고아","2티어"));
        petDataList.add(new ListItem(R.drawable.mui,"무이","2티어"));
        petDataList.add(new ListItem(R.drawable.kamare,"카미르","3티어"));
        petDataList.add(new ListItem(R.drawable.fentas,"펜타스","4티어"));
        petDataList.add(new ListItem(R.drawable.firenosdon,"파이너노스돈","4티어"));
        petDataList.add(new ListItem(R.drawable.baroroks,"바로로크스","4티어"));
    }


}
