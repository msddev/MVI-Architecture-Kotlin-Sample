package com.mkdev.mvi_architecture_android_beginners.data.repository

import com.mkdev.mvi_architecture_android_beginners.data.api.ApiHelper

class MainRepository(private val apiHelper: ApiHelper) {
    suspend fun getUsers() = apiHelper.getUsers()
}