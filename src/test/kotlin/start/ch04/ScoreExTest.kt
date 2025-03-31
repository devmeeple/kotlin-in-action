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

// TODO: 2025-03-31 until(~까지), 마지막 숫자가 범위에 포함되지 않는다.
private fun getGrade(score: Int): Char {
    return when (score) {
        in 90..100 -> 'A'
        in 80 until 90 -> 'B'
        in 70 until 80 -> 'C'
        in 60 until 70 -> 'D'
        else -> 'F'
    }
}