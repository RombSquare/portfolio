package com.rombsquare.portfolio

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope
import com.rombsquare.portfolio.theme.normalGreen
import kotlin.math.max
import kotlin.math.sqrt

val accentColor = normalGreen
val accentColor2 = Color(0xFF16EACA)
const val squareWidth = 240f
const val squarePadding = 24f
const val squareSpace = squareWidth + squarePadding

fun DrawScope.drawIntroBackground(
    bgOffset: Float,
) {
    val w = size.width
    val h = size.height
    val longestSide = max(w, h)
    val diagonal = sqrt(w*w + h*h)

    val squareCountX = (diagonal / squareSpace).toInt()*2+2
    val squareCountY = (diagonal / squareSpace).toInt()*2+2

    val gridWidth = squareCountX * squareSpace
    val gridHeight = squareCountY * squareSpace
    val gridCenter = Offset(gridWidth/2, gridHeight/2)

    drawRect(
        color = Color.White,
        size = size
    )

//    rotate(
//        degrees = 45f,
//        pivot = center
//    ) {
//        repeat(squareCountX) { x ->
//            repeat(squareCountY) { y ->
//                val x = x - squareCountX/2
//                val y = y - squareCountX/2
//
//                val extraPadding = if ((x+y)%3 == 0) 0f else 0f
//
//                val squarePos = Offset(
//                    x = squareSpace*x + bgOffset%squareSpace + extraPadding/2,
//                    y = squareSpace*y + bgOffset%squareSpace + extraPadding/2,
//                )
//
//                val mask = Color.White
//
//                drawRect(
//                    color = mask,
//                    topLeft = squarePos,
//                    size = Size(squareWidth - extraPadding, squareWidth - extraPadding),
//                )
//            }
//        }
//    }


    drawRect(
        brush = Brush.horizontalGradient(
            listOf(accentColor.copy(alpha = 0.65f), accentColor2.copy(alpha = 0.5f))
        ),
        blendMode = BlendMode.Multiply,
        size = size
    )
}