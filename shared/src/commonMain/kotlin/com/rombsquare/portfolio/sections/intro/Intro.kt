package com.rombsquare.portfolio.sections.intro

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rombsquare.portfolio.accentColor
import com.rombsquare.portfolio.utils.rememberScreenSize

@Composable
fun Intro(
    scrollValue: Int,
) {
    val screenSize = rememberScreenSize()

    Column(
        modifier = Modifier
            .size(screenSize)
            .padding(16.dp)
            .graphicsLayer {
                alpha = (1f - scrollValue.toFloat()/350).coerceIn(0f..1f)
            },
        verticalArrangement = Arrangement.Center
    ) {
        var titleWidth by remember { mutableStateOf(0.dp) }
        val density = LocalDensity.current

        Text(
            modifier = Modifier
                .onGloballyPositioned { coordinates ->
                    titleWidth = with(density) { coordinates.size.width.toDp() }
                },
            text = "Hello, it's\nVolodymyr",
            fontWeight = FontWeight.Bold,
            fontSize = 40.sp,
            lineHeight = 44.sp,
        )

        HorizontalDivider(
            modifier = Modifier
                .padding(vertical = 20.dp, horizontal = 20.dp)
                .width(titleWidth - 40.dp),
            thickness = 2.dp,
            color = accentColor.copy(alpha = 0.5f)
        )

        Text(
            text = "I'm native Android developer, build fullstack apps with Jetpack Compose and Firebase. Targeting cross platform development with Kotlin Multiplatform."
        )
    }
}