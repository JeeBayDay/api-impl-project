package com.example.user.data.datasources

import com.example.platform.any_tool.StringUtils
import com.example.user.domain.entities.User

internal class UserRemoteDataSourceImpl : UserRemoteDataSource {
    override suspend fun getUser(userId: User.Id): Result<User> {
        return Result.success(
            User(
                id = userId,
                name = "John Doe",
                email = StringUtils.toLowerCase("JohnDoe@johndoe.com")
            )
        )
    }

    override suspend fun rename(userId: User.Id, newName: String): Result<Unit> {
        return Result.success(Unit)
    }
}
