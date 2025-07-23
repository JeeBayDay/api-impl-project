package com.example.user.data.datasources

import com.example.platform.any_tool.StringUtils
import com.example.user.data.entities.DataUser

internal class UserRemoteDataSourceImpl : UserRemoteDataSource {
    override suspend fun getUser(userId: DataUser.Id): Result<DataUser> {
        return Result.success(
            DataUser(
                id = userId,
                name = "John Doe",
                email = StringUtils.toLowerCase("JohnDoe@johndoe.com")
            )
        )
    }

    override suspend fun rename(userId: DataUser.Id, newName: String): Result<Unit> {
        return Result.success(Unit)
    }
}
