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
            Restaurant("Lincoln", "Stuart", "Lima"),
            Restaurant("Lincoln", "Stuart", "Lima"),
            Restaurant("Lincoln", "Stuart", "Lima"),
            Restaurant("Lincoln", "Stuart", "Lima")
        )
        rvRestaurants.apply {
            layoutManager = LinearLayoutManager(this@HomeActivity)
            adapter = RestaurantAdapter(restaurants)
        }
    }
}