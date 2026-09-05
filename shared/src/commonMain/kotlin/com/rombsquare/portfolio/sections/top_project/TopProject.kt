package com.rombsquare.portfolio.sections.top_project

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rombsquare.portfolio.accentColor
import com.rombsquare.portfolio.theme.greenishWhite
import com.rombsquare.portfolio.theme.normalBlue
import com.rombsquare.portfolio.theme.normalBlueGreen
import com.rombsquare.portfolio.theme.normalCyanGreen
import com.rombsquare.portfolio.theme.normalGreen
import com.rombsquare.portfolio.theme.veryDarkGreen
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource
import portfolio.shared.generated.resources.Res
import portfolio.shared.generated.resources.solocards_cloud_storage
import portfolio.shared.generated.resources.solocards_editor
import portfolio.shared.generated.resources.solocards_icon
import portfolio.shared.generated.resources.solocards_menu
import portfolio.shared.generated.resources.solocards_modes
import portfolio.shared.generated.resources.solocards_scripting
import portfolio.shared.generated.resources.solocards_sections
import portfolio.shared.generated.resources.solocards_tags
import kotlin.jvm.JvmName

val screenshots = listOf(
    Res.drawable.solocards_menu,
    Res.drawable.solocards_tags,
    Res.drawable.solocards_modes,
    Res.drawable.solocards_editor,
    Res.drawable.solocards_cloud_storage,
    Res.drawable.solocards_scripting,
    Res.drawable.solocards_sections
)

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


@Composable
fun ScreenshotPager(
    modifier: Modifier,
    screenshots: List<DrawableResource>
) {
    val scrollState = rememberScrollState()

    Row(
        modifier = modifier
            .horizontalScroll(scrollState),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Spacer(Modifier.size(8.dp))
        screenshots.forEach { screenshot ->
            Image(
                modifier = Modifier
                    .height(600.dp)
                    .clip(RoundedCornerShape(16.dp)),
                painter = painterResource(screenshot),
                contentDescription = null,
                contentScale = ContentScale.Fit
            )
        }
        Spacer(Modifier.size(8.dp))
    }
}

