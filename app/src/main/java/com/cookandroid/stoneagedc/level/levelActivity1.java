package com.cookandroid.stoneagedc.level;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.cookandroid.stoneagedc.R;

public class levelActivity1 extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }
    public void shareBtnClick3(View v){
        TextView tv = findViewById(R.id.textView20);
            Intent intent=new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_TEXT, tv.getText().toString());
            Intent chooser = Intent.createChooser(intent,"공유");
            startActivity(chooser);

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
}
