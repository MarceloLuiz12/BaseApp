package com.marcelo.baseapp.ui_main

import android.app.Application
import com.marcelo.di.modules.navigationModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class BaseApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            modules(
                listOf(
                    navigationModule
                )
            )
            androidContext(applicationContext)
        }
    }
}