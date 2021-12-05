package com.test.bottomnavigation

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val nameTextView: TextView = itemView.findViewById(R.id.name_text_view)

    fun bind(name: String) {
        nameTextView.text = name


    }
}

