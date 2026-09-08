package com.rombsquare.portfolio.sections.skills.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rombsquare.portfolio.theme.greenishWhite
import com.rombsquare.portfolio.theme.normalGreen
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource

@Composable
fun SkillItem(
    title: String,
    descr: String,
    icon: DrawableResource
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(140.dp)
            .padding(vertical = 8.dp, horizontal = 8.dp),
        colors = CardDefaults.cardColors(
            containerColor = greenishWhite.copy(alpha = 0.15f)
        ),
        shape = RectangleShape
    ) {
        Column(
            modifier = Modifier
                .padding(8.dp)
                .fillMaxSize(),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Center
        ) {
            Box {
                Icon(
                    modifier = Modifier
                        .padding(top = 2.dp)
                        .size(20.dp),
                    painter = painterResource(icon),
                    contentDescription = null,
                    tint = normalGreen
                )

                Text(
                    text = "     $title",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                )
            }

            Spacer(Modifier.height(8.dp))

            Text(descr)
        }
    }
}