package ch07.ExtendingTypesWithoutTheSafecallOperatorExtensionsForNullableTypes

fun verifyUserInput(input: String?) {
    if (input.isNullOrBlank()) {
        println("Please fill in the required fields")
    }
}

fun main() {
    verifyUserInput(" ")
    verifyUserInput(null)
}