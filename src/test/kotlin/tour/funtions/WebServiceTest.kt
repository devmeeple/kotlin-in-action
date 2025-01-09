package tour.funtions

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class WebServiceTest : BehaviorSpec({
    Given("actions, prefix, id") {
        val actions = listOf("title", "year", "author")
        val prefix = "https://example.com/book-info"
        val id = 5

        When("리소스로 요청 가능한 URL을 생성한") {
            val result = generateUrlFn(prefix, id, actions)

            Then("결과를 반환한다") {
                result shouldBe "https://example.com/book-info/5/title"
            }
        }
    }
})

fun generateUrlFn(prefix: String, id: Int, actions: List<String>): String {
    return "$prefix/$id/${actions[0]}"
}
