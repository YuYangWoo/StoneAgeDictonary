package com.cookandroid.stoneagedc.attackfragment;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.cookandroid.stoneagedc.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class attackFragment1 extends Fragment  {
    ArrayList<ListItem> movieDataList;

    public attackFragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //return inflater.inflate(R.layout.fragment_attack_fragment1, container, false);
        View view = inflater.inflate(R.layout.fragment_attack_fragment1,container,false);
        this.InitializeMovieData();
        ListView listview = view.findViewById(R.id.listView);
        final ListAdapter listAdapter = new ListAdapter(getActivity(),movieDataList);
        listview.setAdapter(listAdapter);
        return view;

    }

    private void InitializeMovieData() {
        movieDataList = new ArrayList<ListItem>();

        movieDataList.add(new ListItem(R.drawable.angiro, "미션임파서블","15세 이상관람가"));
      movieDataList.add(new ListItem(R.drawable.angiro,"빠끄빠끄","1212"));
    }   


}
