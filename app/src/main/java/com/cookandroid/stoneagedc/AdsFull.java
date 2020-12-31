package com.cookandroid.stoneagedc;

import android.content.Context;
import android.util.Log;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

public class AdsFull {

    private static InterstitialAd adFull;

    private static AdsFull instance = null;
    private static Context context;

    public AdsFull(Context context) {
        //MobileAds.initialize(context, context.getString(R.string.admob));
        this.context = context;
    }

    public static AdsFull getInstance(Context context) {

        if (instance == null) {
            instance = new AdsFull(context);
            setAds();
        } else {
            instance = null;
                    setAds();
        }

        return instance;
    }

    public static void setAds() {

        adFull = new InterstitialAd(context);
        adFull.setAdUnitId(context.getResources().getString(R.string.ad_unit_id));

        AdRequest adRequest = new AdRequest.Builder().build(); //새 광고요청

        adFull.loadAd(adRequest); //요청한 광고를 load 합니다.

        adFull.setAdListener(new AdListener() { //전면 광고의 상태를 확인하는 리스너 등록

            @Override
            public void onAdFailedToLoad(int i) {
                super.onAdFailedToLoad(i);

                Log.d("ad", "onAdFailedToLoad" + " : " + String.valueOf(i));
            }

            @Override
            public void onAdLoaded(){
                if (adFull.isLoaded()) {
                    adFull.show();
                } else {
                    Log.d("AD", "The interstitial wasn't loaded yet.");
                }
            }

            // 안의 내용 주석처리시, 광고 1회호출
            @Override
            public void onAdClosed() {
                //전면 광고가 열린 뒤에 닫혔을 때
//                 AdRequest adRequest = new AdRequest.Builder().build(); //새 광고요청
//                 adFull.loadAd(adRequest); //요청한 광고를 load 합니다.
            }
        });
    }

}