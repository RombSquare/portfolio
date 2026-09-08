package com.rombsquare.portfolio.sections.top_project.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectHorizontalDragGestures
import androidx.compose.foundation.gestures.scrollBy
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.rombsquare.portfolio.theme.veryDarkGreen
import kotlinx.coroutines.launch
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource

val gradientColors = List(10) { Color.Transparent }
    .plus(veryDarkGreen)

@Composable
fun ScreenshotPager(
    modifier: Modifier,
    screenshots: List<DrawableResource>
) {
    val scope = rememberCoroutineScope()

    Box(
        modifier = modifier,
    ) {
        Row(
            modifier = Modifier.fillMaxWidth()
                .pointerInput(Unit) {
                    detectHorizontalDragGestures { _, dragAmount ->
                        scope.launch {
                            scrollState.scrollBy(-dragAmount)
                        }
                    }
                },
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Spacer(Modifier.size(8.dp))
            screenshots.forEach { screenshot ->
                Image(
                    modifier = Modifier
                        .height(600.dp)
                        .clip(RoundedCornerShape(16.dp)),
                    painter = painterResource(screenshot),
                    contentDescription = null,
                    contentScale = ContentScale.FillHeight
                )
            }
            Spacer(Modifier.size(8.dp))
        }

        if (scrollState.canScrollBackward) {
            Box(
                modifier = Modifier
                    .matchParentSize()
                    .width(24.dp)
                    .background(
                        Brush.horizontalGradient(
                            colors = gradientColors.reversed()
                        )
                    )
                    .align(Alignment.CenterStart)
            )
        }

        if (scrollState.canScrollForward) {
            Box(
                modifier = Modifier
                    .matchParentSize()
                    .width(24.dp)
                    .background(
                        Brush.horizontalGradient(
                            colors = gradientColors
                        )
                    )
                    .align(Alignment.CenterEnd)
            )
        }
    }
}