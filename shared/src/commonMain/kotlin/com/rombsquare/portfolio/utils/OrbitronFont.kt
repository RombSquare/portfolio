package com.rombsquare.portfolio.utils

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import org.jetbrains.compose.resources.Font
import portfolio.shared.generated.resources.Res
import portfolio.shared.generated.resources.allFontResources

@Composable
fun getOrbitronFontFamily(): FontFamily? {
    return Res.allFontResources["orbitron"]?.let { font ->
        FontFamily(
            Font(
                resource = font,
            )
        )
    }

}