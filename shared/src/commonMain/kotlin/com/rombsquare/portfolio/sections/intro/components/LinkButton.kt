package com.rombsquare.portfolio.sections.intro.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.OpenInNew
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp

@Composable
fun LinkButton(
    text: String,
    link: String,
    color: Color,
) {
    val uriHandler = LocalUriHandler.current

    TextButton(
        onClick = { uriHandler.openUri(link) }
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = text,
                textDecoration = TextDecoration.Underline
            )
            Spacer(Modifier.width(4.dp))
            Icon(
                modifier = Modifier.size(20.dp),
                imageVector = Icons.AutoMirrored.Default.OpenInNew,
                contentDescription = null,
                tint = color
            )
        }
    }
}