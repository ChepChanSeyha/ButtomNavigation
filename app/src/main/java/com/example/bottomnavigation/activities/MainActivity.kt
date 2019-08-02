package com.example.bottomnavigation.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.bottomnavigation.*
import com.example.bottomnavigation.fragments.DepositFragment
import com.example.bottomnavigation.fragments.EarningFragment
import com.example.bottomnavigation.fragments.ProfileFragment
import com.example.bottomnavigation.fragments.SettingFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nav_view.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

        supportFragmentManager.beginTransaction().replace(R.id.fragment_container, ProfileFragment()).commit()
    }

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.nav_profile -> {
                supportFragmentManager.beginTransaction()
                    .replace(
                        R.id.fragment_container,
                        ProfileFragment()
                    )
                    .commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_earning -> {
                supportFragmentManager.beginTransaction()
                    .replace(
                        R.id.fragment_container,
                        EarningFragment()
                    )
                    .commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_deposit -> {
                supportFragmentManager.beginTransaction()
                    .replace(
                        R.id.fragment_container,
                        DepositFragment()
                    )
                    .commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_setting -> {
            supportFragmentManager.beginTransaction()
                .replace(
                    R.id.fragment_container,
                    SettingFragment()
                )
                .commit()
            return@OnNavigationItemSelectedListener true
        }
        }
        false
    }
}
