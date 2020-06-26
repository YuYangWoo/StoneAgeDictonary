package com.cookandroid.stoneagedc.level;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.cookandroid.stoneagedc.R;

public class levelActivity extends AppCompatActivity {
     protected void onCreate(Bundle savedInstanceState)
     {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.level);
         getSupportActionBar().setDisplayHomeAsUpEnabled(true);
     }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home: { //toolbar의 back키 눌렀을 때 동작
                finish();
                return true;
            }
        }
        return super.onOptionsItemSelected(item);
    }
    public void expMainClick(View v){
        Intent intent = new Intent(getApplicationContext(),levelActivity1.class);
                startActivity(intent);
    }
    public void expContent(View v){
        Uri uri = Uri.parse("https://youtu.be/w6zmsSnt9SE");
        Intent expContentIntent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(expContentIntent);
    }
}
