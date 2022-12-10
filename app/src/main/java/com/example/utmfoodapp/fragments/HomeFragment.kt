package com.example.utmfoodapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.utmfoodapp.R
import com.example.utmfoodapp.databinding.FragmentHomeBinding
import com.example.utmfoodapp.rv_adapter.RvAdapterCategories

class HomeFragment : Fragment() {

    private lateinit var binding : FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

         binding = FragmentHomeBinding.inflate(inflater,container,false)


        binding.rvCategories.layoutManager = LinearLayoutManager(context)
        binding.rvCategories.adapter = RvAdapterCategories()



        return binding.root

    }

}
