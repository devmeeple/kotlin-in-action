package ch05.MemberReferences

fun salute() = println("Salute!")

fun main() {
    run(::salute)
}