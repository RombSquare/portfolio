package com.rombsquare.portfolio.utils

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.rombsquare.portfolio.sections.top_project.YoutubePlayer

@Composable
fun VideoPlayer(
    videoId: String,
    onClose: () -> Unit,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black.copy(alpha = 0.9f)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextButton(
            onClick = onClose
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Icon(
                    modifier = Modifier.size(36.dp),
                    imageVector = Icons.Default.Close,
                    contentDescription = null,
                    tint = Color(0xFFEE7E7F)
                )

                Spacer(Modifier.height(8.dp))

                Text(
                    text = "Close",
                    color = Color(0xFFEE7E7F)
                )
            }

        }

        Box(
            modifier = Modifier
                .widthIn(max = 400.dp)
        ) {
            YoutubePlayer(
                modifier = Modifier
                    .fillMaxHeight()
                    .aspectRatio(9f / 16f),
                videoId = videoId
            )
        }
    }
}