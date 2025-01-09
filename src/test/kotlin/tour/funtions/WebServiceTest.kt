package tour.funtions

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class WebServiceTest : BehaviorSpec({
    Given("actions, prefix, id") {
        val actions = listOf("title", "year", "author")
        val prefix = "https://example.com/book-info"
        val id = 5

        When("리소스로 요청 가능한 URL을 생성한") {
            val result = generateUrlLambdaV2(prefix, id, actions)

            Then("결과를 반환한다") {
                result.first() shouldBe "https://example.com/book-info/5/title"
                result shouldBe listOf(
                    "https://example.com/book-info/5/title",
                    "https://example.com/book-info/5/year",
                    "https://example.com/book-info/5/author"
                )
            }
        }
    }
})

fun generateUrlFn(prefix: String, id: Int, actions: List<String>): String {
    return "$prefix/$id/${actions[0]}"
}

val generateUrlLambda: (String, Int, List<String>) -> String =
    { prefix, id, actions -> "$prefix/$id/${actions[0]}" }

// TODO: 2025.01.09 Collections map 함수 활용하기
val generateUrlLambdaV2: (String, Int, List<String>) -> List<String> =
    { prefix, id, actions -> actions.map { action -> "$prefix/$id/$action" } }
