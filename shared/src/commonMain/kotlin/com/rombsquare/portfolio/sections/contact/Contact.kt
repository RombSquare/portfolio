package com.rombsquare.portfolio.sections.contact

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rombsquare.portfolio.theme.greenishBlack
import com.rombsquare.portfolio.theme.greenishWhite
import com.rombsquare.portfolio.theme.normalGreen
import com.rombsquare.portfolio.theme.veryDarkGreen
import org.jetbrains.compose.resources.painterResource
import portfolio.shared.generated.resources.Res
import portfolio.shared.generated.resources.email
import portfolio.shared.generated.resources.github_icon
import portfolio.shared.generated.resources.linkedin
import portfolio.shared.generated.resources.telegram

@Composable
fun Contact() {
    Surface(
        modifier = Modifier
            .fillMaxWidth(),
        color = veryDarkGreen,
        contentColor = greenishWhite
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
                .padding(bottom = 16.dp)
        ) {
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(4.dp),
                text = "C O N T A C T",
                fontSize = 16.sp,
                color = greenishWhite.copy(0.4f),
                textAlign = TextAlign.Right,
                fontWeight = FontWeight.Black,
            )

            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp)
                    .padding(top = 40.dp),
                text = "My contact info",
                fontSize = 24.sp,
                color = greenishWhite,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.SemiBold,
            )

            Text("If you or your organisation needs an app (or fix the existing one), feel free to DM me!")

            Spacer(Modifier.height(20.dp))

            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Spacer(Modifier.weight(1f))

                SquareWithIcon(
                    onClick = {},
                    icon = painterResource(Res.drawable.github_icon),
                    contentDescription = "GitHub"
                )

                SquareWithIcon(
                    onClick = {},
                    icon = painterResource(Res.drawable.linkedin),
                    contentDescription = "LinkedIn"
                )

                SquareWithIcon(
                    onClick = {},
                    icon = painterResource(Res.drawable.email),
                    contentDescription = "Gmail"
                )

                SquareWithIcon(
                    onClick = {},
                    icon = painterResource(Res.drawable.telegram),
                    contentDescription = "Telegram"
                )

                Spacer(Modifier.weight(1f))
            }
        }
    }
}


@Composable
fun SquareWithIcon(
    onClick: () -> Unit,
    icon: Painter,
    contentDescription: String,
) {
    Box(
        modifier = Modifier
            .size(44.dp)
            .background(greenishWhite.copy(alpha = 0.15f)),
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