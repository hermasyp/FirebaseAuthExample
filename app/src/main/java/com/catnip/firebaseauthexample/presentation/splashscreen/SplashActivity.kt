package com.catnip.firebaseauthexample.presentation.splashscreen

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.catnip.firebaseauthexample.databinding.ActivitySplashBinding
import com.catnip.firebaseauthexample.utils.GenericViewModelFactory

class SplashActivity : AppCompatActivity() {

    private val viewModel: SplashViewModel by viewModels {
        GenericViewModelFactory.create(createViewModel())
    }

    private fun createViewModel(): SplashViewModel {
        return SplashViewModel()
    }

    private val binding: ActivitySplashBinding by lazy {
        ActivitySplashBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        checkIfUserLogin()
    }

    private fun checkIfUserLogin() {
        //todo : check user login
        //if not login yet, navigate to login page
        //if already login, navigate to main
    }


}