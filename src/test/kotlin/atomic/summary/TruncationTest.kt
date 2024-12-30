package atomic.summary

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class TruncationTest : FunSpec({
    test("정수를 정수로 나누면 나머지 값은 버려진다") {
        val result = 3.0 + (2 / 5)

        result shouldBe 3.0
    }

    test("실수를 정수로 나누면 버려지지 않는다") {
        val result = 3.0 + (2.0 / 5)

        result shouldBe 3.4
    }
})
