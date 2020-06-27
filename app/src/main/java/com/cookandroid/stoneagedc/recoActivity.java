package com.cookandroid.stoneagedc;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class recoActivity extends AppCompatActivity {
   EditText edtName, edtNumber, edtNameResult,  edtNumberResult;
     Button clearButton, registerButton, deleteButton, updateButton,appearButton;
     petDBhelper petHelper;
    SQLiteDatabase sqlDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reco);
        setTitle("가장 인기 있는 펫");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        edtName = findViewById(R.id.petEdit);
        edtNumber = findViewById(R.id.scorePet);
        edtNameResult = findViewById(R.id.edtName);
        edtNumberResult = findViewById(R.id.edtResult);

        clearButton = findViewById(R.id.clearButton);
        registerButton = findViewById(R.id.registerButton);
        deleteButton = findViewById(R.id.registerButton);
        updateButton = findViewById(R.id.registerButton);
        appearButton = findViewById(R.id.registerButton);
        petHelper = new petDBhelper(this);

        // 시작할때 먼저 조회
        sqlDB = petHelper.getReadableDatabase();
        Cursor cursor;
        cursor = sqlDB.rawQuery("SELECT * FROM petTBL;", null);
        String strNames = "추천 펫 리스트" + "\r\n" + "--------------" + "\r\n";
        String strNumbers = "점수(중요도 100점만점)" + "\r\n" + "----------------" + "\r\n";
        while (cursor.moveToNext()) {
            strNames += cursor.getString(0) + "\r\n";
            strNumbers += cursor.getString(1) + "\r\n";

        }
        edtNameResult.setText(strNames);
        edtNumberResult.setText(strNumbers);
        cursor.close();
        sqlDB.close();
    }
    public void ClearButtonClick(View v)
    {

        sqlDB = petHelper.getWritableDatabase();
        petHelper.onUpgrade(sqlDB,1,2);
        sqlDB.close();
        Toast.makeText(getApplicationContext(), "초기화 완료", Toast.LENGTH_SHORT).show();
    }
    public void registerButtonClick(View v){
        InputMethodManager im = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        im.hideSoftInputFromWindow(edtNumber.getWindowToken(), 0);
        try {
            sqlDB = petHelper.getWritableDatabase();
            sqlDB.execSQL("INSERT INTO petTBL VALUES (" + "'" + edtName.getText().toString() + "' ,"
                    + edtNumber.getText().toString() + ");");
            sqlDB.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        Toast.makeText(getApplicationContext(), "입력됨", Toast.LENGTH_SHORT).show();
        //바로바로 나타내기
        sqlDB = petHelper.getReadableDatabase();
        Cursor cursor;
        cursor = sqlDB.rawQuery("SELECT * FROM petTBL;", null);
        String strNames = "추천 펫 리스트" + "\r\n" + "--------------" + "\r\n";
        String strNumbers = "점수(중요도 100점만점)" + "\r\n" + "----------------" + "\r\n";
        while (cursor.moveToNext()) {
            strNames += cursor.getString(0) + "\r\n";
            strNumbers += cursor.getString(1) + "\r\n";
        }
        edtNameResult.setText(strNames);
        edtNumberResult.setText(strNumbers);
        cursor.close();
        sqlDB.close();
    }
    public void deleteButtonClick(View v){
        InputMethodManager im = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        im.hideSoftInputFromWindow(edtNumber.getWindowToken(), 0);
        sqlDB = petHelper.getWritableDatabase();
        sqlDB.execSQL("DELETE from petTBL where petName = '"
                + edtName.getText().toString().trim() + "';");
        sqlDB.close();
        Toast.makeText(getApplicationContext(), "삭제 완료", Toast.LENGTH_SHORT).show();
        //바로바로 나타내기
        sqlDB = petHelper.getReadableDatabase();
        Cursor cursor;
        cursor = sqlDB.rawQuery("SELECT * FROM petTBL;", null);
        String strNames = "추천 펫 리스트" + "\r\n" + "--------------" + "\r\n";
        String strNumbers = "점수(중요도 100점만점)" + "\r\n" + "----------------" + "\r\n";
        while (cursor.moveToNext()) {
            strNames += cursor.getString(0) + "\r\n";
            strNumbers += cursor.getString(1) + "\r\n";
        }
        edtNameResult.setText(strNames);
        edtNumberResult.setText(strNumbers);
        cursor.close();
        sqlDB.close();
    }
    public void updateButtonClick(View v)
    {
        InputMethodManager im = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        im.hideSoftInputFromWindow(edtNumber.getWindowToken(), 0);
        sqlDB = petHelper.getWritableDatabase();
        sqlDB.execSQL("UPDATE petTBL set petScore = "
                + edtNumber.getText().toString().trim()
                + " where petName = '"
                + edtName.getText().toString().trim() + "';");
        sqlDB.close();
        Toast.makeText(getApplicationContext(), "수정 완료", Toast.LENGTH_SHORT).show();
        //나타내기
        sqlDB = petHelper.getReadableDatabase();
        Cursor cursor;
        cursor = sqlDB.rawQuery("SELECT * FROM petTBL;", null);
        String strNames = "추천 펫 리스트" + "\r\n" + "--------------" + "\r\n";
        String strNumbers = "점수(중요도 100점만점)" + "\r\n" + "----------------" + "\r\n";
        while (cursor.moveToNext()) {
            strNames += cursor.getString(0) + "\r\n";
            strNumbers += cursor.getString(1) + "\r\n";
        }
        edtNameResult.setText(strNames);
        edtNumberResult.setText(strNumbers);
        cursor.close();
        sqlDB.close();
    }
    public void appearButtonClick(View v){

        sqlDB = petHelper.getReadableDatabase();
        Cursor cursor;
        cursor = sqlDB.rawQuery("SELECT * FROM petTBL;", null);


        String strNames = "추천 펫 리스트" + "\r\n" + "--------------" + "\r\n";
        String strNumbers = "점수(중요도 100점만점)" + "\r\n" + "----------------" + "\r\n";



        while(cursor.moveToNext()){
            strNames += cursor.getString(0) + "\r\n";
            strNumbers += cursor.getString(1) + "\r\n";
        }


        edtNameResult.setText(strNames);
        edtNumberResult.setText(strNumbers);

        cursor.close();
        sqlDB.close();
    }

  public class petDBhelper extends SQLiteOpenHelper{
        public petDBhelper(Context context){
            super(context, "petDB",null,1);
        }
        //테이블 만들기
        public void onCreate(SQLiteDatabase db){
            db.execSQL("CREATE TABLE petTBL (petName CHAR(20) PRIMARY KEY, petScore INTEGER);");
        }

      @Override
      //초기화
      public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
          db.execSQL("DROP TABLE IF EXISTS petTBL");
          onCreate(db);
          sqlDB = petHelper.getReadableDatabase();
          Cursor cursor;
          cursor = sqlDB.rawQuery("SELECT * FROM petTBL;", null);
          String strNames = "추천 펫 리스트" + "\r\n" + "--------------" + "\r\n";
          String strNumbers = "점수(중요도 100점만점)" + "\r\n" + "----------------" + "\r\n";
          while (cursor.moveToNext()) {
              strNames += cursor.getString(0) + "\r\n";
              strNumbers += cursor.getString(1) + "\r\n";
          }
          edtNameResult.setText(strNames);
          edtNumberResult.setText(strNumbers);
          cursor.close();
          sqlDB.close();
      }

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
