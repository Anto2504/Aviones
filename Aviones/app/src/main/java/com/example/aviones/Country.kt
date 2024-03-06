package com.example.aviones // Asegúrate de que la clase está en el paquete correcto

import java.io.Serializable

data class Country(val name: String, val capital: String, val population: Long) : Serializable
