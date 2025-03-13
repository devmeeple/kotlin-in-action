package ch04.StringRepresentationToString

class Customer(
    val name: String,
    val postalCode: Int
) {
    override fun toString() = "Customer(name=$name, postalCode=$postalCode)"
}
