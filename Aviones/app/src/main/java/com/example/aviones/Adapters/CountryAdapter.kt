package com.example.aviones.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.aviones.Country
import com.example.aviones.R

class CountryAdapter(context: Context, countries: List<Country>) :
    ArrayAdapter<Country.Country>(context, 0, countries) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var itemView = convertView
        if (itemView == null) {
            itemView = LayoutInflater.from(context).inflate(R.layout.country_list_item, parent, false)
        }

        val country = getItem(position)
        val countryNameTextView = itemView?.findViewById<TextView>(R.id.countryNameTextView)
        countryNameTextView?.text = country?.name

        return itemView!!
    }
}
