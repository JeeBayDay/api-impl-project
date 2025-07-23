package com.example.user.data.repositories

import com.example.user.data.datasources.UserRemoteDataSource
import com.example.user.domain.entities.User

internal class UserRepository(
    private val userRemoteDataSource: UserRemoteDataSource
) {
    suspend fun fetch(
        userId: User.Id
    ) = userRemoteDataSource.getUser(userId)

    suspend fun rename(
        userId: User.Id,
        newName: String
    ): Result<Unit> = userRemoteDataSource.rename(
        userId = userId,
        newName = newName
    )
}
