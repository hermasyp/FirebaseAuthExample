package com.catnip.firebaseauthexample.presentation.login

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.catnip.firebaseauthexample.databinding.ActivityLoginBinding
import com.catnip.firebaseauthexample.utils.GenericViewModelFactory
import com.google.android.material.textfield.TextInputLayout

class LoginActivity : AppCompatActivity() {

    private val binding: ActivityLoginBinding by lazy {
        ActivityLoginBinding.inflate(layoutInflater)
    }

    private val viewModel: LoginViewModel by viewModels {
        GenericViewModelFactory.create(createViewModel())
    }

    private fun createViewModel(): LoginViewModel {
        return LoginViewModel()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setupForm()
        setClickListeners()
        observeResult()
    }

    private fun setupForm() {
        //todo : setup form, hide unnecessary field
    }

    private fun observeResult() {
        //todo : observe login result, show loading state and hide
    }

    private fun navigateToMain() {
        //todo : navigate to main after login
    }

    private fun setClickListeners() {
        //todo : set click listeners
    }

    private fun navigateToRegister() {
        //todo : navigate to register
    }

    private fun doLogin() {
        //todo : do login if form already valid
    }

    private fun isFormValid(): Boolean {
        //todo : check form validation
        return false
    }

    private fun checkEmailValidation(email: String): Boolean {
        //todo : check form validation
        return false
    }

    private fun checkPasswordValidation(
        confirmPassword: String,
        textInputLayout: TextInputLayout
    ): Boolean {
        //todo : check form validation
        return false
    }
}