package ch06.RemovingAndTransformingElementsFilterAndMap4

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7)
    val filtered = numbers.filterIndexed { index, element ->
        index % 2 == 0 && element > 3
    }
    println(filtered)

    val mapped = numbers.mapIndexed { index, element ->
        index + element
    }
    println(mapped)
}