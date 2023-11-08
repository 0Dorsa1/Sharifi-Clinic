package com.example.nazareto


import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.LayoutDirection

import androidx.compose.material.darkColors
import androidx.compose.material.lightColors

private val darkColorPalette = darkColors(
    primary = Color(0xA88E7CB5),
    primaryVariant = Color(0xA88E7CB5),
    secondary = Color(0x7F000000),
    secondaryVariant = Color(0x7F000000),
    background = Color(0xFFFFF9F9),
    surface = Color(0xFFFFF9F9),
    error = Color(0xBFC90000),
    onPrimary = Color(0xFF000000),
    onSecondary = Color.Black,
    onBackground = Color.White,
    onSurface = Color.White,
    onError = Color.Black
)

private val lightColorPalette = lightColors(
    primary = Color.White,
    primaryVariant = Color.LightGray
)

@Composable
fun MyAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Ltr) {
        val colors = if (darkTheme) {
            darkColorPalette
        } else {
            lightColorPalette
        }

        CompositionLocalProvider {
            MaterialTheme(
                colors = colors,
                content = content
            )
        }
    }
}