package tour.practice

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.types.shouldBeInstanceOf

class BasicTypeTest : FunSpec({
    test("변수의 타입을 명시적으로 선언한다(declare)") {
        val int: Int = 1000
        val string: String = "String"
        val pi: Double = 3.14
        val bigint: Long = 100_100_000_000_000
        val bool: Boolean = false
        val char: Char = '\n'

        int.shouldBeInstanceOf<Int>()
        string.shouldBeInstanceOf<String>()
        pi.shouldBeInstanceOf<Double>()
        bigint.shouldBeInstanceOf<Long>()
        bool.shouldBeInstanceOf<Boolean>()
        char.shouldBeInstanceOf<Char>()
    }
})
