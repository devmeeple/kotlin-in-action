package ch07.CombiningNullchecksAndMethodCallsWithTheSafeCallOperator

fun printAllCaps(str: String?) {
    val allCaps: String? = str?.uppercase()
    println(allCaps)
}

fun main() {
    printAllCaps("abc")
    printAllCaps(null)
}