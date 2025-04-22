package starter.lec15

/**
 * 배열과 컬렉션을 다루는 방법
 */
fun main() {
    // Array
    val array = arrayOf(100, 200)

    for (i in array.indices) {
        println("$i ${array[i]}")
    }

    for ((idx, value) in array.withIndex()) {
        println("$idx $value")
    }

    // List
    val numbers = listOf(100, 200)
    val emptyList = emptyList<Int>()

    printNumbers(emptyList())

    println(numbers[0])

    for (number in numbers) {
        println(number)
    }

    for ((idx, value) in numbers.withIndex()) {
        println("$idx $value")
    }

    // Map
    val oldMap = mutableMapOf<Int, String>()
    oldMap[1] = "MONDAY"
    oldMap[2] = "TUESDAY"

    mapOf(1 to "MONDAY", 2 to "TUESDAY")

    for (key in oldMap.keys) {
        println(key)
        println(oldMap[key])
    }

    for ((key, value) in oldMap.entries) {
        println(key)
        println(value)
    }
}

// 타입을 추론할 수 있다면 제네릭 타입을 생략할 수 있다
private fun printNumbers(numbers: List<Int>) {

}
