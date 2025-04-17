package ch06.MergingCollectionsZip2

fun main() {
    val names = listOf("Joe", "Mary", "Jamie")
    val ages = listOf(22, 31, 31, 44, 0)
    val countries = listOf("DE", "NL", "US")

    println(names zip ages zip countries)
}