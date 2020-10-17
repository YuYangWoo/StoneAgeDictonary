package com.cookandroid.stoneagedc.kindOfPet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.cookandroid.stoneagedc.R;

import java.util.ArrayList;

public class ListAdapter extends BaseAdapter {
    Context mContext = null;
    LayoutInflater mLayoutInflater = null;
    ArrayList<ListItem> data;

    public ListAdapter(Context context, ArrayList<ListItem> data){
        mContext = context;
        this.data = data;
        mLayoutInflater = LayoutInflater.from(mContext);
    }
    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public ListItem getItem(int position) {
        return data.get(position);
    }

    @Override
    public View getView(int position, View converView, ViewGroup parent) {
        View view = mLayoutInflater.inflate(R.layout.listview, null);

        ImageView imageView = (ImageView)view.findViewById(R.id.poster);
        TextView petName = (TextView)view.findViewById(R.id.petName);
        TextView tier = (TextView)view.findViewById(R.id.grade);

        imageView.setImageResource(data.get(position).getPoster());
        petName.setText(data.get(position).getPetName());
        tier.setText(data.get(position).getGrade());

        return view;
    }
}
