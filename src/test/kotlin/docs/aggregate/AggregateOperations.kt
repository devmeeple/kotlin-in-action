package docs.aggregate

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class AggregateOperations : BehaviorSpec({
    Given("numbers") {
        val numbers = listOf(1, 2, 3, 4, 5)

        When("element를 모두 더해") {
            val result = numbers.sum()

            Then("합계를 반환한다") {
                result shouldBe 15
            }
        }
    }
})
