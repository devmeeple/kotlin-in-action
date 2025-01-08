package tour.funtions

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe
import java.math.BigDecimal
import java.math.RoundingMode
import kotlin.math.PI

class CircleCalculatorTest : BehaviorSpec({
    Given("radius") {
        val radius = 2
        When("PI와 반지름의 제곱을 곱한") {
            val result = circleArea(radius)
            Then("원의 넓이를 반환한다") {
                result shouldBe BigDecimal("12.57")
            }
        }
    }
})

fun circleArea(radius: Int): BigDecimal {
    val area = calculate(radius)
    return BigDecimal(area).setScale(2, RoundingMode.HALF_UP)
}

private fun calculate(radius: Int): Double {
    return PI * radius * radius
}
