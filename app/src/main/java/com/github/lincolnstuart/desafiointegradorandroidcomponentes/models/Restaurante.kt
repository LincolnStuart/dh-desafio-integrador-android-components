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
data class Restaurante(
    private val nome: String,
    private val endereco: String,
    private val horaDeEncerramento: String,
    private val pratos: MutableList<Prato> = mutableListOf()
) : Parcelable {

    override fun toString(): String {
        return "{ nome : $nome ," +
                " endereco : $endereco ," +
                " horaDeEncerramento: $horaDeEncerramento ," +
                " pratos : $pratos }"
    }

    override fun hashCode(): Int {
        return "$nome - $endereco - $horaDeEncerramento".hashCode()
    }

    override fun equals(other: Any?): Boolean {
        return (other as? Restaurante)?.let {
            nome == it.nome
                    && endereco == it.endereco
                    && horaDeEncerramento == it.horaDeEncerramento
        } ?: false
    }

}