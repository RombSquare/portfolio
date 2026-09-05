package com.rombsquare.portfolio.sections.skills

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rombsquare.portfolio.sections.top_project.RectangularTextBlock
import com.rombsquare.portfolio.theme.darkGreen
import com.rombsquare.portfolio.theme.greenishBlack
import com.rombsquare.portfolio.theme.greenishWhite
import com.rombsquare.portfolio.theme.normalBlue
import com.rombsquare.portfolio.theme.normalBlueGreen
import com.rombsquare.portfolio.theme.normalGreen

@Composable
fun Skills() {
    Surface(
        modifier = Modifier
            .fillMaxWidth(),
        color = greenishBlack,
        contentColor = greenishWhite
    ) {
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(4.dp),
                text = "S K I L L S",
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
                text = "What can I build?",
                fontSize = 24.sp,
                color = greenishWhite,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.SemiBold,
            )

            Column {
                SkillItem("Native Android app with Compose", "Max performance & Small APK size")
                SkillItem("Cross platform app for Desktop/Web with CMP", "Parallely this app will stay native for Android")
                SkillItem("Apps with Ktor backend", "Retrofit I support as well")
                SkillItem("Firebase-integrated projects", "Firebase Auth, Firestore, Real-time database, Pushing notifications")
                SkillItem("Migrating XML into Compose", "Making legacy code non-legacy")
                SkillItem("Migrating Compose into Desktop/Web", "Making current codebase cross platform across all devices")
                SkillItem("Improve or fix UX/UI design", "Following Material 3 guidelines")
                SkillItem("Mobile / Cross Platform Frontend", "Implement your design from scratch")
                SkillItem("Making custom animations & components", "With Compose's Canvas I can do anything")
                SkillItem("Refactor/Fix app", "Fixing Android, UI and state management bugs")
                SkillItem("AI integration", "Using Firebase AI or other APIs")
            }

            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp)
                    .padding(top = 40.dp),
                text = "Types of apps I build",
                fontSize = 24.sp,
                color = greenishWhite,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.SemiBold,
            )

            Column {
                SkillItem("On-Demand Service App", "Apps for small/medium businesses that want to attract more users")
                SkillItem("Company Page App", "Apps/websites that display the company information or portfolio")
                SkillItem("MVP Fullstack Apps", "I can implement the core/essential features for various types of apps")
                SkillItem("IoT Companion App", "Apps that control home devices via Wi-Fi or Bluetooth")
                SkillItem("EdTech App", "Interactive learning apps, bite-sized lessons")
                SkillItem("Board Game & Abstract Strategy", "Games that don't require complex graphics & physics (such as Chess)")
            }
            Spacer(Modifier.height(20.dp))
        }
    }
}

@Composable
fun SkillItem(
    title: String,
    descr: String,
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(120.dp)
            .padding(vertical = 8.dp, horizontal = 8.dp),
        colors = CardDefaults.cardColors(
            containerColor = greenishWhite.copy(alpha = 0.15f)
        ),
        shape = RectangleShape
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = title,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )

            Text(descr)
        }
    }
}