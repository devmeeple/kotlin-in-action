package ch05.MemberReferences1

data class Person(
    val name: String,
    val age: Int,
)

fun main() {
    val createPerson = ::Person
    val p = createPerson("Alice", 29)
    
    println(p)
}