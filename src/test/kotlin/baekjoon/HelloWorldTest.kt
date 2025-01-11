package baekjoon

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class HelloWorldTest : BehaviorSpec({
    Given("Hello World!") {
        val message = "Hello World!"

        When("메시지를 전달하면") {
            val result = printMessage(message)

            Then("출력한다") {
                result shouldBe "Hello World!"
            }
        }
    }
})

fun printMessage(message: String): String {
    return message
}
