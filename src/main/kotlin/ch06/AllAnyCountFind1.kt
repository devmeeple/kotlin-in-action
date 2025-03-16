package ch06.AllAnyCountFind1

fun main() {
    val list = listOf(1, 2, 3)
    println(!list.any { it == 4 })
    println(list.none { it == 4 })
}