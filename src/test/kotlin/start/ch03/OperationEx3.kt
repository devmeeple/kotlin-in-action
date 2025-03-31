package start.ch03

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class OperationEx3 : BehaviorSpec({
    Given("[합격] 학생의 점수가 주어졌을 때") {
        When("점수가 80점 이상이면") {
            val score = 80
            val result = score >= 80

            Then("합격한다") {
                result shouldBe true
            }
        }

        When("점수가 100점 이하면") {
            val score = 100
            val result = score <= 100

            Then("통과한다") {
                result shouldBe true
            }
        }
    }

    Given("[탈락] 학생의 점수가 주어졌을 때") {
        When("점수가 80점 미만이면") {
            val score = 79
            val result = score >= 80

            Then("탈락한다") {
                result shouldBe false
            }
        }

        When("점수가 100점 초과면") {
            val score = 101
            val result = score <= 100

            Then("탈락한다") {
                result shouldBe false
            }
        }
    }
})