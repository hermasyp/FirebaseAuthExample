package com.catnip.firebaseauthexample.presentation.splashscreen

import androidx.lifecycle.ViewModel
import com.catnip.firebaseauthexample.data.repository.UserRepository

/**
Written with love by Muhammad Hermas Yuda Pamungkas
Github : https://github.com/hermasyp
 **/
class SplashViewModel(private val repository: UserRepository) : ViewModel() {

    fun isUserLoggedIn() = repository.isLoggedIn()

}