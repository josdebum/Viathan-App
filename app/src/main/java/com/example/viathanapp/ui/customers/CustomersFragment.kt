package com.example.viathanapp.ui.customers

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.viathanapp.R
import com.example.viathanapp.ui.messages.Messages
import com.example.viathanapp.ui.messages.MessagesListAdapter
import kotlinx.android.synthetic.main.fragment_customers.*
import kotlinx.android.synthetic.main.fragment_messages.*


class CustomersFragment : Fragment() {
    private var mAdapter: CustomersAdapter? = null
    private var customerList: ArrayList<Customers>? = arrayListOf()
    // private var layoutManager: RecyclerView.LayoutManager? = null

    private var mLayoutManager: RecyclerView.LayoutManager? = null





    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment

        // messageList = ArrayList<Messages>()
        mLayoutManager = LinearLayoutManager(this.context)
        mAdapter = this.context?.let { CustomersAdapter(customerList!!, it) }

        return inflater.inflate(R.layout.fragment_customers, container, false)


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        customers.apply {
            layoutManager = mLayoutManager
            adapter = mAdapter
            customerList!!.add(
                Customers(
                    "Alex Marchal", "I have some questions about...", "powered",
                     R.drawable.josdebum
                )
            )
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {



        }
    }}