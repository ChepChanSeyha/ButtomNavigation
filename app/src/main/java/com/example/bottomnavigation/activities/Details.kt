package com.example.bottomnavigation.activities

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.bottomnavigation.R

class Details : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val gg = arguments!!.get("key")

        Log.d("gg", gg.toString())

        return inflater.inflate(R.layout.activity_details, container, false)
    }
}
