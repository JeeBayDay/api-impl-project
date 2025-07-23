package com.example.user.domain.entities

data class User(
    val id: Id,
    val name: String,
    val email: String,
) {
    @JvmInline
    value class Id(val value: String)
}
