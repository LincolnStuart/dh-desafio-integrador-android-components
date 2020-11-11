package com.github.lincolnstuart.desafiointegradorandroidcomponentes.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.github.lincolnstuart.desafiointegradorandroidcomponentes.R
import com.github.lincolnstuart.desafiointegradorandroidcomponentes.models.Dish
import com.github.lincolnstuart.desafiointegradorandroidcomponentes.ui.activities.RestaurantActivity.Companion.DISH_KEY

class DishActivity : AppCompatActivity() {

    private val ivDishPic by lazy { findViewById<ImageView>(R.id.iv_dish_pic) }
    private val tvDishName by lazy { findViewById<TextView>(R.id.tv_dish_name) }
    private val tvDishDesc by lazy { findViewById<TextView>(R.id.tv_dish_desc) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dish)
        val dish = intent.getParcelableExtra<Dish>(DISH_KEY)
        dish?.let {
            Glide.with(this)
                .load(it.urlPic)
                .into(ivDishPic)
            tvDishName.text = it.name
            tvDishDesc.text = it.description
        }
    }
}