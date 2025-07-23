package com.example.myfeature.presenter.viewmodel

import androidx.lifecycle.ViewModel
import com.example.user.domain.entities.User
import com.example.user.domain.usecases.FetchUserUseCase
import kotlinx.coroutines.flow.flow

class MyFeatureViewModel(
    private val fetchUserUseCase: FetchUserUseCase
) : ViewModel() {

    val myUser = flow {
        emit(fetchUserUseCase(User.Id("12345")).getOrNull())
    }
}
