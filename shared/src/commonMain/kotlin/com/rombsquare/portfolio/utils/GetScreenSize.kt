package com.rombsquare.portfolio.utils

import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalWindowInfo
import androidx.compose.ui.unit.DpSize

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun rememberScreenSize(): DpSize {
    val windowInfo = LocalWindowInfo.current
    val density = LocalDensity.current

    return with(density) {
        val widthDp = windowInfo.containerSize.width.toDp()
        val heightDp = windowInfo.containerSize.height.toDp()
        DpSize(widthDp, heightDp)
    }
}