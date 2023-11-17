package com.marcelo.baseapp.navigation

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.marcelo.di.navigation.BaseNavigation
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class BaseImplementation : KoinComponent {
    private val navigation: BaseNavigation by inject()

    @Composable
    fun HomeScreen() {
        Text(
            text = "Home"
        )
    }

    @Composable
    fun InitScreen() {
        Button(onClick = {
            navigation.go()
        }) {
            Text(
                text = "NAVEGAR "
            )
        }
    }
}