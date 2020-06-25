package com.cookandroid.stoneagedc;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class petActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pet);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void vPetClick(View v)
    {
        Uri uri = Uri.parse("https://youtu.be/SqC9bIo0wCk");
        Intent vPetIntent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(vPetIntent);

    }
    public void manClick(View v)
    {
        Uri uri = Uri.parse("https://youtu.be/-g2JRMqPabY");
        Intent manIntent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(manIntent);

    }
    public void shareBtnClick1(View v)
    {
        Intent Sharing_intent = new Intent(Intent.ACTION_SEND);
        Sharing_intent.setType("text/plain");
        String Test_Message = "https://www.youtube.com/watch?v=SqC9bIo0wCk&t=11s";
        Sharing_intent.putExtra(Intent.EXTRA_TEXT, Test_Message);
        Intent Sharing = Intent.createChooser(Sharing_intent, "공유하기");
        startActivity(Sharing);
    }
    public void shareBtnClick2(View v)
    {
        Intent Sharing_intent = new Intent(Intent.ACTION_SEND);
        Sharing_intent.setType("text/plain");
        String Test_Message = "https://www.youtube.com/watch?v=YKLP3mDiDSU";
        Sharing_intent.putExtra(Intent.EXTRA_TEXT, Test_Message);
        Intent Sharing = Intent.createChooser(Sharing_intent, "공유하기");
        startActivity(Sharing);
    }
    public void shareBtnClick(View v)
    {
        Intent Sharing_intent = new Intent(Intent.ACTION_SEND);
        Sharing_intent.setType("text/plain");
        String Test_Message = "https://www.youtube.com/watch?v=-g2JRMqPabY";
        Sharing_intent.putExtra(Intent.EXTRA_TEXT, Test_Message);
        Intent Sharing = Intent.createChooser(Sharing_intent, "공유하기");
        startActivity(Sharing);
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
