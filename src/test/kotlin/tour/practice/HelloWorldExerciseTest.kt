package tour.practice

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class HelloWorldExerciseTest : FunSpec({
    test("장태근님은 향년 29세입니다") {
        val name = "장태근"
        val age = 29

        val result = "${name}님은 향년 ${age}세입니다"

        result shouldBe "장태근님은 향년 29세입니다"
    }
})
