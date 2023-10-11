package com.catnip.firebaseauthexample.presentation.login

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import com.catnip.firebaseauthexample.presentation.main.MainActivity
import com.catnip.firebaseauthexample.R
import com.catnip.firebaseauthexample.data.network.firebase.auth.FirebaseAuthDataSourceImpl
import com.catnip.firebaseauthexample.data.repository.UserRepositoryImpl
import com.catnip.firebaseauthexample.databinding.ActivityLoginBinding
import com.catnip.firebaseauthexample.presentation.register.RegisterActivity
import com.catnip.firebaseauthexample.utils.GenericViewModelFactory
import com.catnip.firebaseauthexample.utils.highLightWord
import com.catnip.firebaseauthexample.utils.proceedWhen
import com.google.android.material.textfield.TextInputLayout
import com.google.firebase.auth.FirebaseAuth

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
        //todo : setup form
    }

    private fun observeResult() {
        //todo : observe value from login result
    }

    private fun navigateToMain() {
        //todo : navigate to main
    }

    private fun setClickListeners() {
        //todo :set click listener
    }

    private fun navigateToRegister() {
        //todo : navigate to register
    }

    private fun doLogin() {
        //todo : do login process
    }

    private fun isFormValid(): Boolean {
        //todo : create result from email validation and password
        return false
    }

    private fun checkEmailValidation(email: String): Boolean {
        //todo : check email is valid
        return false
    }

    private fun checkPasswordValidation(
        confirmPassword: String,
        textInputLayout: TextInputLayout
    ): Boolean {
        //todo : check password is valid
        return false
    }
}