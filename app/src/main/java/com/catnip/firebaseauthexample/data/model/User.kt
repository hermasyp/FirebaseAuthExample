package com.catnip.firebaseauthexample.data.model

import com.google.firebase.auth.FirebaseUser

/**
Written with love by Muhammad Hermas Yuda Pamungkas
Github : https://github.com/hermasyp
 **/
data class User(
    val fullName: String,
    val email: String
)

fun FirebaseUser?.toUser(): User? = if (this != null) User(
    fullName = this.displayName.orEmpty(),
    email = this.email.orEmpty(),
) else null