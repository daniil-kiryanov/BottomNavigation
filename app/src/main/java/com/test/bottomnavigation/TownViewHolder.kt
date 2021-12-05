package com.test.bottomnavigation

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class TownViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val townImageView: ImageView = itemView.findViewById(R.id.town_image_view)


    fun bind(town: Town) {
        townImageView.setImageResource(town.image)
    }
}