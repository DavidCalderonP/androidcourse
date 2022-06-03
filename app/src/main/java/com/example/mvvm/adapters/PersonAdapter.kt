package com.example.mvvm.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvm.R
import com.example.mvvm.models.Person

class PersonAdapter(val context: Context, val layout: Int, val list: List<Person>): BaseAdapter() {

    private val mInflator: LayoutInflater = LayoutInflater.from(context)
    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(position: Int): Any {
        return list[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View
        val vh: PersonViewHolder

        if(convertView == null){
            view = mInflator.inflate(R.layout.list_view_person, parent, false)
            vh = PersonViewHolder(view)
            view.tag = vh
        }else{
            view = convertView
            vh = view.tag as PersonViewHolder
        }

        vh.fullName.text = "${list[position].name}, ${list[position].lastname}"
        vh.age.text = "${list[position].age}"

        return view
    }
}

private class PersonViewHolder(view: View) {
    val fullName: TextView = view.findViewById(R.id.fullname)
    val age: TextView = view.findViewById(R.id.age)
}