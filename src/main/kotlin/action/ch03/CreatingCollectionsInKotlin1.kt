package action.ch03

fun main() {
    val strings = listOf("first", "second", "fourteenth")

    strings.last()

    println(strings.shuffled())

    val numbers = setOf(1, 14, 2)
    println(numbers.sum())
}