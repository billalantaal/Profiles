package com.example.profile.domain.repository

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import com.example.profile.domain.model.User
import com.example.profile.remote.Api
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class UserRepository {
    private lateinit var api: Api

    fun getUser(userId: String): LiveData<User> {
        val data = MutableLiveData<User>()
        api.getUser(userId).enqueue(object : Callback<User> {

            override fun onResponse(call: Call<User>, response: Response<User>) {
                data.setValue(response.body())
            }

            override fun onFailure(call: Call<User>, t: Throwable) {
            }


        })
        return data
    }
}