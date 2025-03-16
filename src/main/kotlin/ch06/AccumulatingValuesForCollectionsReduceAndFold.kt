package ch06.AccumulatingValuesForCollectionsReduceAndFold

fun main() {
    val list = listOf(1, 2, 3, 4)
    val summed = list.reduce { acc, element -> acc + element }
    println(summed)

    val multipled = list.reduce { acc, element -> acc * element }
    println(multipled)
}