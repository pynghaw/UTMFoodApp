package com.example.utmfoodapp.rv_adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.utmfoodapp.R

class RvAdapterPopularArked : RecyclerView.Adapter<PopularArkedViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularArkedViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val listItemPopularArked = layoutInflater.inflate(R.layout.list_item_populararked,parent,false)
        return PopularArkedViewHolder(listItemPopularArked)
    }

    override fun onBindViewHolder(holder: PopularArkedViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 3
    }

}

class PopularArkedViewHolder(val  view : View) : RecyclerView.ViewHolder(view){

}