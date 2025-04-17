package action.ch08.KotlinMakesNumberConversionsExplicit

fun main() {
    val x = 1
    println(x.toLong() in listOf(1L, 2L, 3L))
}