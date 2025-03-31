package start.ch02

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class VarEx3 : BehaviorSpec({
    Given("Long 타입의 변수를 선언하고") {
        var result: Long

        When("값을 초기화 했을 때") {
            result = 10_000_000_000L

            Then("결과를 반환한다") {
                result shouldBe 10_000_000_000L
            }
        }
    }
})