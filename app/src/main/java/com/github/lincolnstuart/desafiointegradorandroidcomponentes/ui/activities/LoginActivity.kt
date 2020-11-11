package com.github.lincolnstuart.desafiointegradorandroidcomponentes.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import com.github.lincolnstuart.desafiointegradorandroidcomponentes.R
import com.github.lincolnstuart.desafiointegradorandroidcomponentes.extensions.validateField
import com.google.android.material.textfield.TextInputLayout

class LoginActivity : AppCompatActivity() {

    private val tilEmail by lazy { findViewById<TextInputLayout>(R.id.til_login_email) }
    private val tilPassword by lazy { findViewById<TextInputLayout>(R.id.til_login_password) }
    private val btLoginEmail by lazy { findViewById<Button>(R.id.bt_login_email) }
    private val btLoginGoogle by lazy { findViewById<Button>(R.id.bt_login_social) }
    private val btRegistration by lazy { findViewById<Button>(R.id.bt_login_registration) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        initComponents()
    }

    private fun initComponents() {
        val homeIntent = Intent(this, HomeActivity::class.java)
        val registrationIntent = Intent(this, RegistrationActivity::class.java)
        btLoginEmail.setOnClickListener {
            if (validateForm())
                startActivity(homeIntent)
        }
        btLoginGoogle.setOnClickListener() {
            startActivity(homeIntent)
        }
        btRegistration.setOnClickListener() {
            startActivity(registrationIntent)
        }
    }

    private fun validateForm(): Boolean {
        return validateEmail(tilEmail)
                && validatePassword(tilPassword)
    }

    private fun validatePassword(til: TextInputLayout): Boolean {
        return til.validateField(getString(R.string.invalid_password_minimum)) {
            it.count() < 3
        }
    }

    private fun validateEmail(til: TextInputLayout): Boolean {
        return til.validateField(getString(R.string.invalid_email)) {
            !Patterns.EMAIL_ADDRESS.matcher(it).matches()
        }
    }

}