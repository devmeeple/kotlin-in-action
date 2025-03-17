package ch06.FlatteningNestedCollectionsFlatMapAndFlatten

data class Book(
    val title: String,
    val authors: List<String>
)

fun main() {
    val library = listOf(
        Book("Kotlin in Action", listOf("Isakova", "Elizarov", "Aigner", "Jemerov")),
        Book("Atomic Kotlin", listOf("Eckel", "Isakova")),
        Book("The Three-Body Problem", listOf("Liu"))
    )
    val authors = library.flatMap { it.authors }

    println(authors)
    println(authors.toSet())
}