package tour

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class WelcomeToHellTest : FunSpec({
    test("지옥에 오신 걸 환영합니다.") {
        val message = "Welcome to Hell!"

        message shouldBe "Welcome to Hell!"
    }

    test("문자열 템플릿을 사용하여 값을 출력한다.") {
        val problems = 2

        val result = "오늘 발생한 문제는 ${problems}건입니다."

        result shouldBe "오늘 발생한 문제는 2건입니다."
    }
})
