package ch07.MakingPromisesToTheCompilerWithTheNotNullAssertionOperator

fun ignoreNulls(str: String?) {
    val strNotNull: String = str!!
    println(strNotNull.length)
}

fun main() {
    ignoreNulls(null)
}