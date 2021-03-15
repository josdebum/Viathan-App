package com.example.viathanapp.ui.messages

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.viathanapp.R
import kotlinx.android.synthetic.main.fragment_messages.*

class MessagesFragment : Fragment() {

    private var mAdapter: MessagesListAdapter? = null
    private var messageList: ArrayList<Messages>? = arrayListOf()
    // private var layoutManager: RecyclerView.LayoutManager? = null

    private var mLayoutManager: RecyclerView.LayoutManager? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {



        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment

        // messageList = ArrayList<Messages>()
        mLayoutManager = LinearLayoutManager(this.context)
        mAdapter = this.context?.let { MessagesListAdapter(messageList!!, it) }

        return inflater.inflate(R.layout.fragment_messages, container, false)


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        messages.apply {
            layoutManager = mLayoutManager
            adapter = mAdapter
            messageList!!.add(Messages("Alex Marchal", "I have some questions about...", 12,
                2, R.drawable.josdebum))
        }}  }
