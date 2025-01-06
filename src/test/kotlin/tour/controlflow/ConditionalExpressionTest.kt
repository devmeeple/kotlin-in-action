package tour.controlflow

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import kotlin.random.Random

class ConditionalExpressionTest : FunSpec({
    test("주사위를 2개를 던져 같은 숫자가 나오면 승리한다") {
        // TODO: 2025.01.06 제어할 수 없는 코드를 밀어내자. Random은 테스트하기 어렵다. 그런데 왜 항상 성공할까?
        val firstResult = Random.nextInt(6)
        val secondResult = Random.nextInt(6)

        val result = compareNumber(firstResult, secondResult)

        result shouldBe "당신이 이겼습니다 :("
    }
})

// TODO: 2025.01.06 문자열은 오타를 유발한다. 디버깅하기 어렵다. 값 타입으로 하는 게 좋지 않을까? Enum Classes
fun compareNumber(firstResult: Int, secondResult: Int): String {
    val isEqual = firstResult == secondResult
    return if (isEqual) {
        "당신이 이겼습니다 :("
    } else {
        "당신은 졌어요! 하하하하하 :)"
    }

}
