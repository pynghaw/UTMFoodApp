package com.example.utmfoodapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.utmfoodapp.Domain.ArkedDomain
import com.example.utmfoodapp.Domain.CategoriesDomain
import com.example.utmfoodapp.Domain.FoodDomain
import com.example.utmfoodapp.R
import com.example.utmfoodapp.databinding.FragmentHomeBinding
import com.example.utmfoodapp.rv_adapter.RvAdapterCategories
import com.example.utmfoodapp.rv_adapter.RvAdapterPopularArked
import com.example.utmfoodapp.rv_adapter.RvAdapterPopularFood
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    private lateinit var binding : FragmentHomeBinding

    private lateinit var categoriesList: ArrayList<CategoriesDomain>
    private lateinit var popularFoodList: ArrayList<FoodDomain>
    private lateinit var popularArkedList: ArrayList<ArkedDomain>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater,container,false)

//        rvCategoriesList()
//        rvPopularFoodList()
        rvPopularArkedList()

        return binding.root
    }

    
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rvCategories.apply {


        }
    }


    private fun rvCategoriesList(){
        //set recycle view to horizontal
        binding.rvCategories.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        binding.rvCategories.setHasFixedSize(true)

        categoriesList = ArrayList()
        //add data here
        categoriesList.add(CategoriesDomain(R.drawable.foodicon,"Food",R.color.yellow))
        categoriesList.add(CategoriesDomain(R.drawable.beverageicon,"Beverages",R.color.purple_200))
        categoriesList.add(CategoriesDomain(R.drawable.menuicon,"Menu",R.color.pink))
        categoriesList.add(CategoriesDomain(R.drawable.arkedicon,"Arked",R.color.teal_200))

        binding.rvCategories.adapter = RvAdapterCategories(categoriesList)
    }

    private fun rvPopularFoodList(){
        binding.rvPopularFood.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        binding.rvPopularFood.setHasFixedSize(true)

        popularFoodList = ArrayList()
        popularFoodList.add(FoodDomain(R.drawable.im_chickenchop,"Chicken Chop"))
        popularFoodList.add(FoodDomain(R.drawable.im_pattaya,"Nasi Goreng Pattaya"))


        binding.rvPopularFood.adapter = RvAdapterPopularFood(popularFoodList)
    }

    private fun rvPopularArkedList(){
        binding.rvPopularArked.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        binding.rvPopularArked.setHasFixedSize(true)

        popularArkedList = ArrayList()
        popularArkedList.add(ArkedDomain(R.drawable.im_meranti,"Arked Meranti"))
        popularArkedList.add(ArkedDomain(R.drawable.im_cengal,"Arked Cengal"))
        popularArkedList.add(ArkedDomain(R.drawable.im_lestari,"Arked Lestari"))

        binding.rvPopularArked.adapter = RvAdapterPopularArked(popularArkedList)
    }

}
