package com.github.lincolnstuart.desafiointegradorandroidcomponentes.models.login

import android.util.Patterns

class LoginBusiness {

    fun validateEmail(email: String) =  !Patterns.EMAIL_ADDRESS.matcher(email).matches()

    fun validatePassword(password: String) = password.count() < 3

}