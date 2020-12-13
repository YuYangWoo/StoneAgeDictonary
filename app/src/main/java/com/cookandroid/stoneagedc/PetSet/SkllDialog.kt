package com.cookandroid.stoneagedc.PetSet

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.widget.ImageView
import com.cookandroid.stoneagedc.R

class SkllDialog(context: Context, skill: Int) : Dialog(context) {
    var skill = skill
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.dialog_note, null)

        Log.d("test", skill.toString())

        var imgSkill = view.findViewById<ImageView>(R.id.imgSkill)
//      imgSkill.background = skill as Drawable

        setContentView(view)
    }
}