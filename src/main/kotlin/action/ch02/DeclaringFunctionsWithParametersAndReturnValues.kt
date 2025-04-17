package action.ch02

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun main() {
    println(action.ch02.max(1, 2))
}