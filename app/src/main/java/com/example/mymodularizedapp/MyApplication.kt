package com.example.mymodularizedapp

import android.app.Application
import com.example.myfeature.presenter.di.myFeatureModule
import com.example.user.di.userModule
import org.koin.core.context.startKoin

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(
                listOf(
                    userModule,
                    myFeatureModule
                )
            )

        }
    }
}
