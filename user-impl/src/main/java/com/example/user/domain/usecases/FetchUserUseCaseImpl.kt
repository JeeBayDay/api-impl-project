package com.example.user.domain.usecases

import com.example.user.data.repositories.UserRepository
import com.example.user.domain.entities.User

internal class FetchUserUseCaseImpl(
    private val userRepository: UserRepository
) : FetchUserUseCase {
    override suspend fun invoke(
        userId: User.Id
    ): Result<User> = userRepository.fetch(userId)
}
