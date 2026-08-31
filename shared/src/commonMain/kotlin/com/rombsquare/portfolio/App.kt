package com.rombsquare.portfolio

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rombsquare.portfolio.utils.getOrbitronFontFamily
import com.rombsquare.portfolio.utils.rememberScreenSize
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import org.jetbrains.compose.resources.painterResource
import portfolio.shared.generated.resources.Res
import portfolio.shared.generated.resources.allDrawableResources
import portfolio.shared.generated.resources.email
import portfolio.shared.generated.resources.github_icon
import portfolio.shared.generated.resources.solocards_icon
import kotlin.time.Duration.Companion.milliseconds

// ./gradlew generateComposeResClass

@Composable
fun IntroButton(
    modifier: Modifier,
    label: String,
    onClick: () -> Unit,
) {
    Box(
        modifier = modifier
            .border(
                width = 2.dp,
                color = accentColor,
            )
            .combinedClickable(
                onClick = onClick
            ),
        contentAlignment = Alignment.Center
    ) {
        Text(
            modifier = Modifier.padding(8.dp),
            text = label,
            fontWeight = FontWeight.SemiBold,
            color = accentColor
        )
    }
}

@Composable
fun Intro(
    scrollValue: Int,
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .graphicsLayer {
                alpha = (1f - scrollValue.toFloat()/200).coerceIn(0f..1f)
            }
    ) {
        Card(
            modifier = Modifier
                .padding(8.dp)
                .shadow(8.dp)
                .align(Alignment.Center),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xff222222)
            ),
            shape = RoundedCornerShape(24.dp)
        ) {
            Column(
                modifier = Modifier.padding(20.dp)
            ) {
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = buildAnnotatedString {
//                        withStyle(SpanStyle(color = accentColor)) {
//                            append("<")
//                        }

                        append("Volodymyr L.")

//                        withStyle(SpanStyle(color = accentColor)) {
//                            append(">")
//                        }
                    },
                    fontSize = 36.sp,
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Black,
                    fontFamily = FontFamily.Default
                )

                Spacer(Modifier.size(4.dp))

                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = "Android developer",
                    color = accentColor,
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center
                )

                Spacer(Modifier.size(40.dp))

                Text(
                    text = "I'm developing high-performance native Android apps with Jetpack Compose & Firebase. Build cross platform with KMP.",
                    fontFamily = FontFamily.Monospace
                )

                Spacer(Modifier.size(20.dp))

                IntroButton(
                    modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp, vertical = 4.dp),
                    label = "See top project",
                    onClick = {}
                )

                IntroButton(
                    modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp, vertical = 4.dp),
                    label = "Contact me",
                    onClick = {}
                )
            }
        }
    }
}

@Composable
fun SolocardsProject() {
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
                containerColor = Color(0xff222222)
            ),
            shape = RoundedCornerShape(
                topStart = 32.dp,
                topEnd = 32.dp,
                bottomStart = 0.dp,
                bottomEnd = 0.dp
            )
        ) {
            Column(
                modifier = Modifier.padding(20.dp)
            ) {
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = "Solocards",
                    fontSize = 28.sp,
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Black,
                    fontFamily = getOrbitronFontFamily()
                )
            }
        }

//        Surface(
//            modifier = Modifier
//                .padding(12.dp)
//                .size(60.dp)
//                .align(Alignment.BottomStart),
//            color = Color(0xee222222),
//            shape = CircleShape
//        ) {
//            Box(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(vertical = 12.dp),
//                contentAlignment = Alignment.Center
//            ) {
//                Image(
//                    modifier = Modifier.fillMaxSize(),
//                    painter = painterResource(Res.drawable.github_icon),
//                    contentDescription = "GitHub",
//                    colorFilter = ColorFilter.tint(Color.White)
//                )
//            }
//        }
//
//        Surface(
//            modifier = Modifier
//                .padding(12.dp)
//                .size(60.dp)
//                .align(Alignment.BottomEnd),
//            color = Color(0xee222222),
//            shape = CircleShape
//        ) {
//            Box(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(vertical = 12.dp),
//                contentAlignment = Alignment.Center
//            ) {
//                Image(
//                    modifier = Modifier.fillMaxSize(),
//                    painter = painterResource(Res.drawable.email),
//                    contentDescription = "GitHub",
//                    colorFilter = ColorFilter.tint(Color.White)
//                )
//            }
//        }
    }
}

@Composable
@Preview
fun App() {
    var bgOffset by remember { mutableStateOf(0f) }
    val scope = rememberCoroutineScope()

    LaunchedEffect(Unit) {
        scope.launch {
            while (scope.isActive) {
                bgOffset -= 0.4f
                delay(20.milliseconds)
            }
        }
    }

    MaterialTheme {
        val scrollState = rememberScrollState(0)
        val screenSize = rememberScreenSize()

        Surface(
            modifier = Modifier
                .fillMaxSize()
                .safeContentPadding()
                .shadow(0.dp)
                .drawBehind { drawIntroBackground(bgOffset - 0*scrollState.value/8) },
            color = Color.Transparent
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(scrollState),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Section(
                    modifier = Modifier
                        .size(screenSize),
                ) {
                    Intro(scrollState.value)
                }

                Section(
                    modifier = Modifier
                        .size(screenSize),
                ) {
                    SolocardsProject()
                }

                Section(
                    modifier = Modifier.size(screenSize),
                    color = Color(0xff222222),
                    contentColor = Color.White,
                ) {
                    Text("World")
                }

                Section(
                    modifier = Modifier.size(screenSize),
                    color = Color.Blue,
                    contentColor = Color.Black,
                ) {
                    Text("Plus")
                }
            }
        }

    }
}