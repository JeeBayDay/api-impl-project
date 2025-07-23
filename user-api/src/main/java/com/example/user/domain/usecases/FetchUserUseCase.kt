package com.example.user.domain.usecases

import com.example.user.domain.entities.User

interface FetchUserUseCase {
    suspend operator fun invoke(userId: User.Id): Result<User>
}
