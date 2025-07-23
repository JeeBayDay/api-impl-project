package com.example.myfeature.presenter.di

import com.example.myfeature.presenter.viewmodel.MyFeatureViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val myFeatureModule = module {
    viewModel { MyFeatureViewModel(get()) }
}
