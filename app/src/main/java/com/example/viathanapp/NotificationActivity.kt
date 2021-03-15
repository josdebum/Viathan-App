package com.example.viathanapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_notification.*

class NotificationActivity : AppCompatActivity() {
    private var adapter: NotificationListAdapter? = null
    private var friendList: ArrayList<Notification>? = null
    private var layoutManager: RecyclerView.LayoutManager? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification)

       // val recyclerView = findViewById<RecyclerView>(R.id.notification)

        friendList = ArrayList<Notification>()
        layoutManager = LinearLayoutManager(this)
        adapter = NotificationListAdapter(friendList!!, this)


        //setup list ( Recyclerview
        notification.layoutManager = layoutManager
        notification.adapter = adapter


        //load data
        friendList!!.add(Notification("Adebayo Apercu", "100K Friends", 12))


    }

}
