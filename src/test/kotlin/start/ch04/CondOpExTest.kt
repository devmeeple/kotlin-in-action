package start.ch04

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class CondOpExTest : BehaviorSpec({
    // TODO: 2025-04-02 코틀린의 삼항 연산자
    Given("두 개의 정수가 주어지면") {
        val a = 10
        val b = 20

        When("더 큰 값을") {
            val result = if (a > b) a else b

            Then("반환한다") {
                result shouldBe b
            }
        }
    }
})