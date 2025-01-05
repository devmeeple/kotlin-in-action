package tour.collections

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class ListTest : FunSpec({
    test("단체 채팅방 인원수를 조회한다") {
        val members = listOf("조영호", "로이 오셔로브", "블라디미르 코리코프")

        val result = members.count()

        result shouldBe 3
    }
})
