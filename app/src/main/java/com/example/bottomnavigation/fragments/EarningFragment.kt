package com.example.bottomnavigation.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.bottomnavigation.Adapter
import com.example.bottomnavigation.Model
import com.example.bottomnavigation.R
import kotlinx.android.synthetic.main.activity_earning_fragment.*

class EarningFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.activity_earning_fragment, container, false)
    }

    @SuppressLint("WrongConstant")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)

        //        Create an arraylist
        val dataList = ArrayList<Model>()
        dataList.add(
            Model(
                1,
                "RUPP",
                "PPIU",
                "$10"
            )
        )
        dataList.add(
            Model(
                2,
                "RUPP",
                "PPIU",
                "$10"
            )
        )
        dataList.add(
            Model(
                3,
                "RUPP",
                "PPIU",
                "$10"
            )
        )
        dataList.add(
            Model(
                4,
                "RUPP",
                "PPIU",
                "$10"
            )
        )
        dataList.add(
            Model(
                5,
                "RUPP",
                "PPIU",
                "$10"
            )
        )
        dataList.add(
            Model(
                6,
                "RUPP",
                "PPIU",
                "$10"
            )
        )
        dataList.add(
            Model(
                7,
                "RUPP",
                "PPIU",
                "$10"
            )
        )
        dataList.add(
            Model(
                8,
                "RUPP",
                "PPIU",
                "$10"
            )
        )
        dataList.add(
            Model(
                9,
                "RUPP",
                "PPIU",
                "$10"
            )
        )
        dataList.add(
            Model(
                10,
                "RUPP",
                "PPIU",
                "$10"
            )
        )
        dataList.add(
            Model(
                11,
                "RUPP",
                "PPIU",
                "$10"
            )
        )
//        pass the values to RvAdapter
        val adapterC = Adapter(dataList, context!!)
//        set the recyclerView to the adapter
        recyclerView.adapter = adapterC
    }
}
