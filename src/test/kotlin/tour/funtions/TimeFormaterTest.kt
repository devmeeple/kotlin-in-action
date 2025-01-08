package tour.funtions

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class TimeFormaterTest : BehaviorSpec({
    Given("hours, minutes, seconds") {
        val hours = 1
        val minutes = 20
        val seconds = 15

        When("시, 분, 초로 주어진 시간을 할당하면") {
            val result = intervalInSeconds(hours, minutes, seconds)

            Then("초로 변환한 결과를 반환한다") {
                result shouldBe 4815
            }
        }

        When("시간만 할당한 경우") {
            val result = intervalInSeconds(hours = 2)

            Then("분, 초는 0을 할당하고 변환한 결과를 반환한다") {
                result shouldBe 7200
            }
        }

        When("시, 초만 할당한 경우") {
            val result = intervalInSeconds(hours = 1, seconds = 1)

            Then("분은 0으로 할당하고 변환된 결과를 반환한다") {
                result shouldBe 3601
            }
        }

        When("분만 할당한 경우") {
            val result = intervalInSeconds(minutes = 10)

            Then("시, 초는 0으로 할당하고 변환한 결과를 반환한다") {
                result shouldBe 600
            }
        }

        When("분과 초만 할당한 경우") {
            val result = intervalInSeconds(minutes = 1, seconds = 25)

            Then("시간은 0으로 할당하고 변환한 결과를 반환한다") {
                result shouldBe 85
            }
        }

    }
})

fun intervalInSeconds(hours: Int = 0, minutes: Int = 0, seconds: Int = 0): Int {
    return (hours * 60 * 60) + (minutes * 60) + seconds
}
