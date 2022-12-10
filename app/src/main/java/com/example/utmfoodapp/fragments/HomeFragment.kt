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
import com.example.utmfoodapp.rv_adapter.RvAdapterPopularArked
import com.example.utmfoodapp.rv_adapter.RvAdapterPopularFood
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    private lateinit var binding : FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater,container,false)

        rvCategoriesList()
        rvPopularFoodList()
        rvPopularArkedList()

        return binding.root

    }

    private fun rvCategoriesList(){
        //set recycle view to horizontal
        binding.rvCategories.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        binding.rvCategories.adapter = RvAdapterCategories()


    }

    private fun rvPopularFoodList(){
        binding.rvPopularFood.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        binding.rvCategories.adapter = RvAdapterPopularFood()


    }

    private fun rvPopularArkedList(){
        binding.rvPopularArked.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        binding.rvCategories.adapter = RvAdapterPopularArked()


    }

}
