package com.example.user.data.repositories

import com.example.user.data.entities.DataUser

interface UserRepository {
    suspend fun fetch(userId: DataUser.Id): Result<DataUser>
    suspend fun rename(userId: DataUser.Id, newName: String): Result<Unit>
}
