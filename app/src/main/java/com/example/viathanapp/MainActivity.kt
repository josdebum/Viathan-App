package com.example.viathanapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sign_in.setOnClickListener(){
            startActivity(Intent (this, SignIn:: class.java))
        }

        sign_up.setOnClickListener(){
            startActivity(Intent (this, SignUp:: class.java))
        }
    }
}