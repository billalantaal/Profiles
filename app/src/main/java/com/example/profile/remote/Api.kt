package com.example.profile.remote

import com.example.profile.domain.model.User
import com.example.profile.remote.response.ApiListResponse
import io.reactivex.Observable
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path



interface Api {
    @GET("users")
    fun registerUser(): Observable<ApiListResponse<User>>

    @GET("/finduser/{user}/dev")
    fun getUser(@Path("user") userId:String): Call<User>

}