package com.github.lincolnstuart.desafiointegradorandroidcomponentes.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import com.github.lincolnstuart.desafiointegradorandroidcomponentes.R
import com.github.lincolnstuart.desafiointegradorandroidcomponentes.extensions.validateField
import com.google.android.material.textfield.TextInputLayout

class RegistrationActivity : AppCompatActivity() {

    private val tilName by lazy { findViewById<TextInputLayout>(R.id.til_registration_name) }
    private val tilEmail by lazy { findViewById<TextInputLayout>(R.id.til_registration_email) }
    private val tilPassword by lazy { findViewById<TextInputLayout>(R.id.til_registration_password) }
    private val tilPasswordConfirmation by lazy { findViewById<TextInputLayout>(R.id.til_registration_password_confirmation) }
    private val btSubmit by lazy { findViewById<Button>(R.id.bt_registration_submit) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
        initComponents()
    }

    private fun initComponents() {
        btSubmit.setOnClickListener {
            if (validateForm())
                startActivity(Intent(this@RegistrationActivity, HomeActivity::class.java))
        }
    }

    private fun validateForm(): Boolean {
        return validateName(tilName)
                && validateEmail(tilEmail)
                && validatePassword(tilPassword)
                && validatePasswordConfirmation(
            tilPasswordConfirmation,
            tilPassword.editText?.text.toString()
        )
    }

    private fun validateName(til: TextInputLayout): Boolean {
        return til.validateField(getString(R.string.invalid_name_minimum)) {
            it.count() < 3
        }
    }

    private fun validateEmail(til: TextInputLayout): Boolean {
        return til.validateField(getString(R.string.invalid_email)) {
            !Patterns.EMAIL_ADDRESS.matcher(it).matches()
        }
    }

    private fun validatePassword(til: TextInputLayout): Boolean {
        return til.validateField(getString(R.string.invalid_password_minimum)) {
            it.count() < 3
        }
    }

    private fun validatePasswordConfirmation(til: TextInputLayout, password: String): Boolean {
        return til.validateField(getString(R.string.invalid_password_confirmation)) {
            it != password
        }
    }

}