package action.ch02

fun main() {
    val name = readln()
    println("Hello, ${if (name.isBlank()) "someone" else name}!")
}