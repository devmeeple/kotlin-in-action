package start.ch04

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class ExchangeRateExTest : BehaviorSpec({
    Given("환전에 필요한 달러가 주여졌을 때") {
        When("달러가 0미만이면") {
            val dollar = -1

            Then("잘못된 금액이면 예외가 발생해야 한다") {
                val exception = shouldThrow<IllegalArgumentException> {
                    exchangeRateOf(dollar)
                }
                exception.message shouldBe "잘못된 금액입니다"
            }
        }

        When("달러가 0이면") {
            val dollar = 0
            val result = exchangeRateOf(dollar)

            Then("환전할 금액이 없다") {
                result shouldBe "환전할 금액이 없습니다"

            }
        }

        When("달러가 0이상이면") {
            val dollar = 10
            val result = exchangeRateOf(dollar)

            Then("환전 금액을 반환한다") {
                result shouldBe "13000"
            }
        }
    }
})

private fun exchangeRateOf(dollar: Int): String {
    val won = 1300
    return when {
        dollar < 0 -> throw IllegalArgumentException("잘못된 금액입니다")
        dollar == 0 -> "환전할 금액이 없습니다"
        else -> "${dollar * won}"
    }
}