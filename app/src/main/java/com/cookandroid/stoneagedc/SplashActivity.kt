package com.cookandroid.stoneagedc

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    private val splashTime:Long =2000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       setContentView(R.layout.splashactivity)
       Handler().postDelayed({
        startActivity(Intent(this, MainActivity::class.java))
           finish()
       },splashTime)
    }
}