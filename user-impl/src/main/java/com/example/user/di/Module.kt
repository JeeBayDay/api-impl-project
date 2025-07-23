package com.example.user.di

import com.example.user.data.datasources.UserRemoteDataSource
import com.example.user.data.datasources.UserRemoteDataSourceImpl
import com.example.user.data.repositories.UserRepository
import com.example.user.data.repositories.UserRepositoryImpl
import org.koin.dsl.module

val userDataModule = module {
    single { UserRemoteDataSourceImpl() as UserRemoteDataSource }
    single { UserRepositoryImpl(get()) as UserRepository }
}
