package com.github.lincolnstuart.desafiointegradorandroidcomponentes.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.github.lincolnstuart.desafiointegradorandroidcomponentes.R
import com.github.lincolnstuart.desafiointegradorandroidcomponentes.models.Restaurant

class RestaurantAdapter(
    private val restaurants: List<Restaurant>
) : RecyclerView.Adapter<RestaurantAdapter.ViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val viewItem =
            LayoutInflater.from(parent.context).inflate(R.layout.item_prato, parent, false)
        return ViewHolder(viewItem)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(restaurants[position])
    }

    override fun getItemCount(): Int {
        return restaurants.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val name by lazy { itemView.findViewById<TextView>(R.id.tv_item_restaurant_name) }

        fun bind(restaurant: Restaurant) {
            name.text = restaurant.name
        }
    }
}