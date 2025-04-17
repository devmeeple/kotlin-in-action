package ch04.DataClassCopy

data class Customer(
    val name: String,
    val postalCode: Int
)

fun main() {
    val lee = Customer("이계영", 4122)
    println(lee.copy(postalCode = 4000))
}