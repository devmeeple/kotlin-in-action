package action.ch02

import ch02.colors.Color.*

fun measureColor() = ORANGE

fun getWarmthFromSensor(): String {
    val color = measureColor()
    return when (color) {
        RED, ORANGE, YELLOW ->
            "warm (red = ${color.r})"

        GREEN ->
            "neutral (green = ${color.g})"

        BLUE, INDIGO, VIOLET ->
            "cold (blue = ${color.b})"
    }
}

fun main() {
    println(getWarmthFromSensor())
}