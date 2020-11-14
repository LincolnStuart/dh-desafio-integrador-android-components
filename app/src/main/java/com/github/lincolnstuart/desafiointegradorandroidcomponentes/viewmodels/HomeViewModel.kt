package com.github.lincolnstuart.desafiointegradorandroidcomponentes.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.github.lincolnstuart.desafiointegradorandroidcomponentes.models.Restaurant
import com.github.lincolnstuart.desafiointegradorandroidcomponentes.models.home.HomeBusiness

class HomeViewModel : ViewModel() {
    val restaurantsLiveData: MutableLiveData<List<Restaurant>> = MutableLiveData()
    val business = HomeBusiness()

    fun getRestaurants(){
        restaurantsLiveData.postValue(business.getRestaurants())
    }
}