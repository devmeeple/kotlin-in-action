package ch04.InitializingClasses

class User(
    val nickname: String,
    val isSubscribed: Boolean = true
)

fun main() {
    val alice = User("Alice")
    println(alice.isSubscribed)

    val bob = User("Bob", false)
    println(bob.isSubscribed)

    val carol = User("Carol", isSubscribed = false)
    println(carol.isSubscribed)

    val dave = User(nickname = "Dave", isSubscribed = true)
    println(dave.isSubscribed)
}