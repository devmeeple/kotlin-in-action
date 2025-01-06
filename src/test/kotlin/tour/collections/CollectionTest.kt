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
})
