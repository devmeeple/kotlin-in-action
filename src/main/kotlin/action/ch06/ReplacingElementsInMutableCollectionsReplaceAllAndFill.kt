package ch06.ReplacingElementsInMutableCollectionsReplaceAllAndFill

fun main() {
    val names = mutableListOf("Martin", "Samuel")
    println(names)

    names.replaceAll { it.uppercase() }
    println(names)

    names.fill("(redacted)")
    println(names)
}