package atomic.testing

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import kotlin.math.pow

class BMICalculatorTest : FunSpec({
    test("체질량지수 18.5 이상 23미만은 정상 체중이다") {
        val height = 170
        val weight = 65

        val result = getBMI(height, weight)

        result shouldBe "정상 체중입니다"
    }

    test("체질량지수 18.5 미만은 저체중이다") {
        val height = 180
        val weight = 50

        val result = getBMI(height, weight)

        result shouldBe "저체중입니다"
    }

    test("체질량지수 23 이상은 과체중이다") {
        val height = 160
        val weight = 68

        val result = getBMI(height, weight)

        result shouldBe "과체중입니다"
    }
})

fun getBMI(height: Int, weight: Int): String {
    val bmi = calculateBMI(height, weight)

    return when {
        isUnderweight(bmi) -> "저체중입니다"
        isNormal(bmi) -> "정상 체중입니다"
        else -> "과체중입니다"
    }
}

private fun calculateBMI(height: Int, weight: Int): Double {
    val meter = convertCentimeterToMeter(height)
    return weight / meter.pow(2)
}

private fun convertCentimeterToMeter(height: Int) = height / 100.0

private fun isNormal(bmi: Double) = bmi < 23

private fun isUnderweight(bmi: Double) = bmi < 18.5
