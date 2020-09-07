package com.cookandroid.stoneagedc.jorunsa

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.cookandroid.stoneagedc.R
import kotlinx.android.synthetic.main.fragment_weapon.view.*

class WeaponFragment : Fragment() {

    // Fragment 객체 생성 후 Bundle을 사용해 값을 넣기
    companion object {
        fun newInstance(): WeaponFragment {
            val weaponFragment = WeaponFragment()
            val args           = Bundle()
            weaponFragment.arguments = args

            return weaponFragment
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        var view =  inflater.inflate(R.layout.fragment_weapon, container, false)
        var text =""
        for (i in 0..100) {
            text += i
            text += "\n"
        }
        view.textview.setText(text)
        return view
    }
}