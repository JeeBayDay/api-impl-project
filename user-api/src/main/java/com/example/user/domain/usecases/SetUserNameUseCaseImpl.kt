package com.example.user.domain.usecases

import com.example.platform.any_tool.StringUtils
import com.example.user.data.entities.DataUser
import com.example.user.data.repositories.UserRepository
import com.example.user.domain.entities.User

internal class SetUserNameUseCaseImpl(
    private val userRepository: UserRepository,
) : SetUserNameUseCase {
    override suspend fun invoke(userId: User.Id, newName: String): Result<Unit> {
        val capitalizedName = newName
            .split(' ')
            .joinToString(" ") { StringUtils.capitalize(it) }
        return userRepository.rename(DataUser.Id(userId.value), capitalizedName)
    }
}
