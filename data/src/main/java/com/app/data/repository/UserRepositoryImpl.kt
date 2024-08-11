package com.app.data.repository

import android.content.Context
import android.content.SharedPreferences
import android.util.Log
import com.app.domain.model.UserModel
import com.app.domain.model.UserSingInParam
import com.app.domain.repository.UserRepository
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.PhoneAuthProvider
import com.google.firebase.firestore.firestore
import java.util.Locale
import java.util.concurrent.TimeUnit

class UserRepositoryImpl(context : Context): UserRepository {

    var auth = FirebaseAuth.getInstance()
    private var storedVerificationId: String? = null
    private lateinit var resendToken: PhoneAuthProvider.ForceResendingToken

    val sharedPreferences : SharedPreferences = context.getSharedPreferences("pref", Context.MODE_PRIVATE)

    override fun SingUpUser(userModel : UserModel){
    }

    override fun SingInUser(userSimgInParam: UserSingInParam){
        auth.setLanguageCode(Locale.getDefault().language)

    }

}