package com.example.user.domain.agregatordi

import com.example.user.di.userDataModule
import com.example.user.domain.usecases.FetchUserUseCase
import com.example.user.domain.usecases.FetchUserUseCaseImpl
import com.example.user.domain.usecases.SetUserNameUseCase
import com.example.user.domain.usecases.SetUserNameUseCaseImpl
import org.koin.dsl.module

val userAgregatorModule = module {
    includes(userDataModule)
    factory { FetchUserUseCaseImpl(get()) as FetchUserUseCase }
    factory { SetUserNameUseCaseImpl(get()) as SetUserNameUseCase }
}
