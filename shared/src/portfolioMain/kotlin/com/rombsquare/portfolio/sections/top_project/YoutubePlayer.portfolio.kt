package com.rombsquare.portfolio.sections.top_project

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.viewinterop.HtmlElementView
import kotlinx.browser.document
import org.w3c.dom.HTMLIFrameElement

@OptIn(ExperimentalComposeUiApi::class)
@Composable
actual fun YoutubePlayer(
    modifier: Modifier,
    videoId: String,
) {
    Box(modifier = modifier) {
        HtmlElementView(
            factory = {
                (document.createElement("iframe") as HTMLIFrameElement).apply {
                    src = "https://www.youtube.com/embed/$videoId"
                    style.width = "100%"
                    style.height = "100%"
                    style.border = "none"
                    setAttribute("allow", "accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture")
                    setAttribute("allowfullscreen", "true")
                }
            },
            modifier = Modifier.fillMaxSize()
        )

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Transparent)
        )
    }
}