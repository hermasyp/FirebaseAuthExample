package com.catnip.firebaseauthexample.presentation.register

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.catnip.firebaseauthexample.databinding.ActivityRegisterBinding
import com.catnip.firebaseauthexample.utils.GenericViewModelFactory
import com.google.android.material.textfield.TextInputLayout

class RegisterActivity : AppCompatActivity() {
    private val binding: ActivityRegisterBinding by lazy {
        ActivityRegisterBinding.inflate(layoutInflater)
    }
    private val viewModel: RegisterViewModel by viewModels {
        GenericViewModelFactory.create(createViewModel())
    }

    private fun createViewModel(): RegisterViewModel {
        return RegisterViewModel()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setupForm()
        setClickListeners()
        observeResult()
    }

    private fun setClickListeners() {
        //todo : setup click listener
    }

    private fun navigateToLogin() {
        //todo : navigate to login
    }

    private fun doRegister() {
        //todo : check form first, if pass then register
    }

    private fun observeResult() {
        //todo : observe result register here
    }

    private fun navigateToMain() {
        //todo : navigate to Main
    }


    private fun setupForm() {
        //todo : setup form
    }

    private fun isFormValid(): Boolean {
        //todo : check form validation
        return false
    }

    private fun checkNameValidation(fullName: String): Boolean {
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

    private fun checkPwdAndConfirmPwd(password: String, confirmPassword: String): Boolean {
        //todo : check form validation
        return false
    }
}