package recomendDeck;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.cookandroid.stoneagedc.R;


import java.util.ArrayList;

public class recoListAdapter extends BaseAdapter {
    Context mContext = null;
    LayoutInflater mLayoutInflater = null;
    ArrayList<ListDeck> sample;


    public recoListAdapter(Context context, ArrayList<ListDeck> data){
        mContext = context;
        sample = data;
        mLayoutInflater = LayoutInflater.from(mContext);
    }
    @Override
    public int getCount() {
        return sample.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public ListDeck getItem(int position) {
        return sample.get(position);
    }

    @Override
    public View getView(int position, View converView, ViewGroup parent) {
        View view = mLayoutInflater.inflate(R.layout.recolistview, null);

        TextView Tier = view.findViewById(R.id.Tier);
        TextView Topic = view.findViewById(R.id.topic);
        TextView Explain = view.findViewById(R.id.explain);

        Tier.setText(sample.get(position).getTier());
        Topic.setText(sample.get(position).getTopic());
        Explain.setText(sample.get(position).getExplain());

        return view;
    }
}