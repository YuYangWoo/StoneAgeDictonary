package recomendDeck;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.cookandroid.stoneagedc.R;


import java.util.ArrayList;

public class RecommendListAdapter extends BaseAdapter {
    Context mContext;
    LayoutInflater mLayoutInflater;
    ArrayList<Recommend> data;


    public RecommendListAdapter(Context context, ArrayList<Recommend> data){
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
    public Recommend getItem(int position) {
        return data.get(position);
    }

    @Override
    public View getView(int position, View converView, ViewGroup parent) {
        View view = mLayoutInflater.inflate(R.layout.recolistview, null);

        TextView Tier = view.findViewById(R.id.Tier);
        TextView Topic = view.findViewById(R.id.topic);
        TextView Explain = view.findViewById(R.id.explain);

        Tier.setText(data.get(position).getTier());
        Topic.setText(data.get(position).getTopic());
        Explain.setText(data.get(position).getExplain());

        return view;
    }
}