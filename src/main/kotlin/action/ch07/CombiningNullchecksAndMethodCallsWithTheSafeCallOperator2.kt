package ch07.CombiningNullchecksAndMethodCallsWithTheSafeCallOperator2

class Adderss(
    val streetAddress: String,
    val zipCode: Int,
    val city: String,
    val country: String
)

class Company(
    val name: String,
    val address: Adderss?
)

class Person(
    val name: String,
    val company: Company?
)

fun Person.countyName(): String {
    val country = this.company?.address?.country
    return if (country != null) country else "Unknown"
}

fun main() {
    val person = Person("Dmitry", null)
    println(person.countyName())
}