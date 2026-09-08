package com.rombsquare.portfolio.sections.skills

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rombsquare.portfolio.sections.skills.components.SkillItem
import com.rombsquare.portfolio.theme.greenishWhite
import com.rombsquare.portfolio.utils.rememberScreenSize
import org.jetbrains.compose.resources.DrawableResource
import portfolio.shared.generated.resources.Res
import portfolio.shared.generated.resources.ai
import portfolio.shared.generated.resources.android
import portfolio.shared.generated.resources.book
import portfolio.shared.generated.resources.bricks
import portfolio.shared.generated.resources.brush
import portfolio.shared.generated.resources.canvas
import portfolio.shared.generated.resources.chess
import portfolio.shared.generated.resources.cup
import portfolio.shared.generated.resources.desktop
import portfolio.shared.generated.resources.devices
import portfolio.shared.generated.resources.firebase
import portfolio.shared.generated.resources.fix
import portfolio.shared.generated.resources.info
import portfolio.shared.generated.resources.iot
import portfolio.shared.generated.resources.kotlin
import portfolio.shared.generated.resources.paper
import portfolio.shared.generated.resources.services

data class SkillUnit(
    val title: String,
    val descr: String,
    val icon: DrawableResource
)

val skills = listOf(
    SkillUnit("Native Android app with Compose", "Max performance & Small APK size", Res.drawable.android),
    SkillUnit("Cross platform app for Desktop/Web with CMP", "Simultaneously, this app will stay native for Android", Res.drawable.devices),
    SkillUnit("Apps with Ktor backend", "Retrofit I support as well", Res.drawable.kotlin),
    SkillUnit("Firebase-integrated projects", "Firebase Auth, Firestore, Real-time database, Pushing notifications", Res.drawable.firebase),
    SkillUnit("Migrating XML/Java into Compose", "Making legacy code non-legacy", Res.drawable.cup),
    SkillUnit("Migrating Compose into Desktop/Web", "Making current codebase cross platform across multiple devices", Res.drawable.desktop),
    SkillUnit("Improve or fix UX/UI design", "Following Material 3 guidelines", Res.drawable.brush),
    SkillUnit("Mobile / Cross Platform Frontend", "Implement your design from scratch", Res.drawable.paper),
    SkillUnit("Making custom animations & components", "With Compose's Canvas I can do anything", Res.drawable.canvas),
    SkillUnit("Refactor/Fix app", "Fixing Android, UI and state management bugs", Res.drawable.fix),
    SkillUnit("AI integration", "Using Firebase AI or other APIs", Res.drawable.ai),
)

val projectTypes = listOf(
    SkillUnit("On-Demand Service App", "Apps for small/medium businesses that want to attract more users", Res.drawable.services),
    SkillUnit("Company Page App", "Apps/websites that display the company information or portfolio", Res.drawable.info),
    SkillUnit("MVP Fullstack App", "I can implement the core/essential features for various types of apps", Res.drawable.bricks),
    SkillUnit("IoT Companion App", "Apps that control home devices via Wi-Fi or Bluetooth", Res.drawable.iot),
    SkillUnit("EdTech App", "Interactive learning apps, bite-sized lessons", Res.drawable.book),
    SkillUnit("Board Game & Abstract Strategy", "Games that don't require complex graphics & physics (such as Chess)", Res.drawable.chess),
)

@Composable
fun Skills() {
    val isMobile = rememberScreenSize().width < 1000.dp

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

        LazyVerticalGrid(
            modifier = Modifier.heightIn(max = 10000.dp),
            columns = GridCells.Fixed(
                if (isMobile) 1 else 2
            ),
            contentPadding = PaddingValues(8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        )  {
            items(skills) { skill ->
                SkillItem(skill.title, skill.descr, skill.icon)
            }
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

        LazyVerticalGrid(
            modifier = Modifier.heightIn(max = 10000.dp),
            columns = GridCells.Fixed(
                if (isMobile) 1 else 2
            ),
            contentPadding = PaddingValues(8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        )  {
            items(projectTypes) { projectType ->
                SkillItem(projectType.title, projectType.descr, projectType.icon)
            }
        }
        Spacer(Modifier.height(20.dp))
    }
}

