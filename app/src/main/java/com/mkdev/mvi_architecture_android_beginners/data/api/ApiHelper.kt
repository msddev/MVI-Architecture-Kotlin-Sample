package com.mkdev.mvi_architecture_android_beginners.data.api

import com.mkdev.mvi_architecture_android_beginners.data.model.User

interface ApiHelper {
    suspend fun getUsers(): List<User>
}