package start.ch03

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class OperationEx2 : BehaviorSpec({
    Given("실수 값 3개가 주어졌을 때") {
        val numD1 = 1.5
        val numD2 = 2.5
        val numD3 = 3.5

        When("총합과 평균을 계산하면") {
            val sum = numD1 + numD2 + numD3
            val average = sum / 3

            Then("총합을 반환한다") {
                sum shouldBe 7.5
            }

            Then("평균을 반환한다") {
                average shouldBe 2.5
            }
        }
    }
})