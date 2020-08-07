package com.cookandroid.stoneagedc.attackPetSet;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.cookandroid.stoneagedc.kindOfPet.attackFragment1;
import com.cookandroid.stoneagedc.kindOfPet.controlFragment3;
import com.cookandroid.stoneagedc.kindOfPet.cureFragment5;
import com.cookandroid.stoneagedc.kindOfPet.defensiveFragment2;
import com.cookandroid.stoneagedc.kindOfPet.wideFragment4;

import java.util.ArrayList;

import petInfo.Info_Research;
import petInfo.Info_Skill;
import petInfo.Info_Talisman;
import petInfo.Info_Totem;
import petInfo.Info_Training;
import petInfo.Info_personality;
import petInfo.info_importance;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> items;
    private ArrayList<String> itext = new ArrayList<String>();
    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
        items=new ArrayList<Fragment>();
        items.add(new info_importance());
        items.add(new Info_personality());
        items.add(new Info_Training());
        items.add(new Info_Research());
        items.add(new Info_Skill());
        items.add(new Info_Talisman());
        items.add(new Info_Totem());

        //탭과 뷰페이저 연동시 이름이 사라짐 새로 추가해줌
        itext.add("중요성");
        itext.add("성격");
        itext.add("훈련");
        itext.add("스킬");
        itext.add("연구");
        itext.add("부적");
        itext.add("토템");

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
