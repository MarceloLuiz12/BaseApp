package com.marcelo.baseapp.navigation

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.marcelo.baseapp.BaseNavigation
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class BaseViewModel : KoinComponent {
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