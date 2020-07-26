package com.cookandroid.stoneagedc.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.cookandroid.stoneagedc.R;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class controlFragment3 extends Fragment {
    ArrayList<ListItem> movieDataList;

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
