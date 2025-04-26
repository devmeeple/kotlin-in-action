package action.ch08.KotlinCollectionsAndJavaCollectionsAreDeeplyRelated1

import action.ch08.CollectionUtils

// 코틀린 코드
// collections.kt
fun printInUppercase(list: List<String>) {
    println(CollectionUtils.uppercaseAll(list))
    println(list.first())
}

fun main() {
    val list = listOf("a", "b", "c")
    printInUppercase(list)
}