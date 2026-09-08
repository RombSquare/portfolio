package com.rombsquare.portfolio.sections.contact.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextLinkStyles
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withLink
import androidx.compose.ui.unit.sp
import com.rombsquare.portfolio.theme.greenishWhite

@Composable
fun TextWithLinks() {
    val text = buildAnnotatedString {

        append("Developed by RombSquare (Volodymyr Lavrentiev). Icons by ")

        val linkAnnotation = LinkAnnotation.Url(
            url = "https://icons8.com",
            styles = TextLinkStyles(
                style = SpanStyle(
                    color = greenishWhite,
                    textDecoration = TextDecoration.Underline
                )
            )
        )

        withLink(linkAnnotation) {
            append("Icons8")
        }
    }

    Text(
        text = text,
        fontSize = 14.sp,
        color = greenishWhite.copy(alpha = 0.75f),
        lineHeight = 16.sp
    )
}