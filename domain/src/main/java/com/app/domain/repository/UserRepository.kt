package com.app.domain.repository

import com.app.domain.model.UserModel
import com.app.domain.model.UserSingInParam

interface UserRepository {

    fun SingUpUser(userModel : UserModel)
    fun SingInUser(userSimgInParam: UserSingInParam)
}