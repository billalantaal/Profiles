package com.example.profile.viewModel

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.ViewModel;
import com.example.profile.domain.model.User
import com.example.profile.domain.repository.UserRepository

class MainViewModel (userRepository: UserRepository): ViewModel() {

    private lateinit var user: LiveData<User>
    private var userRepo: UserRepository = userRepository

    fun callApiForGetUser(userId:String) {
/*        if (this.user != null) {
            // ViewModel is created on a per-Fragment basis, so the userId
            // doesn't change.
            return
        }*/
        user=userRepo.getUser(userId)
    }

}
