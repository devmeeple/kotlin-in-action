class Calculator {
    fun parse(s: String): Int {
        val (a, op, b) = s.split(" ")
        return when (op) {
            "*" -> a.toInt() * b.toInt()
            "/" -> a.toInt() / b.toInt()
            else -> throw IllegalArgumentException("유효하지 않은 연산자입니다")
        }
    }
}
