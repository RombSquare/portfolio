package com.rombsquare.portfolio

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rombsquare.portfolio.sections.contact.Contact
import com.rombsquare.portfolio.sections.intro.Intro
import com.rombsquare.portfolio.sections.skills.Skills
import com.rombsquare.portfolio.sections.top_project.TopProject
import com.rombsquare.portfolio.theme.SolocardsTheme
import com.rombsquare.portfolio.utils.rememberScreenSize
import com.rombsquare.portfolio.theme.greenishBlack
import com.rombsquare.portfolio.theme.greenishWhite

// ./gradlew generateComposeResClass

@Suppress("FrequentlyChangingValue")
@Composable
@Preview
fun App() {
    SolocardsTheme {
        val scrollState = rememberScrollState(21000)
        val screenSize = rememberScreenSize()

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
                Intro(scrollState.value)
                TopProject()
                Skills()
                Contact()
            }
        }
    }
}