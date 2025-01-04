package tour

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class WelcomeToHellTest : FunSpec({
    test("지옥에 오신걸 환영합니다.") {
        val message = "Welcome to Hell!"

        message shouldBe "Welcome to Hell!"
    }
})
