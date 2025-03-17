package ch06.SplittingCollectionsChunkedAndWindowed1

fun main() {
    val temperatures = listOf(27.7, 29.8, 22.0, 35.5, 19.1)

    println(temperatures.chunked(2))

    println(temperatures.chunked(2) { it.sum() })
}