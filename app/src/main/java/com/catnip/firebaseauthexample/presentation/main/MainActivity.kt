package com.catnip.firebaseauthexample.presentation.main

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.catnip.firebaseauthexample.databinding.ActivityMainBinding
import com.catnip.firebaseauthexample.utils.GenericViewModelFactory

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private val viewModel: MainViewModel by viewModels {
        GenericViewModelFactory.create(createViewModel())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        showUserData()
    }

    private fun showUserData() {
        //todo : show profile data
    }

    private fun createViewModel(): MainViewModel {
        return MainViewModel()
    }
}