package ch05.SyntaxForLambdaExpressions3

fun main() {
    val sum = { x: Int, y: Int -> println("Computing the sum of  $x to $y"); x + y }
    println(sum(1, 2))
}