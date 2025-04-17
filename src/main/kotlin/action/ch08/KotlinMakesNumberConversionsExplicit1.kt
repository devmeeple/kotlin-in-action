package action.ch08.KotlinMakesNumberConversionsExplicit1

fun printALong(l: Long) = println(l)

fun main() {
    val b: Byte = 1
    val l = b + 1L
    printALong(42)
}
