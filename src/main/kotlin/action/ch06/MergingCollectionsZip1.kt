package ch06.MergingCollectionsZip1

fun main() {
    val names = listOf("Joe", "Mary", "Jamie")
    val ages = listOf(22, 31, 31, 44, 0)

    println(names zip ages)
}