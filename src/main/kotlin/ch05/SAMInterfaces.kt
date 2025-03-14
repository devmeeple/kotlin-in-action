package ch05.SAMInterfaces

fun interface IntCondition {
    fun check(i: Int): Boolean
    fun checkString(s: String) = check(s.toInt())
    fun checkChar(c: Char) = check(c.digitToInt())
}

fun main() {
    val isOdd = IntCondition { it % 2 != 0 }
    println(isOdd.check(1))

    println(isOdd.checkString("2"))

    println(isOdd.checkChar('3'))
}