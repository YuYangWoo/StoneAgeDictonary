package com.cookandroid.stoneagedc;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class recoActivity extends AppCompatActivity {
    EditText petEdit,scoreEdit, edtName, edtResult;
    Button clearButton, registerButton, deleteButton, updateButton,appearButton;
    petDBhelper petHelper;
    SQLiteDatabase sqlDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reco);
        setTitle("사람들이 좋아하는 펫");
        petEdit= findViewById(R.id.petEdit);
        scoreEdit= findViewById(R.id.scorePet);
        edtName= findViewById(R.id.edtName);
        edtResult= findViewById(R.id.edtResult);

        clearButton = findViewById(R.id.clearButton);
        registerButton= findViewById(R.id.registerButton);
        deleteButton= findViewById(R.id.registerButton);
        updateButton= findViewById(R.id.registerButton);
        appearButton= findViewById(R.id.registerButton);

        petHelper = new petDBhelper(this);


    }
    public void ClearButtonClick(View v)
    {
        sqlDB = petHelper.getWritableDatabase();
        petHelper.onUpgrade(sqlDB,1,2);
        sqlDB.close();
    }
    public void registerButtonClick(View v){
        sqlDB = petHelper.getWritableDatabase();
        sqlDB.execSQL("INSERT INTO petTBL VALUES (" +
                "'" + petEdit.getText().toString() + "' ,"
                + scoreEdit.getText().toString() + ");");
        sqlDB.close();
        Toast.makeText(getApplicationContext(), "입력됨", Toast.LENGTH_SHORT).show();
    }
    public void appearButtonClick(View v){
        sqlDB = petHelper.getReadableDatabase();
        Cursor cursor;
        cursor = sqlDB.rawQuery("SELECT * FROM petTBL;", null);

        //그룹이름과 인원을 나타내 줄 문자열 선언
        String strNames = "좋아하는 펫 리스트" + "\r\n" + "-------" + "\r\n";
        String strNumbers = "점수" + "\r\n" + "-------" + "\r\n";


        //커서가 움직이면서  현재 커서의 열 번호 데이터값을 반환해서 문자열 변수에 계속 누적한다.
        //0은 0번째열(그룹이름) , 1은 1번째열(인원)이 된다.
        while(cursor.moveToNext()){
            strNames += cursor.getString(0) + "\r\n";
            strNumbers += cursor.getString(1) + "\r\n";
        }

        //이름 출력해주기
        edtName.setText(strNames);
        edtResult.setText(strNumbers);

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
          db.execSQL("DROP TABLE IF EXISTS groupTBL");
          onCreate(db);
      }

  }

}
