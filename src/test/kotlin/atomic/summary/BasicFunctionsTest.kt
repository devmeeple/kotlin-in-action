package atomic.summary

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class BasicFunctions : FunSpec({
    test("세제곱수를 계산한다(Single-expression functions)") {
        val x = 3

        val result = cube(x)

        result shouldBe 27
    }
})

fun cube(x: Int): Int = x * x * x
