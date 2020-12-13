package com.cookandroid.stoneagedc.PetSet

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.cookandroid.stoneagedc.R

class SkillDialog(context: Context, skill: Int) : Dialog(context) {
    var skill = skill
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.dialog_note, null)
        var imgSkill = view.findViewById<ImageView>(R.id.imgSkill)
        Glide.with(context).load(skill).into(imgSkill)

        setContentView(view)
    }
}