package com.rombsquare.portfolio.sections.intro

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rombsquare.portfolio.sections.intro.components.LinkButton
import com.rombsquare.portfolio.theme.greenishWhite
import com.rombsquare.portfolio.theme.normalGreen

@Composable
fun Intro(
    scrollValue: Int,
) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .graphicsLayer {
                    alpha = (1f - scrollValue.toFloat()/350).coerceIn(0f..1f)
                }
                .align(Alignment.Center),
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
                color = normalGreen.copy(alpha = 0.5f)
            )

            Text(
                text = "I'm native Android developer, build fullstack apps with Jetpack Compose and Firebase. Targeting cross platform development with Kotlin Multiplatform."
            )

            Row {
                LinkButton(
                    text = "GitHub",
                    link = "https://github.com/RombSquare/",
                    color = greenishWhite
                )

                Spacer(Modifier.width(12.dp))

                LinkButton(
                    text = "LinkedIn",
                    link = "https://www.linkedin.com/in/volodymyr-lavrentiev-b6316334b/",
                    color = greenishWhite
                )
            }

        }

        Text(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .graphicsLayer {
                    alpha = (1f - scrollValue.toFloat()/50f).coerceIn(0f..1f)
                },
            text = "s c r o l l    d o w n",
            fontWeight = FontWeight.Bold,
            color = greenishWhite.copy(alpha = 0.5f)
        )
    }
}