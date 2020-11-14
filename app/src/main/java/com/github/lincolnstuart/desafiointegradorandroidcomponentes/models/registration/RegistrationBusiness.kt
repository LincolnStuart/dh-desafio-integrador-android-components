package com.github.lincolnstuart.desafiointegradorandroidcomponentes.models.registration

import android.util.Patterns
import com.github.lincolnstuart.desafiointegradorandroidcomponentes.models.login.LoginBusiness

class RegistrationBusiness {

    fun validateEmail(email: String) =  !Patterns.EMAIL_ADDRESS.matcher(email).matches()

    fun validatePassword(password: String) = password.count() < 3

    fun validateName(name: String) = name.count() < 2

    fun validateConfirmationPassword(
        password: String,
        confirmationPassword: String
    ) = password != confirmationPassword

}
