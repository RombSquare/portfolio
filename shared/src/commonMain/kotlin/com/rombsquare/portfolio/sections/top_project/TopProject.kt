package com.rombsquare.portfolio.sections.top_project

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Code
import androidx.compose.material.icons.filled.Download
import androidx.compose.material.icons.filled.Videocam
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rombsquare.portfolio.sections.top_project.components.FlippableSkillCard
import com.rombsquare.portfolio.sections.top_project.components.RectangularTextBlock
import com.rombsquare.portfolio.sections.top_project.components.ScreenshotPager
import com.rombsquare.portfolio.theme.greenishWhite
import com.rombsquare.portfolio.theme.normalBlue
import com.rombsquare.portfolio.theme.normalBlueGreen
import com.rombsquare.portfolio.theme.normalCyanGreen
import com.rombsquare.portfolio.theme.normalGreen
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

val screenshots = listOf(
    Res.drawable.solocards_menu,
    Res.drawable.solocards_tags,
    Res.drawable.solocards_modes,
    Res.drawable.solocards_editor,
    Res.drawable.solocards_cloud_storage,
    Res.drawable.solocards_scripting,
    Res.drawable.solocards_sections
)

val technicalSkills = listOf(
    "Clean architecture" to "With UseCases & Vertical Slicing",
    "MVI architecture" to "Composable are primarily stateless",
    "Dependency injection" to "Using Koin framework",
    "Native local storage" to "With Room database",
    "Cloud storage & Auth" to "With Firebase platform",
    "Reactive programming" to "Using cold & hot flows",
    "User validation" to "With Toasts & Snackbars",
    "Unit tests" to "Testing the Scripting feature"
)

@Composable
fun TopProject(
    onVideo: (String) -> Unit
) {
    val uriHandler = LocalUriHandler.current

    Column(
        modifier = Modifier
            .fillMaxWidth(),
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
                .border(2.dp, normalGreen.copy(alpha = 0.3f))
                .fillMaxWidth()
        ) {
            Text(
                modifier = Modifier.padding(8.dp),
                text = buildAnnotatedString {
                    withStyle(
                        SpanStyle(
                            color = normalGreen,
                            fontWeight = FontWeight.Bold
                        )
                    ) {
                        append("Solocards")
                    }

                    append(" is my the best project made with Jetpack Compose. This app allows you manage flashcards in a simple and modern way. Make cards in seconds, play 5 customizable modes and even write ")

                    withStyle(
                        SpanStyle(
                            fontWeight = FontWeight.Bold
                        )
                    ) {
                        append("scripts")
                    }

                    append(" to automize the card creation process. Best flashcard app for math-related topics")
                }
            )
        }


        ScreenshotPager(
            modifier = Modifier.fillMaxWidth(),
            screenshots = screenshots
        )

        RectangularTextBlock(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            color = normalBlueGreen,
            titles = listOf(
                "What are flashcards?",
                "App properties"
            ),
            texts = listOf(
                "Flashcard is just a piece of paper that contains question and answer on the other sides. Take the first card, read the question and think of the answer in your head — this is the most common use case",
                "This app is lightweight and offline-first. Supports dark/light theme, has flip/transition animations and green-accent Material 3 design"
            )
        )

        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            text = "S C R I P T I N G",
            fontSize = 20.sp,
            color = normalCyanGreen.copy(0.65f),
            fontWeight = FontWeight.Bold,
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
                            fontSize = 14.sp,
                            color = Color.White
                        )
                    ) {
                        appendLine("\nA = rand(1, 10)")
                        appendLine("B = rand(1, 10)")
                        append("C = A * B")
                    }
                }
            )
        )

        TextButton(
            onClick = { onVideo("g36zEQY2LRc") }
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    modifier = Modifier
                        .size(36.dp)
                        .padding(end = 8.dp),
                    imageVector = Icons.Default.Videocam,
                    contentDescription = null,
                    tint = Color.Yellow
                )

                Text(
                    text = "Show video about scripts",
                    color = Color.Yellow
                )
            }
        }

        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            text = "W H Y   S O L O C A R D S",
            fontSize = 20.sp,
            color = normalGreen.copy(0.65f),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
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

        TextButton(
            onClick = { onVideo("cMcqVe-qeAU") }
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    modifier = Modifier
                        .size(36.dp)
                        .padding(end = 8.dp),
                    imageVector = Icons.Default.Videocam,
                    contentDescription = null,
                    tint = Color.Yellow
                )

                Text(
                    text = "Show video about CRUD functional",
                    color = Color.Yellow
                )
            }
        }

        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp),
            text = "A P P L I E D   S K I L L S",
            fontSize = 20.sp,
            color = normalBlue,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
        )

        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 20.dp),
            text = "tap to see details",
            fontSize = 16.sp,
            color = greenishWhite.copy(0.4f),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
        )

        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            FlowRow(
                horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                technicalSkills.forEach { pair ->
                    val title = pair.first
                    val descr = pair.second

                    FlippableSkillCard(title, descr)
                }
            }
        }

        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 60.dp, bottom = 16.dp),
            text = "L I N K S",
            fontSize = 20.sp,
            color = normalBlueGreen.copy(0.7f),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
        )

        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(
                modifier = Modifier
                    .widthIn(max = 400.dp)
                    .padding(horizontal = 20.dp, vertical = 4.dp)
                    .height(40.dp),
                onClick = {
                    uriHandler.openUri("https://github.com/RombSquare/Solocards/releases/latest/download/app-release.apk")
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = normalBlueGreen
                ),
                shape = RectangleShape
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxSize(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Icon(
                        imageVector = Icons.Default.Download,
                        contentDescription = null
                    )

                    Spacer(Modifier.width(8.dp))

                    Text(
                        text = "Download release",
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            Button(
                modifier = Modifier
                    .widthIn(max = 400.dp)
                    .padding(horizontal = 20.dp, vertical = 4.dp)
                    .height(40.dp),
                onClick = {
                    uriHandler.openUri("https://github.com/RombSquare/solocards")
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = normalBlueGreen
                ),
                shape = RectangleShape
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxSize(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Icon(
                        imageVector = Icons.Default.Code,
                        contentDescription = null
                    )

                    Spacer(Modifier.width(8.dp))

                    Text(
                        text = "See source code",
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }

        Spacer(Modifier.height(40.dp))
    }
}
