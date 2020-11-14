package com.github.lincolnstuart.desafiointegradorandroidcomponentes.ui.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.github.lincolnstuart.desafiointegradorandroidcomponentes.R
import com.github.lincolnstuart.desafiointegradorandroidcomponentes.models.Restaurant
import com.github.lincolnstuart.desafiointegradorandroidcomponentes.ui.adapters.RestaurantAdapter
import com.github.lincolnstuart.desafiointegradorandroidcomponentes.viewmodels.HomeViewModel

class HomeActivity : AppCompatActivity() {

    private lateinit var viewModel: HomeViewModel
    private val rvRestaurants by lazy { findViewById<RecyclerView>(R.id.rv_home_restaurants) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        initComponents()
    }

    private fun initComponents() {
        initViewModel()
        setupObservables()
    }

    private fun setupObservables() {
        viewModel.restaurantsLiveData.observe(this) {
            it?.let { restaurants ->
                initRecyvlerViewRestaurants(restaurants)
            }
        }
    }

    private fun initRecyvlerViewRestaurants(it: List<Restaurant>) {
        rvRestaurants.apply {
            layoutManager = LinearLayoutManager(this@HomeActivity)
            adapter = RestaurantAdapter(it) {
                val intent = Intent(this@HomeActivity, RestaurantActivity::class.java)
                intent.putExtra(RESTAURANT_KEY, it)
                startActivity(intent)
            }
        }
    }

    private fun initViewModel() {
        viewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        viewModel.getRestaurants()
    }

    companion object {
        val RESTAURANT_KEY = "param-restaurant"
    }
}