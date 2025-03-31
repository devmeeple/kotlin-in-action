package start.ch04

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class ScoreExTest : BehaviorSpec({
    Given("학생 점수가 주어졌을 때") {
        When("90점 이상이면") {
            val score = 90
            val result = getGrade(score)

            Then("학점 A를 반환한다") {
                result shouldBe 'A'
            }
        }

        When("80점 이상이면") {
            val score = 80
            val result = getGrade(score)

            Then("학점 A를 반환한다") {
                result shouldBe 'B'
            }
        }

        When("70점 이상이면") {
            val score = 70
            val result = getGrade(score)

            Then("학점 A를 반환한다") {
                result shouldBe 'C'
            }
        }

        When("60점 이상이면") {
            val score = 60
            val result = getGrade(score)

            Then("학점 A를 반환한다") {
                result shouldBe 'D'
            }
        }

        When("60점 미만이면") {
            val score = 59
            val result = getGrade(score)

            Then("학점 A를 반환한다") {
                result shouldBe 'F'
            }
        }
    }
})

private fun getGrade(score: Int): Char {
    return when {
        score >= 90 -> 'A'
        score >= 80 -> 'B'
        score >= 70 -> 'C'
        score >= 60 -> 'D'
        else -> 'F'
    }
}