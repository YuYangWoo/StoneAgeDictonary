package com.cookandroid.stoneagedc

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_growth.*
import kotlin.math.roundToInt

class GrowthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_growth)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        title = "성장률 계산기"


        btnHealth.setOnClickListener {
            var a = edtHealthBefore.text.toString().toDouble()
            var b = edtHealthAfter.text.toString().toDouble()
            var c = (a / b)
            var result = (c*100).roundToInt() / 100f
            txtHealthResult.text = result.toString()
        }

        btnAttack.setOnClickListener {
            var a = edtAttackBefore.text.toString().toDouble()
            var b = edtAttackAfter.text.toString().toDouble()
            var c = (a / b)
            var result = (c*100).roundToInt() / 100f
            txtAttackResult.text = result.toString()
        }

        btnDefense.setOnClickListener {
            var a = edtDefenseBefore.text.toString().toDouble()
            var b = edtDefenseAfter.text.toString().toDouble()
            var c = (a / b)
            var result = (c*100).roundToInt() / 100f
            txtDefenseResult.text = result.toString()
        }

        btnSpeed.setOnClickListener {
            var a = edtSpeedBefore.text.toString().toDouble()
            var b = edtSpeedAfter.text.toString().toDouble()
            var c = (a / b)
            var result = (c*100).roundToInt() / 100f
            txtSpeedResult.text = result.toString()
        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                //toolbar의 back키 눌렀을 때 동작
                finish()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

}