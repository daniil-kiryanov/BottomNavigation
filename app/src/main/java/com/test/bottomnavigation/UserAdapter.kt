package com.test.bottomnavigation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class UserAdapter (private val userList: List<String>) : RecyclerView.Adapter<UserViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
    val itemView =
        LayoutInflater.from(parent.context)
            .inflate(R.layout.user_list_item, parent, false)
        return UserViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val name = userList[position]
        holder.bind(name)
    }

    override fun getItemCount(): Int {
        return userList.size
    }


}