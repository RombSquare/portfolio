package com.rombsquare.portfolio.utils

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import org.jetbrains.compose.resources.Font
import portfolio.shared.generated.resources.Res
import portfolio.shared.generated.resources.allFontResources
import portfolio.shared.generated.resources.orbitron
import portfolio.shared.generated.resources.orbitron_black

@Composable
fun getOrbitronFontFamily() =
    FontFamily(
        Font(
            weight = FontWeight.Black,
            resource = Res.font.orbitron_black,
        ),

        Font(
            weight = FontWeight.Normal,
            resource = Res.font.orbitron
        )
    )
