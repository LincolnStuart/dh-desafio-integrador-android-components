package com.github.lincolnstuart.desafiointegradorandroidcomponentes.models.home

import com.github.lincolnstuart.desafiointegradorandroidcomponentes.data.RestaurantMock

class HomeRepository {

    fun getRestaurants() = RestaurantMock.restaurants

}