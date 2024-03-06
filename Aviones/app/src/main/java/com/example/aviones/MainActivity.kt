package com.example.aviones

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity


import android.content.Intent
import com.example.aviones.Adapters.CountryAdapter
import com.google.android.ads.mediationtestsuite.dataobjects.Country
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val countries = listOf(
            Country("France", "Paris", 67000000),
            Country("Spain", "Madrid", 47000000),
            Country("Italy", "Rome", 60000000)
        )

        val adapter = CountryAdapter(this, countries)
        countriesListView.adapter = adapter

        countriesListView.setOnItemClickListener { parent, view, position, id ->
            val selectedCountry = countries[position]
            val intent = Intent(this, CountryDetailsActivity::class.java).apply {
                putExtra("country", selectedCountry)
            }
            startActivity(intent)
        }
    }
}
