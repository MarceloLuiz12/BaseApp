package com.marcelo.di.modules

import com.marcelo.di.navigation.BaseNavigation
import com.marcelo.di.navigation.NavigationImpl
import com.marcelo.di.utils.NavigationManager
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import org.koin.dsl.module

val navigationModule = module {
    single {
        NavigationManager(
            CoroutineScope(
                SupervisorJob() + Dispatchers.Main
            )
        )
    }

    single<BaseNavigation> {
        NavigationImpl(get())
    }
}