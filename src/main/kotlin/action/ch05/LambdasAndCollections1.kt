package ch05.LambdasAndCollections1

data class Person(
    val name: String,
    val age: Int
)

fun main() {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    println(people.maxByOrNull { it.age })
}