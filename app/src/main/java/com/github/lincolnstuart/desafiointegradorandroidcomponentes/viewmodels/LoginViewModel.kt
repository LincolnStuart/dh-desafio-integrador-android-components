package com.github.lincolnstuart.desafiointegradorandroidcomponentes.viewmodels

import androidx.lifecycle.ViewModel
import com.github.lincolnstuart.desafiointegradorandroidcomponentes.models.login.LoginBusiness

class LoginViewModel: ViewModel() {
    val business = LoginBusiness()
}