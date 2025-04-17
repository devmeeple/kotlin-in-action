package ch06.HandlingSpecialCaseForCollectionsIfEmpty1

fun main() {
    val blankName = " "
    val name = "J. Doe"

    println(blankName.ifEmpty { "(unnamed)" })
    println(blankName.ifBlank { "(unnamed)" })
    println(name.ifBlank { "(unnamed)" })
}