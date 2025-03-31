package start.ch03

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class OperationEX1 : BehaviorSpec({
    Given("정수 값 3개가 주어졌을 때") {
        val num1 = 10
        val num2 = 20
        val num3 = 30

        When("총합과 평균을 계산하면") {
            val sum = num1 + num2 + num3
            val average = sum / 3

            Then("총합은 60이어야 한다") {
                sum shouldBe 60
            }

            Then("평균은 20이어야 한다") {
                average shouldBe 20
            }
        }
    }
})