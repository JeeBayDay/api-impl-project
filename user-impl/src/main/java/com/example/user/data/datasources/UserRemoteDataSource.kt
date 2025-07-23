package com.example.user.data.datasources

import com.example.user.domain.entities.User

internal interface UserRemoteDataSource {
    suspend fun getUser(userId: User.Id): Result<User>
    suspend fun rename(
        userId: User.Id,
        newName: String
    ): Result<Unit>
}
