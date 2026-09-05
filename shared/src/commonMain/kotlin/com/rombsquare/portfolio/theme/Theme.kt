package com.rombsquare.portfolio.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable

private val DarkColorScheme = darkColorScheme(
    primary = lightGreen,
    secondary = lightYellowGreen,
    tertiary = lightBlue,
    primaryContainer = darkGreen,
    secondaryContainer = darkYellowGreen,
    tertiaryContainer = darkBlue,
    surface = greenishBlack,
    surfaceContainer = darkGreen,
    surfaceContainerHigh = veryDarkGreen,
    surfaceVariant = darkerGreen,
    background = greenishBlack,
    outline = lightGreen,
    outlineVariant = lightGreen,

    onPrimary = darkGreen,
    onSecondary = darkYellowGreen,
    onTertiary = darkBlue,
    onPrimaryContainer = lightGreen,
    onSecondaryContainer = lightYellowGreen,
    onTertiaryContainer = lightBlue,
    onSurface = greenishWhite,
    onBackground = greenishWhite,
    onSurfaceVariant = lightGreen,
)

@Composable
fun SolocardsTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = DarkColorScheme,
        typography = Typography,
        content = content
    )
}