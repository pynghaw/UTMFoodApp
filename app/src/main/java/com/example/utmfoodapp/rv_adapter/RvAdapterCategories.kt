package com.example.utmfoodapp.rv_adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.utmfoodapp.Domain.CategoriesDomain
import com.example.utmfoodapp.R

class RvAdapterCategories(private val categoriesList : ArrayList<CategoriesDomain>)
    : RecyclerView.Adapter<CategoriesViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriesViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val listItemCategories = layoutInflater.inflate(R.layout.list_item_categories,parent,false)
        return CategoriesViewHolder(listItemCategories)
    }

    override fun onBindViewHolder(holder: CategoriesViewHolder, position: Int) {
        val categories = categoriesList[position]
        holder.imageView.setImageResource(categories.image)
        holder.textView.text = categories.name

    }

    override fun getItemCount(): Int {
        return categoriesList.size
    }


}

class CategoriesViewHolder(val  view : View) : RecyclerView.ViewHolder(view){
    val imageView : ImageView = view.findViewById(R.id.imFood)
    val textView : TextView = view.findViewById(R.id.tvFood)
    val cardView : CardView = view.findViewById(R.id.colorFood)
}