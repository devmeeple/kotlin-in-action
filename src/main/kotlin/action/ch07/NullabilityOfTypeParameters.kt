package ch07.NullabilityOfTypeParameters

fun <T> printHashCode(t: T) {
    println(t?.hashCode())
}

fun main() {
    printHashCode(null)
}