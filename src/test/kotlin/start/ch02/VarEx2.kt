package start.ch02

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class VarEx2 : BehaviorSpec({
    Given("두 숫자가 주어졌을 때") {
        val num1 = 10
        val num2 = 20
        var sum = 0

        When("두 숫자를 더하면") {
            val result = num1 + num2
            sum = result

            Then("합 변수의 결과를 반환한다") {
                sum shouldBe 30
            }
        }
    }
})