package com.rombsquare.portfolio

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.rombsquare.portfolio.sections.contact.Contact
import com.rombsquare.portfolio.sections.intro.Intro
import com.rombsquare.portfolio.sections.skills.Skills
import com.rombsquare.portfolio.sections.top_project.TopProject
import com.rombsquare.portfolio.utils.VideoPlayer
import com.rombsquare.portfolio.theme.SolocardsTheme
import com.rombsquare.portfolio.utils.rememberScreenSize
import com.rombsquare.portfolio.theme.greenishBlack
import com.rombsquare.portfolio.theme.greenishWhite
import com.rombsquare.portfolio.theme.veryDarkGreen

@Composable
fun Section(
    minHeight: Dp = Dp.Unspecified,
    maxHeight: Dp = Dp.Unspecified,
    color: Color,
    content: @Composable (() -> Unit)
) {
    Surface(
        modifier = Modifier
            .heightIn(minHeight, maxHeight),
        color = color,
    ) {
        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.TopCenter
        ) {
            Box(
                modifier = Modifier
                    .widthIn(max = 800.dp)
            ) {
                content()
            }
        }
    }
}

@Suppress("FrequentlyChangingValue")
@Composable
@Preview
fun App() {
    SolocardsTheme {
        val scrollState = rememberScrollState()
        val screenHeight = rememberScreenSize().height
        var currentVideoId by remember { mutableStateOf<String?>(null) }

        Surface(
            modifier = Modifier
                .fillMaxSize()
                .safeContentPadding()
                .shadow(0.dp),
            color = greenishBlack,
            contentColor = greenishWhite
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(scrollState),
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.Center
            ) {
                Section(
                    minHeight = screenHeight,
                    maxHeight = screenHeight,
                    color = greenishBlack,
                ) {
                    Intro(scrollState.value)
                }

                Section(color = veryDarkGreen) {
                    TopProject(
                        onVideo = { currentVideoId = it }
                    )
                }

                Section(color = greenishBlack) { Skills() }
                Section(color = veryDarkGreen) { Contact() }
            }
        }

        currentVideoId?.let {
            VideoPlayer(
                videoId = it,
                onClose = { currentVideoId = null }
            )
        }
    }
}