package ch06.SplittingCollectionsChunkedAndWindowed

fun main() {
    val temperatures = listOf(27.7, 29.8, 22.0, 35.5, 19.1)

    println(temperatures.windowed(3))
    
    println(temperatures.windowed(3) { it.sum() / it.size })
}