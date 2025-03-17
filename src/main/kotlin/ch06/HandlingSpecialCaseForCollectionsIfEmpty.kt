package ch06.HandlingSpecialCaseForCollectionsIfEmpty

fun main() {
    val empty = emptyList<String>()
    val full = listOf("apple", "orange", "banana")

    println(empty.ifEmpty { listOf("no", "values", "here") })
    println(full.ifEmpty { listOf("no", "values", "here") })
}