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
data class Prato(
    private val nome: String,
    private val descricao: String
) : Parcelable {

    override fun toString(): String {
        return "{ nome : $nome , descricao : $descricao }"
    }

    override fun hashCode(): Int {
        return "$nome - $descricao".hashCode()
    }

    override fun equals(other: Any?): Boolean {
        return (other as? Prato)?.let {
            nome == it.nome && descricao == it.descricao
        } ?: false
    }

}