package com.example.user.data.repositories

import com.example.user.data.datasources.UserRemoteDataSource
import com.example.user.data.entities.DataUser

internal class UserRepositoryImpl(
    private val userRemoteDataSource: UserRemoteDataSource
) : UserRepository {
    override suspend fun fetch(
        userId: DataUser.Id
    ) = userRemoteDataSource.getUser(userId)

    override suspend fun rename(
        userId: DataUser.Id,
        newName: String
    ): Result<Unit> = userRemoteDataSource.rename(
        userId = userId,
        newName = newName
    )
}
