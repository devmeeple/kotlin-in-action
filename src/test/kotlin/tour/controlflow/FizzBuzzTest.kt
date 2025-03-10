package tour.controlflow

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class FizzBuzzTest : BehaviorSpec({
    Given("1부터 100까지의 숫자 리스트가 주어지면") {
        val results = fizzBuzz()

        When("3으로 나누어질 때") {
            Then("[fizz]라는 단어로 변경한다") {
                results[2] shouldBe "fizz"
            }
        }

        When("5로 나누어질 때") {
            Then("[buzz]라는 단어로 변경한다") {
                results[4] shouldBe "buzz"
            }
        }

        When("[공배수] 3과 5로 나누어질 때") {
            Then("[fizzbuzz]라는 단어로 변경한다") {
                results[14] shouldBe "fizzbuzz"
            }
        }

        When("3과 5로 나누어지지 않을 때") {
            Then("값을 그대로 반환한다") {
                results[0] shouldBe "1"
                results[1] shouldBe "2"
                results[3] shouldBe "4"
            }

        }
    }
})

// TODO: 2025.01.08 시작과 종료 범위 상수 선언 

private const val START = 1
private const val END = 100

// TODO: 2025.01.08 `Enum`을 사용해 추상화 리팩터링
fun fizzBuzz(): List<String> {
    return (START..END).map { number -> FizzBuzzRule.evaluate(number) }
}

enum class FizzBuzzRule(val divisor: Int, val word: String) {
    FIZZBUZZ(15, "fizzbuzz"),
    BUZZ(5, "buzz"),
    FIZZ(3, "fizz");

    // TODO: 2025.01.08 `Enum`에 직접 접근하는 정적 메서드
    /**
     * What is companion object?
     * https://medium.com/@riztech.dev/understanding-companion-objects-in-kotlin-a93f1a5880a7#:~:text=In%20Kotlin%2C%20a%20companion%20object,on%20instances%20of%20the%20class.
     */
    companion object {
        /**
         * 입력받은 숫자(number)를 가장 먼저 만족하는 FizzBuzzRule `word`를 반환한다.
         * entries: `Enum`의 모든 값을 순회한다.
         *          https://www.jetbrains.com/help/inspectopedia/EnumValuesSoftDeprecate.html
         * firstOrNull: 조건을 만족하는 첫 번째 값을 찾는다. 없으면 `null`을 반환한다.
         * ?.word: 조건에 만족하는 값이 있으면 `Enum`의 `word` 값을 가져온다. 없으면 `null`
         * ?: `number.toString()`: `null`이면 `number`를 문자열로 반환한다.
         */
        fun evaluate(number: Int): String {
            return entries.firstOrNull() { number % it.divisor == 0 }?.word ?: number.toString()
        }
    }
}
