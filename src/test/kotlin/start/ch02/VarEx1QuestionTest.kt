package start.ch02

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class VarEx1QuestionTest : BehaviorSpec({
    Given("두 숫자가 주어졌을 때") {
        val num1 = 4
        val num2 = 3

        When("두 숫자를 더하면") {
            val result = num1 + num2

            Then("합을 반환한다") {
                result shouldBe 7
            }
        }
    }
})