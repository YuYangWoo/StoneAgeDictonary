package com.cookandroid.stoneagedc;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.cookandroid.stoneagedc.jorunsa.JorunsaActivity;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.core.view.GravityCompat;

import com.google.android.gms.ads.InterstitialAd;
import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import recomendDeck.recodeck;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private AdView mAdView;
    private BackPressCloseHandler backPressCloseHandler;
    private InterstitialAd mInterstitialAd;

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
//        //전면광고 호출
//        AdsFull.getInstance(this);
        backPressCloseHandler = new BackPressCloseHandler(this);

        Button alert = findViewById(R.id.popUp);

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
        Uri patchuri = Uri.parse("http://forum.netmarble.com/stone_kr/view/6/41731");
        Intent patchintent = new Intent(Intent.ACTION_VIEW, patchuri);
        startActivity(patchintent);
    }

    public void manClick(View v) {
        Uri manuri = Uri.parse("https://youtu.be/kK3rCseb8HM");
        Intent manintent = new Intent(Intent.ACTION_VIEW, manuri);
        startActivity(manintent);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.stoneMain) {
            Uri uri = Uri.parse("https://stone.netmarble.com/ko/");
            Intent mainIntent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(mainIntent);
        } else if (id == R.id.stoneCommunity) {
            Uri uri = Uri.parse("http://forum.netmarble.com/stone_kr");
            Intent communityIntent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(communityIntent);
        } else if (id == R.id.stoneNotice) {
            Uri uri = Uri.parse("http://forum.netmarble.com/stone_kr/list/6/1");
            Intent noticeIntent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(noticeIntent);
        } else if (id == R.id.stoneEvent) {
            Uri uri = Uri.parse("http://forum.netmarble.com/stone_kr/list/8/1");
            Intent eventIntent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(eventIntent);
        } else if (id == R.id.stoneFreeBoard) {
            Uri uri = Uri.parse("http://forum.netmarble.com/stone_kr/list/16/1");
            Intent boardIntent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(boardIntent);
        } else if (id == R.id.stoneGuide) {
            Uri uri = Uri.parse("http://forum.netmarble.com/stone_kr/list/26/1");
            Intent guideIntent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(guideIntent);
        } else if (id == R.id.stoneFriend) {
            Uri uri = Uri.parse("http://forum.netmarble.com/stone_kr/list/17/1");
            Intent friendIntent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(friendIntent);
        } else if (id == R.id.stoneKnowledge) {
            Uri uri = Uri.parse("http://forum.netmarble.com/stone_kr/list/26/1");
            Intent knowledgeIntent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(knowledgeIntent);
        } else if (id == R.id.stoneDeveloperInfo) {
            Intent developerInfoActivity = new Intent(getApplicationContext(), DeveloperInfoActivity.class);
            startActivity(developerInfoActivity);
        } else if (id == R.id.person) {
            Intent jorunsaActivity = new Intent(getApplicationContext(), JorunsaActivity.class);
            startActivity(jorunsaActivity);
        } else if (id == R.id.recodeck) {
            Intent recoActivity = new Intent(getApplicationContext(), recodeck.class);
            startActivity(recoActivity);
        } else if (id == R.id.gogohakBest) {
            Uri uri = Uri.parse("http://forum.netmarble.com/stone_kr/view/44/27181");
            Intent guideIntent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(guideIntent);
        }
        else if (id == R.id.calculator) {
            Intent calcIntent =new Intent(getApplicationContext(), GrowthActivity.class);
            startActivity(calcIntent);
        } else if (id == R.id.gogohakCountry) {
            Uri uri = Uri.parse("http:/blog.naver.com/leesi5040/222026644338");
            Intent guideIntent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(guideIntent);
        } else if (id == R.id.seokkibackgwa) {
            Uri uri = Uri.parse("http://forum.netmarble.com/stone_kr/view/26/2792");
            Intent guideIntent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(guideIntent);
        } else if (id == R.id.setPet) {
            Intent setPetActivity = new Intent(getApplicationContext(), PetSetActivity.class);
            startActivity(setPetActivity);
        } else if (id == R.id.introduceMovie) {
            Uri uri = Uri.parse("https://www.youtube.com/watch?v=wV-_QnGJoDI");
            Intent knowledgeIntent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(knowledgeIntent);
        } else if (id == R.id.stoneYoutube) {
            Uri uri = Uri.parse("https://www.youtube.com/channel/UClTxh9tyedXmKcNIQybpagQ?view_as=subscriber");
            Intent youTubeIntent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(youTubeIntent);
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            //   backPressCloseHandler.onBackPressed();
        }
        AdsFull.getInstance(this);
       backPressCloseHandler.onBackPressed();
    }
}