package ch05.SyntaxForLambdaExpressions

fun main() {
    val sum = { x: Int, y: Int -> x + y }
    println(sum(1, 2))
}