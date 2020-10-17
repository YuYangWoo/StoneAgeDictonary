package com.cookandroid.stoneagedc;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.cookandroid.stoneagedc.kindOfPet.ViewPagerAdapter;
import com.google.android.material.tabs.TabLayout;

public class PetSetActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setpet);
        setTitle("펫 육성법");
        //프래그먼트 어댑터
        ViewPager vp = findViewById(R.id.viewpager);
        ViewPagerAdapter vpAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        vp.setAdapter(vpAdapter);

        //탭과 뷰페이저 연동
        TabLayout tab = findViewById(R.id.tabLayout);
        tab.setupWithViewPager(vp);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:{ //toolbar의 back키 눌렀을 때 동작
                AdsFull.getInstance(this);
                finish();
                return true;
            }
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        AdsFull.getInstance(this);
    }
}
