package com.example.viathanapp

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class NotificationListAdapter( private val list: ArrayList<Notification>,
                          private val context: Context
) : RecyclerView.Adapter<NotificationListAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItem(notification: Notification) {
            var type: TextView = itemView.findViewById(R.id.type) as TextView
            var message: TextView = itemView.findViewById(R.id.message) as TextView
            var time: TextView = itemView.findViewById(R.id.time) as TextView


            type.text = notification.type
            message.text = notification.message
            time.text = notification.time.toString()


            itemView.setOnClickListener {


            }

        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(context).inflate(R.layout.notification_items, parent, false)

        return ViewHolder(view)
    }


    override fun getItemCount(): Int {
        return list.size
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder?.bindItem(list[position])
    }


}