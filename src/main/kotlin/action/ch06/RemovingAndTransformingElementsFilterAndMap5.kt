package ch06.RemovingAndTransformingElementsFilterAndMap5

fun main() {
    val numbers = mapOf(0 to "zero", 1 to "one")
    println(numbers.mapValues { it.value.uppercase() })
}