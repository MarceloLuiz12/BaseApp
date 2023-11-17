package com.marcelo.di.navigation

import com.marcelo.di.utils.NavigationManager

class NavigationImpl(
    private val navigationManager: NavigationManager
): BaseNavigation {
    override fun go() {
        navigationManager.navigate(
            route = "home"
        )
    }
}