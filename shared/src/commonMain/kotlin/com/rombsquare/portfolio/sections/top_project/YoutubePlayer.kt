package com.rombsquare.portfolio.sections.top_project

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
expect fun YoutubePlayer(
    modifier: Modifier = Modifier,
    videoId: String,
)