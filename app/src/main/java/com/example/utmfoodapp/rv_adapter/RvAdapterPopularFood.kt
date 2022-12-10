package com.example.utmfoodapp.rv_adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.utmfoodapp.R

class RvAdapterPopularFood : RecyclerView.Adapter<PopularFoodViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularFoodViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val listItemPopularFood = layoutInflater.inflate(R.layout.list_item_popularfood,parent,false)
        return PopularFoodViewHolder(listItemPopularFood)
    }

    override fun onBindViewHolder(holder: PopularFoodViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 3
    }


}

class PopularFoodViewHolder(val  view : View) : RecyclerView.ViewHolder(view){

}