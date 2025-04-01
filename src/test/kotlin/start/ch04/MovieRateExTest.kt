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
            Then("토이 스토리를 추천한다") {
                result shouldBe "토이 스토리"
            }
        }

        When("7.0 이상이면") {
            val rating = 7.0
            val result = recommendMoviesBy(rating)
            Then("고질라를 추천한다") {
                result shouldBe "고질라"
            }
        }
    }
})

private fun recommendMoviesBy(rating: Double): String {
    return when {
        rating >= 9 -> "어바웃 타임"
        rating >= 8 -> "토이 스토리"
        rating >= 7 -> "고질라"
        else -> throw IllegalArgumentException("제공하지 않는 평점입니다")
    }
}