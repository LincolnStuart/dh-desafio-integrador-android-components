package com.github.lincolnstuart.desafiointegradorandroidcomponentes.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * Classe que representa um Restaurante
 *
 * @author Lincoln Stuart
 * @since 09/11/2020
 */
@Parcelize
data class Restaurant(
    val name: String,
    val address: String,
    val closesAt: String,
    val urlPic: String,
    val dishes: List<Dish> = mutableListOf()
) : Parcelable {

    override fun toString(): String {
        return "{ name : $name ," +
                " address : $address ," +
                " closesAt: $closesAt ," +
                " dishes : $dishes }"
    }

    override fun hashCode(): Int {
        return "$name - $address - $closesAt".hashCode()
    }

    override fun equals(other: Any?): Boolean {
        return (other as? Restaurant)?.let {
            name == it.name
                    && address == it.address
                    && closesAt == it.closesAt
        } ?: false
    }

}