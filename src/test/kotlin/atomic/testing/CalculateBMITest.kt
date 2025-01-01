package atomic.testing

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class CalculateBMITest : FunSpec({
    test("체질량지수 18.5 이상 23미만은 정상 체중이다") {
        val height = 170
        val weight = 65

        val result = calculateBMI(height, weight)

        result shouldBe "정상 체중입니다"
    }

    test("체질량지수 18.5 미만은 저체중이다") {
        val height = 180
        val weight = 50

        val result = calculateBMI(height, weight)

        result shouldBe "저체중입니다"
    }

    test("체질량지수 23 이상은 과체중이다") {
        val height = 160
        val weight = 68

        val result = calculateBMI(height, weight)

        result shouldBe "과체중입니다"
    }
})

fun calculateBMI(height: Int, weight: Int): String {
    val meter = height / 100.0
    val bmi = weight / (meter * meter)

    return if (bmi < 18.5) "저체중입니다"
    else if (bmi < 23) "정상 체중입니다"
    else "과체중입니다"
}
