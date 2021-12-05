package com.test.bottomnavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class ContactFragment : Fragment() {

    lateinit var contactsRecyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_contact, container, false)

        val userList: List<String> = listOf(
            "Ivan", "Denis", "Kate", "Peter", "Daniel"
        )

        contactsRecyclerView = view.findViewById(R.id.contacts_recycler_view)
        contactsRecyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        contactsRecyclerView.adapter = UserAdapter(userList)




        return view
    }
}
