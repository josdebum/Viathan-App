package com.example.viathanapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.PopupWindow
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.github.rifqimfahmi.softkeyboard.widget.MenuEditText
import com.github.rifqimfahmi.softkeyboard.widget.SoftKeyBoardPopup
import kotlinx.android.synthetic.main.activity_each_message.*
import kotlinx.android.synthetic.main.activity_each_message.menuChatContainer

class EachMessage : AppCompatActivity() , MenuEditText.PopupListener{
    lateinit var editText: MenuEditText
    lateinit var menuKeyboard: SoftKeyBoardPopup
    lateinit var rootView: ConstraintLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_each_message)

        editText = findViewById(R.id.editText)

        editText.popupListener = this

        menuKeyboard = SoftKeyBoardPopup(
            this,
            rootView,
            editText,
            editText,
            menuChatContainer
        )

        menu_chat.setOnClickListener {
            toggle()
        }




        btnContextMenu.setOnClickListener {
            openContextMenu(btnContextMenu)
            true
        }
    }

    private fun toggle() {
        if (menuKeyboard.isShowing) {
            menuKeyboard.dismiss()
        } else {
            menuKeyboard.show()
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



    override fun onDestroy() {
        menuKeyboard.clear()
        super.onDestroy()
    }

    override fun getPopup(): PopupWindow {
        return menuKeyboard
    }
}
