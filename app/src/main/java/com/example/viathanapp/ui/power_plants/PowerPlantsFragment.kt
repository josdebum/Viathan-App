package com.example.viathanapp.ui.power_plants

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.viathanapp.R

class PowerPlantsFragment : Fragment() {

    private lateinit var powerplantsViewModel: PowerPlantsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        powerplantsViewModel =
            ViewModelProviders.of(this).get(PowerPlantsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_power_plants, container, false)
        val textView: TextView = root.findViewById(R.id.text_gallery)
        powerplantsViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}