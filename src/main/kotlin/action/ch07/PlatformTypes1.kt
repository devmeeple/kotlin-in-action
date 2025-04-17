package ch07.PlatformTypes1

import action.ch07.Person

fun yellAtSafe(person: action.ch07.Person) {
    println((person.name ?: "Anyone").uppercase() + "!!!")
}

fun main() {
    yellAtSafe(action.ch07.Person(null))
}