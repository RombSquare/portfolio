package com.rombsquare.portfolio

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.rombsquare.portfolio.utils.rememberScreenSize

@Composable
fun Section(
    modifier: Modifier,
    color: Color = Color.Black,
    contentColor: Color = Color.White,
    alignment: Alignment = Alignment.Center,
    content: @Composable (() -> Unit)
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .background(color),
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

@Composable
fun Intro() {
    Column {
        Text(
            text = "Volodymyr",
            fontSize = 40.sp,
            color = Color.White,
        )
        Text("Android developer")
    }
}

@Composable
@Preview
fun App() {
    MaterialTheme {
        val scrollState = rememberScrollState()
        val screenSize = rememberScreenSize()

        Column(
            modifier = Modifier
                .background(MaterialTheme.colorScheme.primaryContainer)
                .safeContentPadding()
                .fillMaxSize()
                .verticalScroll(scrollState),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Section(
                modifier = Modifier.size(screenSize),
                color = Color(0xff111111),
            ) {
                Intro()
            }

            Section(
                modifier = Modifier.size(screenSize),
                color = Color.Green,
            ) {
                Text("World")
            }

            Section(
                modifier = Modifier.size(screenSize),
                color = Color.Blue,
            ) {
                Text("Plus")
            }
        }
    }
}