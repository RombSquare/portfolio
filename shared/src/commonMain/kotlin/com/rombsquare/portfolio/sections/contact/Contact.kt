package com.rombsquare.portfolio.sections.contact

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rombsquare.portfolio.sections.contact.components.SquareWithIcon
import com.rombsquare.portfolio.sections.contact.components.TextWithLinks
import com.rombsquare.portfolio.theme.greenishWhite
import org.jetbrains.compose.resources.painterResource
import portfolio.shared.generated.resources.Res
import portfolio.shared.generated.resources.email
import portfolio.shared.generated.resources.github_icon
import portfolio.shared.generated.resources.linkedin
import portfolio.shared.generated.resources.telegram

@Composable
fun Contact() {
    val uriHandler = LocalUriHandler.current

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
                onClick = { uriHandler.openUri("https://github.com/RombSquare/") },
                icon = painterResource(Res.drawable.github_icon),
                contentDescription = "GitHub"
            )

            SquareWithIcon(
                onClick = { uriHandler.openUri("https://www.linkedin.com/in/volodymyr-lavrentiev-b6316334b/") },
                icon = painterResource(Res.drawable.linkedin),
                contentDescription = "LinkedIn"
            )

            val email = "cubesquareromb@gmail.com"
            val subject = "Mail to RombSquare"
            val webMailUrl = "https://mail.google.com/mail/?view=cm&fs=1&to=$email&su=$subject"

            SquareWithIcon(
                onClick = { uriHandler.openUri(webMailUrl) },
                icon = painterResource(Res.drawable.email),
                contentDescription = "Gmail"
            )

            SquareWithIcon(
                onClick = { uriHandler.openUri("https://t.me/rombsquare") },
                icon = painterResource(Res.drawable.telegram),
                contentDescription = "Telegram"
            )

            Spacer(Modifier.weight(1f))
        }

        Spacer(Modifier.height(60.dp))
        TextWithLinks()
    }
}




