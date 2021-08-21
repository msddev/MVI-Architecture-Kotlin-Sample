package com.mkdev.mvi_architecture_android_beginners.data.api

import com.mkdev.mvi_architecture_android_beginners.data.model.User
import retrofit2.http.GET

interface ApiService {

    @GET("users")
    suspend fun getUsers(): List<User>
}