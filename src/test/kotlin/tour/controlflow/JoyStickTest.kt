package tour.controlflow

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class JoyStickTest : FunSpec({
    // TODO: 2025.01.07 엣지(Edge) 케이스
    test("[Edge] 없는 버튼을 클릭하면 에러가 발생한다") {
        val button = "asdf"

        val result = shouldThrow<IllegalArgumentException> {
            showActionMessage(button)
        }

        result.message shouldBe "[asdf] 버튼을 찾을 수 없습니다"
    }

    test("A 버튼을 클릭하면 'YES' 메시지를 출력한다") {
        val button = "A"

        val result = showActionMessage(button)

        result shouldBe "YES"
    }

    test("B 버튼을 클릭하면 'NO' 메시지를 출력한다") {
        val button = "B"

        val result = showActionMessage(button)

        result shouldBe "NO"
    }

    test("X 버튼을 클릭하면 'MENU' 메시지를 출력한다") {
        val button = "X"

        val result = showActionMessage(button)

        result shouldBe "MENU"
    }

    test("Y 버튼을 클릭하면 'NOTHING' 메시지를 출력한다") {
        val button = "Y"

        val result = showActionMessage(button)

        result shouldBe "NOTHING"
    }
})

fun showActionMessage(button: String): String {
    return when (button) {
        "A" -> "YES"
        "B" -> "NO"
        "X" -> "MENU"
        "Y" -> "NOTHING"
        else -> throw IllegalArgumentException("[${button}] 버튼을 찾을 수 없습니다")
    }
}
