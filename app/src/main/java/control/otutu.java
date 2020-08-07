package control;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import com.cookandroid.stoneagedc.R;
import com.cookandroid.stoneagedc.VPAdapter;
import com.google.android.material.tabs.TabLayout;

public class otutu extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.control_otutu);
        setTitle("오투투");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

/*
            //펫의 공략 종류 어댑터 연결.
            ViewPager viewPager = findViewById(R.id.kindViewPager);
            ViewPagerAdapter viewpageradapter = new ViewPagerAdapter(getSupportFragmentManager());
            viewPager.setAdapter(viewpageradapter);
           //탭레이아웃과 연동
            TabLayout tbly = findViewById(R.id.kindTab);
            tbly.setupWithViewPager(viewPager);
*/
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:{ //toolbar의 back키 눌렀을 때 동작
                finish();
                return true;
            }
        }
        return super.onOptionsItemSelected(item);
    }
}


