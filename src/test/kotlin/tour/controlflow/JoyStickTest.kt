package tour.controlflow

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class JoyStickTest : FunSpec({
    // TODO: 2025.01.07 엣지(Edge) 케이스
    test("없는 버튼을 클릭하면 에러가 발생한다") {
        val button = "X"

        val result = shouldThrow<IllegalArgumentException> {
            showActionMessage(button)
        }

        result.message shouldBe "[X] 버튼을 찾을 수 없습니다"
    }
})

fun showActionMessage(button: String) {
    throw IllegalArgumentException("[${button}] 버튼을 찾을 수 없습니다")
}
