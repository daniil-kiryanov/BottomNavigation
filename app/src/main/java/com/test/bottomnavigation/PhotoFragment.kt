package com.test.bottomnavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class PhotoFragment : Fragment() {

    lateinit var townRecyclerView: RecyclerView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_photo, container, false)

        val townList: List<Town> = listOf(
            Town(R.drawable.london),
            Town(R.drawable.moscow),
            Town(R.drawable.rome),
            Town(R.drawable.barcelona)
        )

        townRecyclerView = view.findViewById(R.id.town_recycler_view)
        townRecyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        townRecyclerView.adapter = TownAdapter(townList)

        return view
    }


}