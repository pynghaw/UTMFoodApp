package com.example.utmfoodapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.utmfoodapp.R
import com.example.utmfoodapp.rv_adapter.RvAdapterCategories

class HomeFragment : Fragment() {

    private lateinit var recyclerView : RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = RvAdapterCategories()



        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)

    }

}
