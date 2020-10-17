package com.cookandroid.stoneagedc.kindOfPet;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import java.util.ArrayList;

// 정해져 있을 때 pager adapter 정해져있지 않을 때 statepageradapter
// 프래그먼트 삽입
public class ViewPagerAdapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> items;
    private ArrayList<String> itext = new ArrayList<String>();

    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
        items = new ArrayList<Fragment>();
        items.add(new Attack());
        items.add(new Defensive());
        items.add(new Control());
        items.add(new Wide());
        items.add(new Cure());

        // 탭과 뷰페이저 연동시 이름이 사라짐 새로 추가해줌
        itext.add("공격형");
        itext.add("방어형");
        itext.add("제어형");
        itext.add("광역형");
        itext.add("치료형");

    }

    public CharSequence getPageTitle(int position) {
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
