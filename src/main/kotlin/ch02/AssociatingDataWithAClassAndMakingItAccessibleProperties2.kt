package ch02.ex2

class Person(
    val name: String,
    var isStudent: Boolean,
)

fun main() {
    val person = Person("Bob", true)
    println(person.name)
    println(person.isStudent)
    person.isStudent = false
    println(person.isStudent)
}