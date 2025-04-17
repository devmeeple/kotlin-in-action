package ch07.ProvidingDefaultValuesInNullcasesWithTheElvisOperator

fun strLenSafe(s: String?): Int = s?.length ?: 0

fun main() {
    println(strLenSafe("abc"))
    println(strLenSafe(null))
}