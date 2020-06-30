package com.cookandroid.stoneagedc.level;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

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
    public void expCostume(View v){
        Uri uri = Uri.parse("https://www.youtube.com/watch?v=_27I1FceKjk&list=PLSpsYzVE1soN4_5vNDdVvlec5ZNtsF2HE");
        Intent expCostumeIntent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(expCostumeIntent);
    }
    public void expEighty(View v){
        Uri uri = Uri.parse("https://www.youtube.com/watch?v=cWQ2Wy0c1Qs&list=PLSpsYzVE1soN4_5vNDdVvlec5ZNtsF2HE&index=4");
        Intent expEightyIntent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(expEightyIntent);
    }

    //공유버튼
    public void shareBtnClick2(View v)
    {
        Intent Sharing_intent = new Intent(Intent.ACTION_SEND);
        Sharing_intent.setType("text/plain");
        String Test_Message = "https://youtu.be/w6zmsSnt9SE";
        Sharing_intent.putExtra(Intent.EXTRA_TEXT, Test_Message);
        Intent Sharing = Intent.createChooser(Sharing_intent, "공유하기");
        startActivity(Sharing);
    }
    public void shareBtnClick3(View v)
    {
        Intent Sharing_intent = new Intent(Intent.ACTION_SEND);
        Sharing_intent.setType("text/plain");
        String Test_Message = "https://www.youtube.com/watch?v=_27I1FceKjk&list=PLSpsYzVE1soN4_5vNDdVvlec5ZNtsF2HE";
        Sharing_intent.putExtra(Intent.EXTRA_TEXT, Test_Message);
        Intent Sharing = Intent.createChooser(Sharing_intent, "공유하기");
        startActivity(Sharing);
    }
    public void shareBtnClick4(View v)
    {
        Intent Sharing_intent = new Intent(Intent.ACTION_SEND);
        Sharing_intent.setType("text/plain");
        String Test_Message = "https://www.youtube.com/watch?v=cWQ2Wy0c1Qs&list=PLSpsYzVE1soN4_5vNDdVvlec5ZNtsF2HE&index=4";
        Sharing_intent.putExtra(Intent.EXTRA_TEXT, Test_Message);
        Intent Sharing = Intent.createChooser(Sharing_intent, "공유하기");
        startActivity(Sharing);
    }
}
