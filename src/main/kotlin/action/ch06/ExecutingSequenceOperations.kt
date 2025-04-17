package ch06.ExecutingSequenceOperations

fun main() {
    println(
        listOf(1, 2, 3, 4).asSequence()
            .map {
                print("map($it) ")
                it * it
            }.filter {
                print("filter($it) ")
                it % 2 == 0
            }
    )

}