package start

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class GradeCalculatorTest : BehaviorSpec({
    Given("GradeCalculator") {
        When("90점 이상이라면") {
            val result = calculate(90)

            Then("학점은 'A'다") {
                result shouldBe "학점은 A입니다"
            }
        }
    }
})

fun calculate(score: Int): String {
    return when (score) {
        in 90..100 -> "학점은 A입니다"
        else -> "학점은 F입니다."
    }
}
