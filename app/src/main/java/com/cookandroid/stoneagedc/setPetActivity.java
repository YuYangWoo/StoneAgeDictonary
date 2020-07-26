package com.cookandroid.stoneagedc;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class setPetActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setpet);
        setTitle("펫 육성법");
        //프래그먼트 어댑터
        ViewPager vp = findViewById(R.id.viewpager);
        VPAdapter vpAdapter = new VPAdapter(getSupportFragmentManager());
        vp.setAdapter(vpAdapter);

        //탭과 뷰페이저 연동
        TabLayout tab = findViewById(R.id.tabLayout);
        tab.setupWithViewPager(vp);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}
