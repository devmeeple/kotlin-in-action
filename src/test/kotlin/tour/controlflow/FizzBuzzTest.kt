package tour.controlflow

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class FizzBuzzTest : BehaviorSpec({
    Given("숫자가 주어질 때") {
        When("3으로 나누어지는 숫자는") {
            Then("[fizz]라는 단어로 변경한다") {
                fizzBuzz(3) shouldBe "fizz"
            }
        }
    }
})

fun fizzBuzz(number: Int): String {
    return when {
        number % 3 == 0 -> "fizz"
        else -> number.toString()
    }
}
