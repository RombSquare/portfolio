package com.rombsquare.portfolio.sections.top_project.components

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.rombsquare.portfolio.theme.darkerBlue
import com.rombsquare.portfolio.theme.normalBlue

@Composable
fun FlippableSkillCard(
    title: String,
    descr: String
) {
    var isFlipped by remember { mutableStateOf(false) }

    val rotation by animateFloatAsState(
        targetValue = if (isFlipped) 180f else 0f,
        animationSpec = tween(durationMillis = 800),
        label = "cardFlip"
    )

    ElevatedCard(
        modifier = Modifier
            .width(160.dp)
            .aspectRatio(2.5f)
            .graphicsLayer {
                rotationY = rotation
                cameraDistance = 8f * density
            }
            .clickable(
                onClick = {
                    isFlipped = !isFlipped
                }
            ),
        shape = RectangleShape,
        colors = CardDefaults.cardColors(
            containerColor = if (rotation > 90f) normalBlue else darkerBlue,
            contentColor = Color.White.copy(0.8f),
        ),
        elevation = CardDefaults.elevatedCardElevation(defaultElevation = 12.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp),
            contentAlignment = Alignment.Center
        ) {
            if (rotation <= 90f) {
                Text(
                    text = title,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold,
                )
            } else {
                Text(
                    modifier = Modifier.graphicsLayer { rotationY = 180f },
                    text = descr,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold,
                )
            }
        }

    }
}