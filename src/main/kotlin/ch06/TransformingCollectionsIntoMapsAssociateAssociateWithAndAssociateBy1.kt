package ch06.TransformingCollectionsIntoMapsAssociateAssociateWithAndAssociateBy1

data class Person(
    val name: String,
    val age: Int
)

fun main() {
    val people = listOf(
        Person("Joe", 22),
        Person("Mary", 31),
        Person("Jamie", 22)
    )
    val personToAge = people.associateWith { it.age }
    println(personToAge)

    val ageToPerson = people.associateBy { it.age }
    println(ageToPerson)
}