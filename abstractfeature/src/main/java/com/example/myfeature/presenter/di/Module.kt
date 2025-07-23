package com.example.myfeature.presenter.di

import com.example.myfeature.presenter.viewmodel.MyFeatureViewModel
import com.example.user.domain.agregatordi.userAgregatorModule
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val myFeatureModule = module {
    includes(userAgregatorModule)
    viewModel { MyFeatureViewModel(get()) }
}
