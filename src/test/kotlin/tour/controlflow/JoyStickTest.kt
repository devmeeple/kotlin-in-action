package tour.controlflow

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class JoyStickTest : FunSpec({
    // TODO: 2025.01.07 엣지(Edge) 케이스
    test("[Edge] 없는 버튼을 클릭하면 에러가 발생한다") {
        val button = "asdf"

        val result = shouldThrow<IllegalArgumentException> {
            onclick(button)
        }

        result.message shouldBe "[asdf] 버튼을 찾을 수 없습니다"
    }

    test("A 버튼을 클릭하면 'YES' 메시지를 출력한다") {
        val button = "A"

        val result = onclick(button)

        result shouldBe "YES"
    }

    test("B 버튼을 클릭하면 'NO' 메시지를 출력한다") {
        val button = "B"

        val result = onclick(button)

        result shouldBe "NO"
    }

    test("X 버튼을 클릭하면 'MENU' 메시지를 출력한다") {
        val button = "X"

        val result = onclick(button)

        result shouldBe "MENU"
    }

    test("Y 버튼을 클릭하면 'NOTHING' 메시지를 출력한다") {
        val button = "Y"

        val result = onclick(button)

        result shouldBe "NOTHING"
    }
})

fun onclick(button: String): String {
    val buttonEnum = Button.entries.find { it.name == button }
        ?: throw IllegalArgumentException("[$button] 버튼을 찾을 수 없습니다")
    return when (buttonEnum) {
        Button.A -> Button.A.text
        Button.B -> Button.B.text
        Button.X -> Button.X.text
        Button.Y -> Button.Y.text
    }
}

// TODO: 2025.01.07 Enum, 버튼과 값 연결을 사용한 리팩터링
enum class Button(val text: String) {
    A("YES"),
    B("NO"),
    X("MENU"),
    Y("NOTHING")
}
