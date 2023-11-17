package com.havan.havanconecta.navigation

import UpdateVersionScreen
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.havan.base_ui.screens.http_error.GenericErrorScreen
import com.havan.feature_auth.biometric.OnBoardingBiometricScreen
import com.havan.feature_auth.loading.LoadingAuthenticationScreen
import com.havan.feature_auth.login.LoginScreen
import com.havan.feature_auth.login_with_user.LoginWithUserScreen
import com.havan.havanconecta.utils.Constants.Navigation.ERROR
import com.havan.havanconecta.utils.Constants.Navigation.HOME_NAVIGATION
import com.havan.havanconecta.utils.Constants.Navigation.LOADING_SCREEN
import com.havan.havanconecta.utils.Constants.Navigation.LOGIN_NAVIGATION
import com.havan.havanconecta.utils.Constants.Navigation.UPDATE_VERSION_SCREEN
import com.havan.havanconecta.utils.Constants.Navigation.LOGIN_NAVIGATION_WITH_USER
import com.havan.havanconecta.utils.Constants.Navigation.ONBOARDING_BIOMETRY
import com.havan.havanconecta.webview.WebViewScreen

@Composable
fun Navigation(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = LOADING_SCREEN
    ) {
        composable(
            route = LOGIN_NAVIGATION
        ) {
            LoginScreen()
        }
        composable(
            route = "$HOME_NAVIGATION/{url}",
            arguments = listOf(
                navArgument("url")
                {
                    type = NavType.StringType
                }
            )
        ) { entry ->
            val url = entry.arguments?.getString("url").orEmpty()
            WebViewScreen(url)
        }

        composable(
            route = "$ONBOARDING_BIOMETRY/{url}",
            arguments = listOf(
                navArgument("url")
                {
                    type = NavType.StringType
                }
            )
        ) { entry ->
            val url = entry.arguments?.getString("url").orEmpty()
            OnBoardingBiometricScreen(url)
        }

        composable(
            route = ERROR
        ) {
            GenericErrorScreen(navController)
        }

        composable(
            route = LOADING_SCREEN
        ) {
            LoadingAuthenticationScreen()
        }

        composable(
            route = UPDATE_VERSION_SCREEN
        ) {
            UpdateVersionScreen()
        }

        composable(
            route = LOGIN_NAVIGATION_WITH_USER
        ) {
            LoginWithUserScreen()
        }
    }
}