@Composable
fun TopProject() {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Card(
            modifier = Modifier
                .fillMaxHeight()
                .padding(top = 60.dp)
                .shadow(0.dp)
                .align(Alignment.BottomCenter),
            colors = CardDefaults.cardColors(
                containerColor = veryDarkGreen
            ),
            shape = RoundedCornerShape(
                topStart = 0.dp,
                topEnd = 0.dp,
                bottomStart = 0.dp,
                bottomEnd = 0.dp
            )
        ) {
            Column(
                modifier = Modifier
                    .padding(bottom = 20.dp),
            ) {
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(4.dp),
                    text = "T O P     P R O J E C T",
                    fontSize = 16.sp,
                    color = greenishWhite.copy(0.4f),
                    textAlign = TextAlign.Right,
                    fontWeight = FontWeight.Black,
                )

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 80.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Image(
                        modifier = Modifier
                            .size(52.dp)
                            .clip(RoundedCornerShape(8.dp)),
                        painter = painterResource(Res.drawable.solocards_icon),
                        contentDescription = null
                    )

                    Spacer(Modifier.width(16.dp))

                    Text(
                        modifier = Modifier,
                        text = "S O L O C A R D S",
                        fontSize = 28.sp,
                        color = greenishWhite,
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Black,
                    )
                }



                Box(
                    modifier = Modifier
                        .padding(8.dp)
                        .padding(bottom = 16.dp)
                        .border(2.dp, accentColor.copy(alpha = 0.3f))
                        .fillMaxWidth()
                ) {
                    Text(
                        modifier = Modifier.padding(8.dp),
                        text = buildAnnotatedString {
                            withStyle(
                                SpanStyle(
                                    color = accentColor,
                                    fontWeight = FontWeight.Bold
                                )
                            ) {
                                append("Solocards")
                            }

                            append(" is a new and modern app to manage flashcards. Make cards in seconds, play 5 customizable modes and even write ")

                            withStyle(
                                SpanStyle(
                                    fontWeight = FontWeight.Bold
                                )
                            ) {
                                append("scripts")
                            }

                            append(" to automize the card creation process")
                        }
                    )
                }


                ScreenshotPager(
                    modifier = Modifier.fillMaxWidth(),
                    screenshots = screenshots
                )

                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    text = "The app's role",
                    fontSize = 24.sp,
                    color = normalBlueGreen.copy(0.8f),
                    fontWeight = FontWeight.SemiBold,
                    textAlign = TextAlign.Center,
                )

                RectangularTextBlock(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    color = normalBlueGreen,
                    titles = listOf(
                        "What are flashcards?",
                        "What problems it solves?",
                        "App properties"
                    ),
                    texts = listOf(
                        "Flashcard is just a piece of paper that contains question and answer on the other sides. Take the first card, read the question and think of the answer in your head — this is the most common use case",
                        "Solocards allows you creating and using cards easily in a digital form with highly customizable gameplay",
                        "This app is lightweight and offline-first. Supports dark/light theme, has flip/transition animations and green-accent Material 3 design"
                    )
                )

                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp),
                    text = "Scripting feature",
                    fontSize = 24.sp,
                    color = normalCyanGreen.copy(0.8f),
                    fontWeight = FontWeight.SemiBold,
                    textAlign = TextAlign.Center,
                )

                RectangularTextBlock(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    color = normalCyanGreen,
                    titles = listOf(
                        AnnotatedString("Real world example"),
                        AnnotatedString("The solution"),
                        AnnotatedString("Scripting time")
                    ),
                    texts = listOf(
                        AnnotatedString("Imagine you want to create a quiz with multiplication table. But you don't want to create over 50 cards for every multiplication"),

                        buildAnnotatedString {
                            append("Instead, you can create just a single card with question:  ")

                            withStyle(SpanStyle(fontFamily = FontFamily.Monospace)) {
                                append("«What\u00A0is\u00A0{A} times {B}»")
                            }

                            append(", where {A} and {B} are random numbers generated from a script")
                        },

                        buildAnnotatedString {
                            appendLine("Let's A and B hold a random value from 1 to 10. The C variable will hold the answer (their product). To generate these numbers, simply write this script:")

                            withStyle(
                                SpanStyle(
                                    fontFamily = FontFamily.Monospace,
                                    fontWeight = FontWeight.SemiBold,
                                    fontSize = 12.sp,
                                    color = Color(
                                        0xFFBEFFEB
                                    )
                                )
                            ) {
                                appendLine("\nA = rand(1, 10)")
                                appendLine("B = rand(1, 10)")
                                append("C = A * B")
                            }
                        }
                    )
                )

                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp),
                    text = "Applied skills",
                    fontSize = 24.sp,
                    color = normalBlue,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.SemiBold,
                )

                RectangularTextBlock(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    color = normalBlue,
                    titles = listOf(
                        "Clean architecture",
                        "MVI architecture",
                        "Dependency injection",
                        "Native local storage",
                        "Cloud storage & Auth",
                        "Reactive programming",
                        "User validation",
                        "Unit tests"
                    ),
                    texts = listOf(
                        "Use cases & Vertical Slicing",
                        "Composable are primarily stateless",
                        "Using Koin framework",
                        "With Room database",
                        "With Firebase platform",
                        "Using cold & hot flows",
                        "With Toasts & Snackbars",
                        "Testing the Scripting feature"
                    )
                )

                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp),
                    text = "Why Solocards",
                    fontSize = 24.sp,
                    color = normalGreen,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.SemiBold,
                )

                RectangularTextBlock(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    color = normalGreen,
                    titles = listOf(
                        "Scripts",
                        "Fast editor",
                        "Mixed mode",
                    ),
                    texts = listOf(
                        "They are very useful in technical subjects such as math, physics and programming",
                        "Create cards in few clicks with a smooth UI and animations",
                        "Mix multiple modes in one single session. Modify the parameters such as allowed mode, show answer when incorrect, swap questions & answer, and so on.",
                    )
                )
            }
        }
    }
}