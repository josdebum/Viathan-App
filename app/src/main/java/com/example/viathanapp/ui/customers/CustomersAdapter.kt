package com.example.viathanapp.ui.customers

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.viathanapp.R
import com.example.viathanapp.ui.messages.Messages

class CustomersAdapter (private val list: ArrayList<Customers>,
private val context: Context
) : RecyclerView.Adapter<CustomersAdapter.ViewHolder>()  {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItem(customers: Customers) {
            var centre: TextView = itemView.findViewById(R.id.centre) as TextView
            var message: TextView = itemView.findViewById(R.id.message) as TextView
           // var type: TextView = itemView.findViewById(R.id.type) as TextView
            var ppicture: ImageView = itemView.findViewById(R.id.ppicture) as ImageView



            centre.text = customers.centre
            message.text = customers.message

            ppicture.setImageResource(customers.ppicture)


            itemView.setOnClickListener {


            }

        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(context).inflate(R.layout.customers_item, parent, false)

        return ViewHolder(view)
    }


    override fun getItemCount(): Int {
        return list.size
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder?.bindItem(list[position])
    }


}