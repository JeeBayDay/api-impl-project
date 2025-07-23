package com.example.user.data.entities

// Not sure if needed but since this module does not have access to the domain layer
// we need to define a data class here as well.
data class DataUser(
    val id: Id,
    val name: String,
    val email: String,
) {
    @JvmInline
    value class Id(val value: String)
}
