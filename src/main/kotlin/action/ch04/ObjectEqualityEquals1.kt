package ch04.ObjectEqualityEquals1

class Customer(
    val name: String,
    val postalCode: Int
) {
    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Customer)
            return false
        return name == other.name && postalCode == other.postalCode
    }

    override fun toString() = "Customer(name=$name, postalCode=$postalCode)"
}

fun main() {
    val processed = hashSetOf(Customer("오현석", 4132))
    println(processed.contains(Customer("오현석", 4132)))
}