package action.ch08.CollectionsOfNullableValuesAndNullableCollections1

fun readNumbers(text: String): List<Int?> {
    val result = mutableListOf<Int?>()
    for (line in text.lineSequence()) {
        val numberOrNull = line.toIntOrNull()
        result.add(numberOrNull)
    }
    return result
}

fun addValidNumbers(numbers: List<Int?>) {
    val validNumbers = numbers.filterNotNull()
    println("Sum Of valid numbers: ${validNumbers.sum()}")
    println("Invalid numbers: ${numbers.size - validNumbers.size}")
}

fun main() {
    val input = """
        1
        abc
        42
    """.trimIndent()
    val numbers = readNumbers(input)
    addValidNumbers(numbers)
}

