package com.example.aviones

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.aviones.databinding.ActivityCountryDetailsBinding // Importa la clase de enlace de vista generada

class CountryDetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCountryDetailsBinding // Declara una instancia de la clase de enlace de vista

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCountryDetailsBinding.inflate(layoutInflater) // Infla el layout y asigna la referencia a la instancia de enlace de vista
        setContentView(binding.root) // Establece el contenido de la actividad como la vista raíz del layout inflado

        val country = intent.getSerializableExtra("country") as Country

        // Accede a las vistas utilizando View Binding
        binding.countryNameTextView.text = country.name
        binding.countryCapitalTextView.text = "Capital: ${country.capital}"
        binding.countryPopulationTextView.text = "Población: ${country.population}"
    }
}


