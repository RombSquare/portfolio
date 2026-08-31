package com.rombsquare.portfolio

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Section(
    modifier: Modifier,
    color: Color = Color.Transparent,
    contentColor: Color = Color.White,
    alignment: Alignment = Alignment.Center,
    content: @Composable (() -> Unit)
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(color)
            .shadow(0.dp)
            .then(modifier),
        contentAlignment = alignment,
    ) {
        Surface(
            color = Color.Transparent,
            contentColor = contentColor,
        ) {
            content()
        }
    }
}