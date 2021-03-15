package com.example.viathanapp.ui.messages

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.viathanapp.Notification
import com.example.viathanapp.R

class MessagesListAdapter( private val list: ArrayList<Messages>,
private val context: Context
) : RecyclerView.Adapter<MessagesListAdapter.ViewHolder>()  {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItem(messages: Messages) {
            var centre: TextView = itemView.findViewById(R.id.centre) as TextView
            var message: TextView = itemView.findViewById(R.id.message) as TextView
            var time: TextView = itemView.findViewById(R.id.time) as TextView
            var num: TextView = itemView.findViewById(R.id.num) as TextView
            var ppicture: ImageView = itemView.findViewById(R.id.ppicture) as ImageView



            centre.text = messages.centre
            message.text = messages.message
            time.text = messages.time.toString()
            num.text = messages.num.toString()
            ppicture.setImageResource(messages.ppicture)


            itemView.setOnClickListener {


            }

        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(context).inflate(R.layout.message_item, parent, false)

        return ViewHolder(view)
    }


    override fun getItemCount(): Int {
        return list.size
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder?.bindItem(list[position])
    }

}