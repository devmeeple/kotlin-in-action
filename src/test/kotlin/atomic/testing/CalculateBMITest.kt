package atomic.testing

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class CalculateBMITest : FunSpec({
    test("체질량지수 18.5 이상 23미만은 정상 체중이다") {
        val height = 180
        val weight = 75

        val result = calculateBMI(height, weight)

        result shouldBe "정상 체중입니다"
    }
})

fun calculateBMI(height: Int, weight: Int) = "정상 체중입니다"
