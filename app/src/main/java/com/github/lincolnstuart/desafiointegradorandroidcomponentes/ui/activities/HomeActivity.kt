package com.github.lincolnstuart.desafiointegradorandroidcomponentes.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.github.lincolnstuart.desafiointegradorandroidcomponentes.R
import com.github.lincolnstuart.desafiointegradorandroidcomponentes.models.Restaurant
import com.github.lincolnstuart.desafiointegradorandroidcomponentes.ui.adapters.RestaurantAdapter

class HomeActivity : AppCompatActivity() {

    private val rvRestaurants by lazy { findViewById<RecyclerView>(R.id.rv_home_restaurants) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        initComponents()
    }

    private fun initComponents() {
        val restaurants = listOf<Restaurant>(
            Restaurant("Cantina di Napoli", "Sunset Boulevard, 99, L.A", "23:00", "https://cdn.nohat.cc/thumb/f/720/6368616966520832.jpg"),
            Restaurant("Enzo's", "Santa Monica Boulevard, 123, L.A", "02:15", "https://i.pinimg.com/736x/16/68/fd/1668fd0196b1be7cd85025a8a458d860.jpg"),
            Restaurant("Art in Coffee", "Baker Street, 11, Candem", "21:30", "https://image.freepik.com/free-vector/modern-restaurant-interior-with-flat-design_23-2147920153.jpg"),
            Restaurant("Senzai", "Henrietta Street, 40, D7", "03:00", "https://image.freepik.com/free-vector/elegant-restaurant-with-flat-design_23-2147792209.jpg")
        )
        rvRestaurants.apply {
            layoutManager = LinearLayoutManager(this@HomeActivity)
            adapter = RestaurantAdapter(restaurants)
        }
    }
}