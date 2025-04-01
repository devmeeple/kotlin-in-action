package start.ch04

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class MovieRateExTest : BehaviorSpec({
    Given("평점을 입력했을 때") {
        When("9.0 이상이면") {
            val rating = 9.0
            val result = recommendMoviesBy(rating)
            Then("어바웃 타임을 추천한다") {
                result shouldBe "어바웃 타임"
            }
        }

        When("8.0 이상이면") {
            val rating = 8.0
            val result = recommendMoviesBy(rating)
            Then("어바웃 타임과 토이 스토리를 추천한다") {
                result shouldBe "어바웃 타임\n토이 스토리"
            }
        }

        When("7.0 이상이면") {
            val rating = 7.0
            val result = recommendMoviesBy(rating)
            Then("모든 영화를 추천한다") {
                result shouldBe "어바웃 타임\n토이 스토리\n고질라"
            }
        }
    }
})

private fun recommendMoviesBy(rating: Double): String {
    var result = ""

    if (rating <= 9) {
        result += "어바웃 타임\n"
    }
    if (rating <= 8) {
        result += "토이 스토리\n"
    }
    if (rating <= 7) {
        result += "고질라\n"
    }

    return result.trim()
}