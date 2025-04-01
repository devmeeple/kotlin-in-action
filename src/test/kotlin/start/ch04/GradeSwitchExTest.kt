package start.ch04

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class GradeSwitchExTest : BehaviorSpec({
    Given("학점이 주어졌을 때") {
        When("학점이 A라면") {
            val grade = "A"
            val result = getAchievementOf(grade)

            Then("탁월한 성과를 출력한다") {
                result shouldBe "탁월한 성과"
            }
        }

        When("올바르지 않은 학점이라면") {
            val grade = "Z"
            val result = getAchievementOf(grade)

            Then("잘못된 학점을 출력한다") {
                result shouldBe "잘못된 학점"
            }
        }
    }
})

private fun getAchievementOf(grade: String): String {
    return when (grade) {
        "A" -> "탁월한 성과"
        "B" -> "좋은 성과"
        "C" -> "준수한 성과"
        "D" -> "향상 필요"
        "F" -> "불합격"
        else -> "잘못된 학점"
    }
}
