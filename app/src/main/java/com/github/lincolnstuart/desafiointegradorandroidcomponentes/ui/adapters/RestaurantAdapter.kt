package com.github.lincolnstuart.desafiointegradorandroidcomponentes.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.github.lincolnstuart.desafiointegradorandroidcomponentes.R
import com.github.lincolnstuart.desafiointegradorandroidcomponentes.models.Restaurant

class RestaurantAdapter(
    private val restaurants: List<Restaurant>,
    private val onClickItem: (Restaurant) -> Unit
) : RecyclerView.Adapter<RestaurantAdapter.ViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val viewItem =
            LayoutInflater.from(parent.context).inflate(R.layout.item_restaurant, parent, false)
        return ViewHolder(viewItem)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(restaurants[position], onClickItem)
    }

    override fun getItemCount(): Int {
        return restaurants.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(restaurant: Restaurant, onClickItem: (Restaurant) -> Unit) = with (itemView){
            findViewById<TextView>(R.id.tv_item_restaurant_name).text = restaurant.name
            findViewById<TextView>(R.id.tv_item_restaurant_address).text = restaurant.address
            findViewById<TextView>(R.id.tv_item_restautant_closes_at).text = resources.getString(R.string.closes_at_pattern, restaurant.closesAt)
            Glide.with(this)
                .load(restaurant.urlPic)
                .into(findViewById(R.id.iv_item_restaurant_pic))
            findViewById<CardView>(R.id.cv_item_restaurant_card).setOnClickListener{
                onClickItem(restaurant)
            }
        }
    }
}