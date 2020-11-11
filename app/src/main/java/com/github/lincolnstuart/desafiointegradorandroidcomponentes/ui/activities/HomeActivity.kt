package com.github.lincolnstuart.desafiointegradorandroidcomponentes.ui.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.github.lincolnstuart.desafiointegradorandroidcomponentes.R
import com.github.lincolnstuart.desafiointegradorandroidcomponentes.data.RestaurantMock
import com.github.lincolnstuart.desafiointegradorandroidcomponentes.ui.adapters.RestaurantAdapter

class HomeActivity : AppCompatActivity() {

    private val rvRestaurants by lazy { findViewById<RecyclerView>(R.id.rv_home_restaurants) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        initComponents()
    }

    private fun initComponents() {
        rvRestaurants.apply {
            layoutManager = LinearLayoutManager(this@HomeActivity)
            adapter = RestaurantAdapter(RestaurantMock.restaurants) {
                val intent = Intent(this@HomeActivity, RestaurantActivity::class.java)
                intent.putExtra(RESTAURANT_KEY, it)
                startActivity(intent)
            }
        }
    }

    companion object{
        val RESTAURANT_KEY = "param-restaurant"
    }
}