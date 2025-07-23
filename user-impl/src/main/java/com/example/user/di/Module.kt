package com.example.user.di

import com.example.user.data.datasources.UserRemoteDataSource
import com.example.user.data.datasources.UserRemoteDataSourceImpl
import com.example.user.data.repositories.UserRepository
import com.example.user.domain.usecases.FetchUserUseCase
import com.example.user.domain.usecases.FetchUserUseCaseImpl
import com.example.user.domain.usecases.SetUserNameUseCase
import com.example.user.domain.usecases.SetUserNameUseCaseImpl
import org.koin.dsl.module

val userModule = module {
    single { UserRemoteDataSourceImpl() as UserRemoteDataSource }
    single { UserRepository(get()) }

    factory { FetchUserUseCaseImpl(get()) as FetchUserUseCase }
    factory { SetUserNameUseCaseImpl(get()) as SetUserNameUseCase }
}
