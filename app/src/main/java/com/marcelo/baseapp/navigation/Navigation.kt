package com.marcelo.baseapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun Navigation(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = "init"
    ) {
        composable(
            route = "init"
        ) {
            BaseImplementation().InitScreen()
        }
        composable(
            route = "home"
        ) {
            BaseImplementation().HomeScreen()
        }
    }
}