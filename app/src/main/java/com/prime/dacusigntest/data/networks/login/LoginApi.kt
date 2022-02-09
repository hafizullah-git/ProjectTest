package com.prime.dacusigntest.data.networks.login

import com.prime.dacusigntest.data.networks.login.model.Login
import retrofit2.http.Body
import retrofit2.http.POST

interface LoginApi {
    @POST("login")
    suspend fun login(@Body walletName : Login): Login
}