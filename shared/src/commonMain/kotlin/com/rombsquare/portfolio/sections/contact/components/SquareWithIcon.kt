package com.rombsquare.portfolio.sections.contact.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp
import com.rombsquare.portfolio.theme.greenishWhite

@Composable
fun SquareWithIcon(
    onClick: () -> Unit,
    icon: Painter,
    contentDescription: String,
) {
    Box(
        modifier = Modifier
            .size(44.dp)
            .background(greenishWhite.copy(alpha = 0.15f))
            .clickable(
                onClick = onClick
            ),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            modifier = Modifier.size(32.dp),
            painter = icon,
            contentDescription = contentDescription,
            tint = greenishWhite
        )
    }
}