package com.rombsquare.portfolio.sections.top_project.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import kotlin.jvm.JvmName

@JvmName("RectangularTextBlockString")
@Composable
fun RectangularTextBlock(
    modifier: Modifier = Modifier,
    color: Color,
    titles: List<AnnotatedString>,
    texts: List<AnnotatedString>
) {
    val titlesWithTexts by remember { mutableStateOf(
        titles.zip(texts)
    ) }

    Column(
        modifier = modifier
            .border(2.dp, color.copy(alpha = 0.3f), RectangleShape),
    ) {
        titlesWithTexts.forEachIndexed { i, (title, text) ->
            Text(
                modifier = Modifier.padding(top = 8.dp, bottom = 0.dp, start = 8.dp, end = 8.dp),
                text = "$title",
                fontWeight = FontWeight.Bold,
                color = color,
            )

            Text(
                modifier = Modifier.padding(top = 0.dp, bottom = 8.dp, start = 8.dp, end = 8.dp),
                text = text
            )

            if (i != titles.lastIndex) {
                HorizontalDivider(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 2.dp),
                    thickness = 2.dp,
                    color = color.copy(alpha = 0.3f)
                )
            }
        }
    }
}

@Composable
fun RectangularTextBlock(
    modifier: Modifier = Modifier,
    color: Color,
    titles: List<String>,
    texts: List<String>
) {
    RectangularTextBlock(
        modifier = modifier,
        color = color,
        titles = titles.map { AnnotatedString(it) },
        texts = texts.map { AnnotatedString(it) }
    )
}