package com.github.lincolnstuart.desafiointegradorandroidcomponentes.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.bumptech.glide.Glide
import com.github.lincolnstuart.desafiointegradorandroidcomponentes.R
import com.github.lincolnstuart.desafiointegradorandroidcomponentes.models.Restaurant
import com.github.lincolnstuart.desafiointegradorandroidcomponentes.ui.activities.HomeActivity.Companion.RESTAURANT_KEY
import com.github.lincolnstuart.desafiointegradorandroidcomponentes.ui.adapters.DishesAdapter

class RestaurantActivity : AppCompatActivity() {

    private val ivRestaurantPic by lazy { findViewById<ImageView>(R.id.iv_restaurant_pic) }
    private val tvRestaurantName by lazy { findViewById<TextView>(R.id.tv_restaurant_name) }
    private val rvRestaurantDishes by lazy { findViewById<RecyclerView>(R.id.rv_restaurant_dishes) }
    private val ibRestaurantBackButton by lazy {findViewById<ImageButton>(R.id.ib_restaurant_back_button)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restaurant)
        supportActionBar?.hide()
        initComponents()
    }

    private fun initComponents() {
        val restaurant = intent.getParcelableExtra<Restaurant>(RESTAURANT_KEY)
        restaurant?.let {
            Glide.with(this)
                .load(it.urlPic)
                .into(ivRestaurantPic)
            tvRestaurantName.text = it.name
            ibRestaurantBackButton.setOnClickListener{
                finish()
            }
            rvRestaurantDishes.apply {
                layoutManager = GridLayoutManager(this@RestaurantActivity, 2)
                adapter = DishesAdapter(it.dishes){dish ->
                    val intent = Intent(this@RestaurantActivity, DishActivity::class.java)
                    intent.putExtra(DISH_KEY, dish)
                    startActivity(intent)
                }
            }
        }
    }

    companion object{
        val DISH_KEY = "param-dish"
    }
}