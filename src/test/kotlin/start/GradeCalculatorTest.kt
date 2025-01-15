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

        When("80점 이상 90점 미만은") {
            val result = calculate(89)

            Then("학점은 'B'입니다") {
                result shouldBe "학점은 B입니다"
            }
        }

        When("70점 이상 80점 미만은") {
            val result = calculate(79)

            Then("학점은 'C'입니다") {
                result shouldBe "학점은 C입니다"
            }
        }

    }
})

fun calculate(score: Int): String {
    return when (score) {
        in 90..100 -> "학점은 A입니다"
        in 80..89 -> "학점은 B입니다"
        in 70..79 -> "학점은 C입니다"
        else -> "학점은 F입니다."
    }
}
