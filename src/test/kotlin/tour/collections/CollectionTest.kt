package tour.collections

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class CollectionTest : FunSpec({
    test("녹색과 빨간색 숫자 목록이 총 몇개로 구성되어있는지 구한다") {
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
})
