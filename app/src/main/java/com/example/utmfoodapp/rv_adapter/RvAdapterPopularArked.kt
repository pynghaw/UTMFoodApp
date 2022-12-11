package com.example.utmfoodapp.rv_adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.utmfoodapp.Domain.ArkedDomain
import com.example.utmfoodapp.R

class RvAdapterPopularArked(private val popularArkedList : ArrayList<ArkedDomain>)
    : RecyclerView.Adapter<PopularArkedViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularArkedViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val listItemPopularArked = layoutInflater.inflate(R.layout.list_item_populararked,parent,false)
        return PopularArkedViewHolder(listItemPopularArked)
    }

    override fun onBindViewHolder(holder: PopularArkedViewHolder, position: Int) {
        val categories = popularArkedList[position]
        holder.imageView.setImageResource(categories.image)
        holder.textView.text = categories.name
    }

    override fun getItemCount(): Int {
        return popularArkedList.size
    }

}

class PopularArkedViewHolder(val  view : View) : RecyclerView.ViewHolder(view){
    val imageView : ImageView = view.findViewById(R.id.imFood)
    val textView : TextView = view.findViewById(R.id.tvFood)
}