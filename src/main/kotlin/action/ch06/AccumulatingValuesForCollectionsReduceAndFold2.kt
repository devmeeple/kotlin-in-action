package ch06.AccumulatingValuesForCollectionsReduceAndFold2

data class Person(
    val name: String,
    val age: Int
)

fun main() {
    val list = listOf(1, 2, 3, 4)
    val summed = list.runningReduce { acc, element -> acc + element }
    println(summed)

    val multiplied = list.runningReduce { acc, element -> acc * element }
    println(multiplied)

    val people = listOf(
        Person("Alex", 29),
        Person("Natalia", 28)
    )
    println(people.runningFold("") { acc, person -> acc + person.name })
}