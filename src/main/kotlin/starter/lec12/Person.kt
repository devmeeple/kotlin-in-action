package starter.lec12

fun main() {
    println(Singleton.a)
    Singleton.a += 10
    println(Singleton.a)
}

class Person private constructor(
    private val name: String,
    private val age: Int,
) {

    companion object Factory {
        private const val MIN_AGE = 1

        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }
    }
}

object Singleton {
    var a: Int = 0
}