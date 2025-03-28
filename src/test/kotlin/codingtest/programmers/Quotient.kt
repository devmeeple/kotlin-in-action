package codingtest.programmers

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class Quotient : BehaviorSpec({
    Given("정수 매개변수 2개가 주어질 때") {
        val num1 = 10
        val num2 = 5

        When("num1을 num2로 나눈") {
            val result = num1 / num2

            Then("몫을 반환한다") {
                result shouldBe 2
            }
        }
    }
})