package com.havan.di

import com.havan.feature_auth.login.LoginNavigation
import com.havan.navigation.LoginNavigationImpl
import com.havan.utils.NavigationManager
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

    single<LoginNavigation> {
        LoginNavigationImpl(get())
    }
}