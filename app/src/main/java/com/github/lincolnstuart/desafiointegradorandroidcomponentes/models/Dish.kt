package com.github.lincolnstuart.desafiointegradorandroidcomponentes.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * Classe que representa um prato de restaurante
 *
 * @author Lincoln Stuart Lima da Gama
 * @since 09/11/2020
 */
@Parcelize
data class Dish(
    val name: String,
    val description: String,
    val urlPic: String,
) : Parcelable {

    override fun toString(): String {
        return "{ name : $name , description : $description }"
    }

    override fun hashCode(): Int {
        return "$name - $description".hashCode()
    }

    override fun equals(other: Any?): Boolean {
        return (other as? Dish)?.let {
            name == it.name && description == it.description
        } ?: false
    }

}