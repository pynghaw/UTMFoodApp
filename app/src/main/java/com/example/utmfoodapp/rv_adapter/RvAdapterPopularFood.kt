package com.example.utmfoodapp.rv_adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.utmfoodapp.Domain.FoodDomain
import com.example.utmfoodapp.R

class RvAdapterPopularFood(private val popularFoodList : ArrayList<FoodDomain>)
    : RecyclerView.Adapter<PopularFoodViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularFoodViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val listItemPopularFood = layoutInflater.inflate(R.layout.list_item_popularfood,parent,false)
        return PopularFoodViewHolder(listItemPopularFood)
    }

    override fun onBindViewHolder(holder: PopularFoodViewHolder, position: Int) {
        val categories = popularFoodList[position]
        holder.imageView.setImageResource(categories.image)
        holder.textView.text = categories.name
    }

    override fun getItemCount(): Int {
        return popularFoodList.size
    }


}

class PopularFoodViewHolder(val  view : View) : RecyclerView.ViewHolder(view){
    val imageView : ImageView = view.findViewById(R.id.imFood)
    val textView : TextView = view.findViewById(R.id.tvFood)
}