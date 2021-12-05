package com.test.bottomnavigation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class TownAdapter(private val townList: List<Town>) : RecyclerView.Adapter<TownViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TownViewHolder {
        val itemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.town_list_item, parent, false)
        return TownViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TownViewHolder, position: Int) {
        val town = townList[position]
        holder.bind(town)
    }

    override fun getItemCount(): Int {
        return townList.size
    }

}