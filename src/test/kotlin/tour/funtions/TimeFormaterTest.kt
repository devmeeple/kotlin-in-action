package tour.funtions

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class TimeFormaterTest : BehaviorSpec({
    Given("hours, minutes, seconds") {
        val hours = 1
        val minutes = 20
        val seconds = 15

        When("시, 분, 초로 주어진 시간을 초로 변환한") {
            val result = intervalInSeconds(hours, minutes, seconds)

            Then("결과를 반환한다") {
                result shouldBe 4815
            }
        }
    }
})

fun intervalInSeconds(hours: Int, minutes: Int, seconds: Int): Int {
    return (hours * 60 * 60) + (minutes * 60) + seconds
}
