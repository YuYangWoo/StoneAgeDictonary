package com.cookandroid.stoneagedc;

import android.app.Activity;
import android.widget.Toast;

public class BackPressCloseHandler {
    private long backKeyPressedTime = 0;
    private long timeInterval = 2000;
    private Toast toast;
    private Activity activity;

    public BackPressCloseHandler(Activity activity) {
        this.activity = activity;
    }

    public void onBackPressed() {
        if (System.currentTimeMillis() > backKeyPressedTime + timeInterval) {
            backKeyPressedTime = System.currentTimeMillis();
            showGuide();
        }
        else {
            toast.cancel();
            activity.finish();
        }
    }

    public void showGuide() {
        toast = Toast.makeText(activity, "\'뒤로\'버튼을 한번 더 누르시면 종료됩니다.", Toast.LENGTH_SHORT);
        toast.show();
    }
}


