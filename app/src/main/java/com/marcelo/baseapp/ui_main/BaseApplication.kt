package com.havan.havanconecta.ui

import android.app.Application
import com.havan.di.dataLocalModules
import com.havan.di.dataModules
import com.havan.di.dataRemoteModules
import com.havan.di.domainModules
import com.havan.di.navigationModule
import com.havan.di.presentationModule
import com.havan.di.utilModule
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
                    dataModules,
                    domainModules,
                    presentationModule,
                    dataRemoteModules,
                    dataLocalModules,
                    navigationModule,
                    utilModule
                )
            )
            androidContext(applicationContext)
        }
    }
}