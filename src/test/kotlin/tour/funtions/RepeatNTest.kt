package tour.funtions

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class RepeatNTest : BehaviorSpec({
    Given("n, action") {
        val n = 5
        val action = { "Hello" }

        When("주어진 횟수를 반복하면") {
            val result = repeatN(n, action)

            Then("`text`를 `n`번 출력한다") {
                result shouldBe listOf(
                    "Hello",
                    "Hello",
                    "Hello",
                    "Hello",
                    "Hello",
                )
            }
        }
    }
})

// TODO: 2025.01.09 값으로 평가되는 action, Lambda expressions
fun repeatN(n: Int, action: () -> String): List<String> {
    return List(n) { action() }
}
