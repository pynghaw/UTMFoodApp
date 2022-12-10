package com.example.utmfoodapp.rv_adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.utmfoodapp.R

class RvAdapterCategories : RecyclerView.Adapter<CategoriesViewHolder>(){

    val categories = listOf<String>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriesViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val listItemCategories = layoutInflater.inflate(R.layout.list_item_categories,parent,false)
        return CategoriesViewHolder(listItemCategories)
    }

    override fun onBindViewHolder(holder: CategoriesViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 5
    }


}

class CategoriesViewHolder(val  view : View) : RecyclerView.ViewHolder(view){

}