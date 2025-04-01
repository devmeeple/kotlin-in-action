package start.ch04

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class EvenOddExTest : BehaviorSpec({
    Given("정수가 주어졌을 때") {
        When("짝수라면") {
            val x = 2
            val result = getOddOrEven(x)
            Then("짝수라는 결과를 반환한다") {
                result shouldBe "짝수"
            }
        }

        When("홀수라면") {
            val x = 3
            val result = getOddOrEven(x)
            Then("홀수라는 결과를 반환한다") {
                result shouldBe "홀수"
            }
        }
    }

})

private fun getOddOrEven(x: Int) = if (x % 2 == 0) "짝수" else "홀수"