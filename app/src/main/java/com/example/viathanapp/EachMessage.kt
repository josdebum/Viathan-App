package com.example.viathanapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_each_message.*

class EachMessage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_each_message)




        btnContextMenu.setOnClickListener {
            openContextMenu(btnContextMenu)
            true
        }
    }



        override fun onCreateOptionsMenu(menu: Menu): Boolean {
            val inflater = menuInflater
            inflater.inflate(R.menu.message_menu, menu)
            return true
        }



        override fun onOptionsItemSelected(item: MenuItem): Boolean {
            when (item.itemId) {
                R.id.add -> {
                    Log.d("API123", "done")
                    return true
                }
                R.id.call -> {
                    Log.d("API123", "done")
                    return true
                }
                R.id.day -> {
                    Log.d("API123", "done")
                    return true
                }
                R.id.compass -> {
                    Log.d("API123", "done")
                    return true
                }

                R.id.agenda -> {
                    Log.d("API123", "done")
                    return true
                }

                else -> return super.onOptionsItemSelected(item)
            }

        }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
    }
