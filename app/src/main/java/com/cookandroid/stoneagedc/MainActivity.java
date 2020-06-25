package com.cookandroid.stoneagedc;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.core.view.GravityCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
       //왼쪽 상단에 네비게이션바 만들기
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(
                this,drawer,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close
        );
       drawer.addDrawerListener(actionBarDrawerToggle);
       actionBarDrawerToggle.syncState();


     //아이템 선택 이벤트 호출
        navigationView.setNavigationItemSelectedListener(this);
    }
   public void patchClick(View v){
       Uri patchuri =Uri.parse("http://forum.netmarble.com/stone_kr/view/6/10493");
       Intent patchintent = new Intent(Intent.ACTION_VIEW,patchuri);
       startActivity(patchintent);
   }
   public void manClick(View v){
       Uri manuri =Uri.parse("https://youtu.be/-g2JRMqPabY");
       Intent manintent = new Intent(Intent.ACTION_VIEW,manuri);
       startActivity(manintent);
   }



    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.stoneMain) {
            Uri uri = Uri.parse("https://stone.netmarble.com/ko/");
            Intent mainIntent = new Intent(Intent.ACTION_VIEW,uri);
            startActivity(mainIntent);
        }
        else if(id==R.id.stoneCommunity)
        {
            Uri uri = Uri.parse("http://forum.netmarble.com/stone_kr");
            Intent communityIntent = new Intent(Intent.ACTION_VIEW,uri);
            startActivity(communityIntent);
        }
        else if(id==R.id.stoneNotice)
        {
            Uri uri = Uri.parse("http://forum.netmarble.com/stone_kr/list/6/1");
            Intent noticeIntent = new Intent(Intent.ACTION_VIEW,uri);
            startActivity(noticeIntent);
        }
        else if(id==R.id.stoneEvent)
        {
            Uri uri = Uri.parse("http://forum.netmarble.com/stone_kr/list/8/1");
            Intent eventIntent = new Intent(Intent.ACTION_VIEW,uri);
            startActivity(eventIntent);
        }
        else if(id==R.id.stoneFreeBoard)
        {
            Uri uri = Uri.parse("http://forum.netmarble.com/stone_kr/list/16/1");
            Intent boardIntent = new Intent(Intent.ACTION_VIEW,uri);
            startActivity(boardIntent);
        }
       else if(id==R.id.stoneGuide)
        {
            Uri uri = Uri.parse("http://forum.netmarble.com/stone_kr/list/26/1");
            Intent guideIntent = new Intent(Intent.ACTION_VIEW,uri);
            startActivity(guideIntent);
        }
        else if(id==R.id.stoneFriend)
        {
            Uri uri = Uri.parse("http://forum.netmarble.com/stone_kr/list/17/1");
            Intent friendIntent = new Intent(Intent.ACTION_VIEW,uri);
            startActivity(friendIntent);
        }
        else if(id==R.id.stoneKnowledge)
        {
            Uri uri = Uri.parse("http://forum.netmarble.com/stone_kr/list/26/1");
            Intent knowledgeIntent = new Intent(Intent.ACTION_VIEW,uri);
            startActivity(knowledgeIntent);
        }
        else if(id==R.id.stoneDeveloperInfo)
        {

            Intent developerInfoActivity = new Intent(getApplicationContext(),developerInfoActivity.class);
            startActivity(developerInfoActivity);
        }
        else if(id==R.id.stonePet)
        {
            Intent petActivity = new Intent(getApplicationContext(),petActivity.class);
            startActivity(petActivity);
        }
        else if(id==R.id.stoneLevel)
        {
            Intent levelActivity = new Intent(getApplicationContext(),levelActivity.class);
            startActivity(levelActivity);
        }
        else if(id==R.id.stoneMoney)
        {
            Intent moneyActivity = new Intent(getApplicationContext(),moneyActivity.class);
            startActivity(moneyActivity);
        }
        else if(id==R.id.inquire)
        {
            Intent inquireActivity = new Intent(getApplicationContext(),inquireActivity.class);
            startActivity(inquireActivity);
        }
        else if(id==R.id.introduceMovie)
        {
            Uri uri = Uri.parse("https://www.youtube.com/watch?v=wV-_QnGJoDI");
            Intent knowledgeIntent = new Intent(Intent.ACTION_VIEW,uri);
            startActivity(knowledgeIntent);
        }
        DrawerLayout drawer =  findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}