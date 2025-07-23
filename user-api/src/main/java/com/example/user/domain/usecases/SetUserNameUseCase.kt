package com.example.user.domain.usecases

import com.example.user.domain.entities.User

interface SetUserNameUseCase {
    suspend operator fun invoke(userId: User.Id, newName: String): Result<Unit>
}
