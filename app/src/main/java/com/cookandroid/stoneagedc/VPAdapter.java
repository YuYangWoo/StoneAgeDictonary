package com.cookandroid.stoneagedc;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.cookandroid.stoneagedc.fragment.attackFragment1;
import com.cookandroid.stoneagedc.fragment.controlFragment3;
import com.cookandroid.stoneagedc.fragment.cureFragment5;
import com.cookandroid.stoneagedc.fragment.defensiveFragment2;
import com.cookandroid.stoneagedc.fragment.wideFragment4;

import java.util.ArrayList;
//정해져 있을 때 pager adapter 정해져있지 않을 때 statepageradapter
//프래그먼트 삽입
public class VPAdapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> items;
    private ArrayList<String> itext = new ArrayList<String>();
    public VPAdapter(@NonNull FragmentManager fm) {
        super(fm);
        items=new ArrayList<Fragment>();
        items.add(new attackFragment1());
        items.add(new defensiveFragment2());
        items.add(new controlFragment3());
        items.add(new wideFragment4());
        items.add(new cureFragment5());
        //탭과 뷰페이저 연동시 이름이 사라짐 새로 추가해줌
        itext.add("공격형");
        itext.add("방어형");
        itext.add("제어형");
        itext.add("광역형");
        itext.add("치료형");

    }
   public CharSequence getPageTitle(int position){
        return itext.get(position);
   }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        return items.get(position);
    }

    @Override
    public int getCount() {
        return items.size();
    }
}
