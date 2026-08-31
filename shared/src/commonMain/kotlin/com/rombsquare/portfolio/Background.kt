package com.rombsquare.portfolio

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.rotate
import kotlin.math.max
import kotlin.math.sqrt

val accentColor = Color(0xFF30D753)
val accentColor2 = Color(0xFF16EAB9)
const val squareWidth = 200f
const val squarePadding = 8f
const val squareSpace = squareWidth + squarePadding

fun DrawScope.drawIntroBackground(
    bgOffset: Float,
) {
    val w = size.width
    val h = size.height
    val longestSide = max(w, h)
    val diagonal = sqrt(w*w + h*h)

    val squareCountX = (diagonal / squareSpace).toInt()*2+1
    val squareCountY = (diagonal / squareSpace).toInt()*2+1

    val gridWidth = squareCountX * squareSpace
    val gridHeight = squareCountY * squareSpace
    val gridCenter = Offset(gridWidth/2, gridHeight/2)

    drawRect(
        color = Color.Black,
        size = size
    )

    rotate(
        degrees = 45f,
        pivot = center
    ) {
        repeat(squareCountX) { x ->
            repeat(squareCountY) { y ->
                val x = x - squareCountX/2
                val y = y - squareCountX/2

                val extraPadding = if ((x+y)%3 == 0) 0f else 0f

                val squarePos = Offset(
                    x = squareSpace*x + bgOffset%squareSpace + extraPadding/2,
                    y = squareSpace*y + bgOffset%squareSpace + extraPadding/2,
                )

                val mask = Color.White

                drawRect(
                    color = mask,
                    topLeft = squarePos,
                    size = Size(squareWidth - extraPadding, squareWidth - extraPadding),
                )
            }
        }
    }


    drawRect(
        brush = Brush.horizontalGradient(listOf(accentColor, accentColor2)),
        blendMode = BlendMode.Multiply,
        size = size
    )
}