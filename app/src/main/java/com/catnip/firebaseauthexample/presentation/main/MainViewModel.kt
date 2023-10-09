package com.catnip.firebaseauthexample.presentation.main

import androidx.lifecycle.ViewModel
import com.catnip.firebaseauthexample.data.repository.UserRepository

/**
Written with love by Muhammad Hermas Yuda Pamungkas
Github : https://github.com/hermasyp
 **/
class MainViewModel(val repo: UserRepository) : ViewModel() {

    fun getCurrentUser() = repo.getCurrentUser()
}