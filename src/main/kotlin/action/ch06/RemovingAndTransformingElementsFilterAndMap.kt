package ch06.RemovingAndTransformingElementsFilterAndMap

fun main() {
    val list = listOf(1, 2, 3, 4)
    println(list.filter { it % 2 == 0 })
}