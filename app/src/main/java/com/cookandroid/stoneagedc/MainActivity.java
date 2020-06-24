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
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
      //  getSupportActionBar().setDisplayHomeAsUpEnabled(true);
     //   getSupportActionBar().setHomeAsUpIndicator(R.id.);
        /*
        mAppBarConfiguration = new AppBarConfiguration.Builder(
              R.id.stoneMain,R.id.stoneCommunity
        ,R.id.stoneEvent,R.id.stoneFreeBoard,R.id.stoneFriend,R.id.stoneGuide,R.id.stoneKnowledge,R.id.stoneNotice)
                .setDrawerLayout(drawer)
                .build();

         */

        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(
                this,drawer,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close
        );
       drawer.addDrawerListener(actionBarDrawerToggle);
       actionBarDrawerToggle.syncState();



        navigationView.setNavigationItemSelectedListener(this);
    }




    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
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