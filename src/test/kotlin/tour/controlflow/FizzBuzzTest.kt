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

        When("5로 나누어지는 숫자는") {
            Then("[buzz]라는 단어로 변경한다") {
                fizzBuzz(5) shouldBe "buzz"
            }
        }

        When("[공배수] 3과 5로 나누어지는 숫자는") {
            Then("[fizzbuzz]라는 단어로 변경한다") {
                fizzBuzz(15) shouldBe "fizzbuzz"
            }
        }
    }
})

fun fizzBuzz(number: Int): String {
    return when {
        number % 15 == 0 -> "fizzbuzz"
        number % 5 == 0 -> "buzz"
        number % 3 == 0 -> "fizz"
        else -> number.toString()
    }
}
