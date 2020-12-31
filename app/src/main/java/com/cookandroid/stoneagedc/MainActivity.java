package com.cookandroid.stoneagedc;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;

import com.cookandroid.stoneagedc.jorunsa.JorunsaActivity;
import com.cookandroid.stoneagedc.kindOfPet.PetActivity;
import com.cookandroid.stoneagedc.kindOfPet.PetList;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.core.view.GravityCompat;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import recomendDeck.RecommendDeckActivity;
import recomendDeck.Tips;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private AdView mAdView;
    private BackPressCloseHandler backPressCloseHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);

        // 왼쪽 상단에 네비게이션바 만들기
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close
        );
        drawer.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        //배너광고 호출
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        //아이템 선택 이벤트 호출
        navigationView.setNavigationItemSelectedListener(this);

        backPressCloseHandler = new BackPressCloseHandler(this);

        Button alert = findViewById(R.id.popUp);

        // 석기생활 달력 시간
        Date currentTime = Calendar.getInstance().getTime();

        SimpleDateFormat weekdayFormat = new SimpleDateFormat("EE", Locale.getDefault());
        String weekDay = weekdayFormat.format(currentTime);

        TextView time = findViewById(R.id.localTime);
        time.setText("오늘은" + weekDay + "요일");
        TextView monday = findViewById(R.id.monday);
        TextView tuesday = findViewById(R.id.tuesday);
        TextView wedensday = findViewById(R.id.wedensday);
        TextView thursday = findViewById(R.id.thursday);
        TextView friday = findViewById(R.id.friday);
        TextView saturday = findViewById(R.id.saturday);
        TextView sunday = findViewById(R.id.sunday);

        Log.d("test", weekDay);
        if(weekDay == "월") {
            monday.setTextColor(Color.RED);
            Log.d("test","월빨간색색입혔다");
        } else if(weekDay == "화") {
            tuesday.setTextColor(Color.RED);
            Log.d("test","월빨간색색입혔다");
        } else if(weekDay == "수") {
            wedensday.setTextColor(Color.RED);
            Log.d("test","월빨간색색입혔다");
        } else if(weekDay == "목") {
            thursday.setTextColor(Color.RED);
            Log.d("test","월빨간색색입혔다");
        } else if(weekDay == "금") {
            friday.setTextColor(Color.RED);
            Log.d("test","월빨간색색입혔다");
        } else if(weekDay == "토") {
            saturday.setTextColor(Color.RED);
            Log.d("test","월빨간색색입혔다");
        } else if(weekDay == "일") {
            sunday.setTextColor(Color.RED);
            Log.d("test","월빨간색색입혔다");
        }


    }

    public void noticeClick(View v) {
        Context context = getApplicationContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.dialog, (ViewGroup) findViewById(R.id.popup));
        AlertDialog.Builder Dialog = new AlertDialog.Builder(MainActivity.this);
        Dialog.setTitle("공지사항");
        Dialog.setView(layout);

        Dialog.setNegativeButton("닫기", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        AlertDialog ad = Dialog.create();
        ad.show();
    }

    public void patchClick(View v) {
        Intent patchIntent = new Intent(this, WebViewActivity.class);
        patchIntent.putExtra("URL", "https://forum.netmarble.com/stone_kr/view/6/48838");
        startActivity(patchIntent);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.stoneMain) {

            Intent mainIntent = new Intent(this, WebViewActivity.class);
            mainIntent.putExtra("URL", "https://stone.netmarble.com/ko/");
            startActivity(mainIntent);
        } else if (id == R.id.stoneCommunity) {
            Intent communityIntent = new Intent(this, WebViewActivity.class);
            communityIntent.putExtra("URL", "http://forum.netmarble.com/stone_kr");
            startActivity(communityIntent);
        } else if (id == R.id.stoneNotice) {
            Intent noticeIntent = new Intent(this, WebViewActivity.class);
            noticeIntent.putExtra("URL", "http://forum.netmarble.com/stone_kr/list/6/1");
            startActivity(noticeIntent);
        } else if (id == R.id.stoneEvent) {
            Intent eventIntent = new Intent(this, WebViewActivity.class);
            eventIntent.putExtra("URL", "http://forum.netmarble.com/stone_kr/list/8/1");

            startActivity(eventIntent);
        } else if (id == R.id.stoneFreeBoard) {
            Intent boardIntent = new Intent(this, WebViewActivity.class);
            boardIntent.putExtra("URL", "http://forum.netmarble.com/stone_kr/list/16/1");
            startActivity(boardIntent);
        } else if (id == R.id.stoneGuide) {
            Intent guideIntent = new Intent(this, WebViewActivity.class);
            guideIntent.putExtra("URL", "http://forum.netmarble.com/stone_kr/list/26/1");
            startActivity(guideIntent);
        } else if (id == R.id.stoneFriend) {
            Intent friendIntent = new Intent(this, WebViewActivity.class);
            friendIntent.putExtra("URL", "http://forum.netmarble.com/stone_kr/list/17/1");
            startActivity(friendIntent);
        } else if (id == R.id.stoneKnowledge) {
            Intent knowledgeIntent = new Intent(this, WebViewActivity.class);
            knowledgeIntent.putExtra("URL", "http://forum.netmarble.com/stone_kr/list/26/1");
            startActivity(knowledgeIntent);
        } else if (id == R.id.stoneDeveloperInfo) {
            Intent developerInfoActivity = new Intent(getApplicationContext(), DeveloperInfoActivity.class);
            startActivity(developerInfoActivity);
        } else if (id == R.id.person) {
            Intent jorunsaActivity = new Intent(getApplicationContext(), JorunsaActivity.class);
            startActivity(jorunsaActivity);
        } else if (id == R.id.recodeck) {
            Intent recoActivity = new Intent(getApplicationContext(), RecommendDeckActivity.class);
            startActivity(recoActivity);
        } else if (id == R.id.gogohakBest) {
            Intent guideIntent = new Intent(this, WebViewActivity.class);
            guideIntent.putExtra("URL", "http://forum.netmarble.com/stone_kr/view/26/39272");
            startActivity(guideIntent);
        } else if (id == R.id.calculator) {
            Intent calcIntent = new Intent(getApplicationContext(), GrowthActivity.class);
            startActivity(calcIntent);
        } else if (id == R.id.gogohakCountry) {
            Intent guideIntent = new Intent(this, WebViewActivity.class);
            guideIntent.putExtra("URL", "http:/blog.naver.com/leesi5040/222026644338");
            startActivity(guideIntent);
        } else if (id == R.id.seokkibackgwa) {
            Intent guideIntent = new Intent(this, WebViewActivity.class);
            guideIntent.putExtra("URL", "http://forum.netmarble.com/stone_kr/view/26/2792");
            startActivity(guideIntent);
        } else if (id == R.id.setPet) {
            Intent setPetActivity = new Intent(getApplicationContext(), PetActivity.class);
            startActivity(setPetActivity);
        } else if (id == R.id.introduceMovie) {
            Uri uri = Uri.parse("https://www.youtube.com/watch?v=wV-_QnGJoDI");
            Intent knowledgeIntent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(knowledgeIntent);
        } else if (id == R.id.stoneYoutube) {
            Uri uri = Uri.parse("https://www.youtube.com/channel/UClTxh9tyedXmKcNIQybpagQ?view_as=subscriber");
            Intent youTubeIntent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(youTubeIntent);
        } else if (id == R.id.tips) {
            Intent tips = new Intent(getApplicationContext(), Tips.class);
            startActivity(tips);
        } else if(id == R.id.goDC) {
            Intent guideIntent = new Intent(this, WebViewActivity.class);
            guideIntent.putExtra("URL", "https://gall.dcinside.com/mgallery/board/lists?id=stoneageworld");
            startActivity(guideIntent);
        } else if(id == R.id.goHungry) {
            Intent guideIntent = new Intent(this, WebViewActivity.class);
            guideIntent.putExtra("URL", "http://www.hungryapp.co.kr/bbs/list.php?bcode=stoneageworld");
            startActivity(guideIntent);
        }
            DrawerLayout drawer = findViewById(R.id.drawer_layout);
            drawer.closeDrawer(GravityCompat.START);
            return true;
        }

        public void onBackPressed () {
            DrawerLayout drawer = findViewById(R.id.drawer_layout);
            if (drawer.isDrawerOpen(GravityCompat.START)) {
                drawer.closeDrawer(GravityCompat.START);
            } else {
            }
            AdsFull.getInstance(this);
            backPressCloseHandler.onBackPressed();
        }
    }
