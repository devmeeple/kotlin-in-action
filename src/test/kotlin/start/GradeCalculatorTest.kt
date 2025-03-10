package start

import io.kotest.assertions.throwables.shouldThrow
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

        When("60점 이상 70점 미만은") {
            val result = calculate(69)

            Then("학점은 'D'입니다") {
                result shouldBe "학점은 D입니다"
            }
        }

        When("60점 미만은") {
            val result = calculate(59)

            Then("학점은 'F'입니다") {
                result shouldBe "학점은 F입니다"
            }
        }

        When("잘못된 입력은") {
            val result = shouldThrow<IllegalArgumentException> {
                calculate(-1)
            }

            Then("에러가 발생한다") {
                result.message shouldBe "잘못된 입력입니다: -1"
            }
        }

    }
})

fun calculate(score: Int): String {
    return when (score) {
        in 90..100 -> "학점은 A입니다"
        in 80..89 -> "학점은 B입니다"
        in 70..79 -> "학점은 C입니다"
        in 60..69 -> "학점은 D입니다"
        in 0..59 -> "학점은 F입니다"
        else -> throw IllegalArgumentException("잘못된 입력입니다: $score")
    }
}
