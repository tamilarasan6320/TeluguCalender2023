package com.greymatter.telugucalender.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.greymatter.telugucalender.Activites.HomeActivity
import com.greymatter.telugucalender.R

class NamaKaranamFrag : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        HomeActivity.navbar!!.visibility = View.GONE
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_nama_karanam, container, false)
    }
}