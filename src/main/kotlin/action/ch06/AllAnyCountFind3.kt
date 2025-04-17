package ch06.AllAnyCountFind3

data class Person(
    val name: String,
    val age: Int
)

val canBeInClub27 = { p: Person -> p.age <= 27 }

fun main() {
    val people = listOf(Person("Alice", 27), Person("Bob", 31))
    println(people.find(canBeInClub27))
}