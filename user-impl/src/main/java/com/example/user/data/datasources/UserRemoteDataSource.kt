package com.example.user.data.datasources

import com.example.user.data.entities.DataUser

internal interface UserRemoteDataSource {
    suspend fun getUser(userId: DataUser.Id): Result<DataUser>
    suspend fun rename(
        userId: DataUser.Id,
        newName: String
    ): Result<Unit>
}
