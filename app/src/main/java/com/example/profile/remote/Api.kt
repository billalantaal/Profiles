package com.example.profile.remote

import com.example.profile.domain.model.User
import com.example.profile.remote.response.ApiListResponse
import io.reactivex.Observable
import retrofit2.http.GET

interface Api {
    @GET("users")
    fun fetchUsers(): Observable<ApiListResponse<User>>
}