package tour.controlflow

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class ConditionalExpressionTest : FunSpec({
    test("주사위를 2개를 던져 같은 숫자가 나오면 승리한다") {
        // TODO: 2025.01.06 제어할 수 없는 코드를 밀어내자. Random은 테스트하기 어렵다. 그런데 왜 항상 성공할까?
//        val firstResult = Random.nextInt(6)
//        val secondResult = Random.nextInt(6)
        // TODO: 2025.01.06 첫 번째 발자국, 랜덤이 아닌 고정된 값을 사용해서 문제를 해결한다.
        val firstResult = 3
        val secondResult = 3

        val result = compareNumber(firstResult, secondResult)

        result.message shouldBe "당신이 이겼습니다 :("
    }
})

fun compareNumber(firstResult: Int, secondResult: Int): GameResult {
    val isEqual = firstResult == secondResult
    return if (isEqual) {
        GameResult.WIN
    } else {
        GameResult.LOSE
    }

}

// TODO: 2025.01.06 Enum classes 를 사용한 개선, 값 타입?
enum class GameResult(val message: String) {
    WIN("당신이 이겼습니다 :("),
    LOSE("당신은 졌어요! 하하하 :)")
}
