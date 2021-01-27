package com.example.viathanapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import kotlinx.android.synthetic.main.activity_dashboard_new.*

class Dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard_new)
        menu_bar.setOnClickListener(){ startActivity(Intent(this, NavigationActivity::class.java ))
        }
    }
}