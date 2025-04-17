package ch06.SplittingAListToAPairOfListPartition1

data class Person(
    val name: String,
    val age: Int
)

val canBeInClub27 = { p: Person -> p.age <= 27 }

fun main() {
    val people = listOf(
        Person("Alice", 26),
        Person("Bob", 29),
        Person("Carol", 31)
    )

    val (comeIn, stayOut) = people.partition(canBeInClub27)

    println(comeIn)
    println(stayOut)
}