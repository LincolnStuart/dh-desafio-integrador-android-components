package com.github.lincolnstuart.desafiointegradorandroidcomponentes.models.home

class HomeBusiness {

    private val repo = HomeRepository()

    fun getRestaurants() = repo.getRestaurants()
}