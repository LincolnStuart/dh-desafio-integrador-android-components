package com.github.lincolnstuart.desafiointegradorandroidcomponentes.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.github.lincolnstuart.desafiointegradorandroidcomponentes.R
import com.github.lincolnstuart.desafiointegradorandroidcomponentes.models.Dish

class DishesAdapter(
    private val dishes: List<Dish>,
    private val onClickItem: (Dish) -> Unit
) : RecyclerView.Adapter<DishesAdapter.ViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DishesAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_dish, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: DishesAdapter.ViewHolder, position: Int) {
        holder.bind(dishes[position], onClickItem)
    }

    override fun getItemCount(): Int {
        return dishes.count()
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(dish: Dish, onClickItem: (Dish) -> Unit) = with(itemView){
            findViewById<TextView>(R.id.tv_item_dish_name).text = dish.name
            Glide.with(this)
                .load(dish.urlPic)
                .into(findViewById<ImageView>(R.id.iv_item_dish_pic))
            findViewById<CardView>(R.id.cv_item_dish_card).setOnClickListener {
                onClickItem(dish)
            }
        }
    }

}