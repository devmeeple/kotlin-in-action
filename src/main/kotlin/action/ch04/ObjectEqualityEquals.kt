package ch04.ObjectEqualityEquals

class Customer(
    val name: String,
    val postalCode: Int
)

fun main() {
    val customer1 = Customer("Alice", 342562)
    val customer2 = Customer("Alice", 342562)
    
    println(customer1 == customer2)
}