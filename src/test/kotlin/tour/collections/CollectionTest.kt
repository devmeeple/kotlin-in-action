package tour.collections

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.maps.shouldContainExactly
import io.kotest.matchers.shouldBe

class CollectionTest : FunSpec({
    test("녹색과 빨간색 숫자 목록이 총 몇 개로 구성되어 있는지 구한다") {
        val greenNumbers = listOf(1, 4, 23)
        val redNumbers = listOf(17, 2)

        val result = greenNumbers.count() + redNumbers.count()

        result shouldBe 5
    }

    test("프로토콜 지원 여부를 조회한다") {
        val protocol = "smtp"
        val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")

        val result = SUPPORTED.contains(protocol)

        result shouldBe false
    }

    test("in, 프로토콜 지원 여부를 조회한다 (HINT 포함)") {
        val protocol = "smtp"
        val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")

        val result = protocol.uppercase() in SUPPORTED

        result shouldBe false
    }

    test("1부터 3까지의 정수와 값을 연결한 맵을 선언 한다") {
        val number2word = mapOf(1 to 'a', 2 to 'b', 3 to 'c')

        number2word shouldContainExactly mapOf(1 to 'a', 2 to 'b', 3 to 'c')
    }

    test("정수와 값을 연결한 맵의 값에 접근한다") {
        val number2word = mapOf(1 to "one", 2 to "two", 3 to "three")
        val n = 2

        val result = number2word[n]

        result shouldBe "two"

    }
})
